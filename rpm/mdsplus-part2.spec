
%description
Main libraries and programs to get MDSplus operational

%prep
#%setup -q
cd %_builddir/mdsplus

%build
if [ "%_target" != "i686-linux" ]
then
  ./configure --exec_prefix=$RPM_BUILD_ROOT/usr/local/mdsplus --bindir=$RPM_BUILD_ROOT/usr/local/mdsplus/bin32 --libdir=$RPM_BUILD_ROOT/usr/local/mdsplus/lib32 --enable-nodebug --target=i686-linux --disable-java
make clean
make
  ./configure --exec_prefix=$RPM_BUILD_ROOT/usr/local/mdsplus --bindir=$RPM_BUILD_ROOT/usr/local/mdsplus/bin64 --libdir=$RPM_BUILD_ROOT/usr/local/mdsplus/lib64 --enable-nodebug
  make clean
  make
else
  ./configure --exec_prefix=$RPM_BUILD_ROOT/usr/local/mdsplus --bindir=$RPM_BUILD_ROOT/usr/local/mdsplus/bin32 --libdir=$RPM_BUILD_ROOT/usr/local/mdsplus/lib32 --enable-nodebug --target=i686-linux
  make clean
  make
fi


%install

make install
if [ "%_target" |= "i686-linux" ]
then
  cp -r bin32 $RPM_BUILD_ROOT/usr/local/mdsplus/
  cp -r lib32 $RPM_BUILD_ROOT/usr/local/mdsplus/
  cp -r uid32 $RPM_BUILD_ROOT/usr/local/mdsplus/
else
  ln -sf bin32 $RPM_BUILD_ROOT/usr/local/mdsplus/bin
  ln -sf lib32 $RPM_BUILD_ROOT/usr/local/mdsplus/lib
fi
cp -r matlab $RPM_BUILD_ROOT/usr/local/mdsplus/
cp -r php    $RPM_BUILD_ROOT/usr/local/mdsplus/
cp -r pixmaps $RPM_BUILD_ROOT/usr/local/mdsplus/

%clean
rm -rf $RPM_BUILD_ROOT

%post 
$RPM_INSTALL_PREFIX/mdsplus/rpm/post_install_script

%postun

MDSPLUS_DIR=`cat /etc/.mdsplus_dir`
$MDSPLUS_DIR/local/mdsplus_post_uninstall_script



%files



%changelog
* Wed Aug 29 2000 Basil P. DUVAL <basil.duval@epfl.ch>
- version 1.0
