/*
		A basic implementation of the DeviceSetup class.
*/

import java.awt.*;

public class NI6071ESetup extends DeviceSetup
{
	public NI6071ESetup(Frame parent)
	{
		super(parent);

		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		//{{INIT_CONTROLS
		setDeviceTitle("National Instruments ADC 6071E");
		getContentPane().setLayout(null);
		setSize(405,273);
		deviceField1.setNumCols(15);
		deviceField1.setTextOnly(true);
		deviceField1.setOffsetNid(2);
		deviceField1.setLabelString("Comment :");
		getContentPane().add(deviceField1);
		deviceField1.setBounds(-1,10,247,31);
		deviceField2.setNumCols(15);
		deviceField2.setTextOnly(true);
		deviceField2.setOffsetNid(1);
		deviceField2.setLabelString("Name :");
		getContentPane().add(deviceField2);
		deviceField2.setBounds(5,38,247,31);
		deviceField3.setNumCols(5);
		deviceField3.setOffsetNid(3);
		deviceField3.setLabelString("Device id: ");
		getContentPane().add(deviceField3);
		deviceField3.setBounds(250,38,150,31);
		deviceChoice1.setOffsetNid(4);
		{
			String[] tempString = new String[2];
			tempString[0] = "INTERNAL";
			tempString[1] = "EXTERNAL";
			deviceChoice1.setChoiceItems(tempString);
		}
		deviceChoice1.setLabelString("Trig. Mode: ");
		getContentPane().add(deviceChoice1);
		deviceChoice1.setBounds(5,65,180,33);
		deviceField4.setNumCols(9);
		deviceField4.setOffsetNid(5);
		deviceField4.setLabelString("Trig. Source: ");
		getContentPane().add(deviceField4);
		deviceField4.setBounds(184,65,200,31);
		deviceChoice2.setOffsetNid(6);
		{
			String[] tempString = new String[2];
			tempString[0] = "RISING";
			tempString[1] = "FALLING";
			deviceChoice2.setChoiceItems(tempString);
		}
		deviceChoice2.setLabelString("Trig. Slope: ");
		getContentPane().add(deviceChoice2);
		deviceChoice2.setBounds(5,99,200,31);
		deviceField5.setNumCols(8);
		deviceField5.setOffsetNid(7);
		deviceField5.setLabelString("Trig. Level: ");
		getContentPane().add(deviceField5);
		deviceField5.setBounds(209,99,200,31);
		deviceField6.setOffsetNid(8);
		deviceField6.setLabelString("Scan Rate: ");
		getContentPane().add(deviceField6);
		deviceField6.setBounds(5,132,200,31);
		deviceField7.setNumCols(8);
		deviceField7.setOffsetNid(9);
		deviceField7.setLabelString("Scan Num.: ");
		getContentPane().add(deviceField7);
		deviceField7.setBounds(205,132,200,31);
		deviceField8.setNumCols(25);
		deviceField8.setOffsetNid(10);
		deviceField8.setLabelString("Channels: ");
		getContentPane().add(deviceField8);
		deviceField8.setBounds(5,160,400,31);
		deviceChoice4.setOffsetNid(13);
		{
			String[] tempString = new String[2];
			tempString[0] = "BIPOLAR";
			tempString[1] = "UNIPOLAR";
			deviceChoice4.setChoiceItems(tempString);
		}
		deviceChoice4.setLabelString("Chan. Polarity: ");
		getContentPane().add(deviceChoice4);
		deviceChoice4.setBounds(189,188,200,32);
		deviceField9.setNumCols(6);
		deviceField9.setOffsetNid(12);
		deviceField9.setLabelString("Chan. Range: ");
		getContentPane().add(deviceField9);
		deviceField9.setBounds(9,190,200,31);
		{
			String[] tempString = new String[2];
			tempString[0] = "init";
			tempString[1] = "store";
			deviceButtons1.setMethods(tempString);
		}
		getContentPane().add(deviceButtons1);
		deviceButtons1.setBounds(72,228,281,40);
		getContentPane().add(deviceDispatch1);
		deviceDispatch1.setBounds(245,8,131,32);
		//}}
	}

	public NI6071ESetup()
	{
		this((Frame)null);
	}

	public NI6071ESetup(String sTitle)
	{
		this();
		setTitle(sTitle);
	}

	public void setVisible(boolean b)
	{
		if (b)
			setLocation(50, 50);
		super.setVisible(b);
	}

	public void addNotify()
	{
		// Record the size of the window prior to calling parents addNotify.
		Dimension size = getSize();

		super.addNotify();

		if (frameSizeAdjusted)
			return;
		frameSizeAdjusted = true;

		// Adjust size of frame according to the insets
		Insets insets = getInsets();
		setSize(insets.left + insets.right + size.width, insets.top + insets.bottom + size.height);
	}

	// Used by addNotify
	boolean frameSizeAdjusted = false;

	//{{DECLARE_CONTROLS
	DeviceField deviceField1 = new DeviceField();
	DeviceField deviceField2 = new DeviceField();
	DeviceField deviceField3 = new DeviceField();
	DeviceChoice deviceChoice1 = new DeviceChoice();
	DeviceField deviceField4 = new DeviceField();
	DeviceChoice deviceChoice2 = new DeviceChoice();
	DeviceField deviceField5 = new DeviceField();
	DeviceField deviceField6 = new DeviceField();
	DeviceField deviceField7 = new DeviceField();
	DeviceField deviceField8 = new DeviceField();
	DeviceChoice deviceChoice4 = new DeviceChoice();
	DeviceField deviceField9 = new DeviceField();
	DeviceButtons deviceButtons1 = new DeviceButtons();
	DeviceDispatch deviceDispatch1 = new DeviceDispatch();
	//}}

}
