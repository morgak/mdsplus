
#include <unistd.h>

#include <mdsobjects.h>


#include "testing.h"
#include "testutils/testutils.h"
#include "testutils/unique_ptr.h"

using namespace MDSplus;
using namespace testing;

class NullEvent : public Event {
public:
    NullEvent(const char *name) : 
        Event(name) 
    {}
        
    void run()
    {
        const char *name = getName();                               //Get the name of the event
        AutoString date(unique_ptr<Uint64>(getTime())->getDate());  //Get the event reception date 
        std::cout << "RECEIVED EVENT " << name << " AT " << date.string << "\n";
    }    
};


class RawEvent:public Event
{
    std::string test_str;
public:
    RawEvent(const char *name, std::string str) : 
        Event(name),
        test_str(str)
    {}
    
    void run()
    {
        size_t bufSize;        
        const char *name = getName();                               //Get the name of the event
        const char *str = getRaw(&bufSize);                         //Get raw data
        AutoString date(unique_ptr<Uint64>(getTime())->getDate());  //Get the event reception date 
        std::cout << "RECEIVED EVENT " << name << " AT " << date.string << " WITH RAW  " << str << "\n";
        TEST1( std::string(str) == test_str );        
    }
};


class DataEvent:public Event
{
    unique_ptr<Data> test_data;
public:
    DataEvent(const char *name, Data *data) : 
        Event(name),
        test_data(data)
    {}
    
    void run()
    {        
        const char *name = getName();                               //Get the name of the event
        AutoString date(unique_ptr<Uint64>(getTime())->getDate());  //Get the event reception date 
        unique_ptr<Data> data = getData();                          //Get data
        if(data) {
            std::cout << "RECEIVED EVENT " << name << " AT " << date.string 
                      << " WITH DATA  " << AutoString(data->getString()).string 
                      << "\n";
            TEST1( AutoString(test_data->getString()).string == AutoString(data->getString()).string );
        }
    }
};

#include <errno.h>




int main(int argc, char *argv[])
{
    BEGIN_TESTING(Event);
#   ifdef _WIN32
    SKIP_TEST("Event test requires fork")
#   else 
    setenv("UDP_EVENTS","yes",1);       
    
    {
        if(fork()) {            
            NullEvent ev("test_event");
            ev.wait();
        } 
        else {            
            usleep(100000);
            Event::setEvent("test_event");
            exit(0);
        }            
    }
    
    {
        static std::string str("test string to be compared");        
        if(fork()) {
            RawEvent ev("test_event",str.c_str());
            size_t buf_len = 0;
            const char *buf = ev.waitRaw(&buf_len,1);
            TEST1( std::string(str) == std::string(buf) );
        }
        else {
            usleep(100000);;
            Event::setEventRaw("test_event",str.size(),(char*)str.c_str());
            exit(0);
        }
    }
        
    { // DATA EVENT //
        static unique_ptr<String> str = new String("test string to be compared");        
        if(!fork()) {
            DataEvent ev("test_event",str->clone());
            unique_ptr<Data> data = ev.waitData();
            TEST1( AutoString(data->getString()).string == AutoString(str->getString()).string );            
        }
        else {                        
            usleep(100000);
            Event::setEvent("test_event",str);
            exit(0);
        }
    }    
    
#   endif
    END_TESTING;
}



