/*
 * EDA3VmeConfigSetup.java
 *
 * Created on 10 giugno 2010, 11.09
 */



/**
 *
 * @author  manduchi
 */
public class EDA3VmeConfigSetup extends DeviceSetup {

    /** Creates new form BeanForm */
    public EDA3VmeConfigSetup() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceField1 = new DeviceField();
        deviceField4 = new DeviceField();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField5 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField9 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField15 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceField11 = new DeviceField();
        deviceField10 = new DeviceField();
        deviceField13 = new DeviceField();
        deviceField12 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceChoice2 = new DeviceChoice();
        deviceChoice3 = new DeviceChoice();
        jPanel7 = new javax.swing.JPanel();
        deviceField14 = new DeviceField();

        setDeviceProvider("localhost");
        setDeviceTitle("EDA3 VME COnfiguration for F Control");
        setDeviceType("EDA3VmeConfig");
        setHeight(400);
        setWidth(600);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("tauVTor");
        deviceField3.setNumCols(4);
        deviceField3.setOffsetNid(4);
        jPanel2.add(deviceField3);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("tauVTheta");
        deviceField1.setNumCols(4);
        deviceField1.setOffsetNid(3);
        jPanel2.add(deviceField1);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("thetaNom:");
        deviceField4.setNumCols(4);
        deviceField4.setOffsetNid(2);
        jPanel2.add(deviceField4);

        jPanel1.add(jPanel2);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("tauD");
        deviceField2.setNumCols(4);
        deviceField2.setOffsetNid(5);
        jPanel3.add(deviceField2);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("kp");
        deviceField5.setNumCols(4);
        deviceField5.setOffsetNid(6);
        jPanel3.add(deviceField5);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("kd");
        deviceField6.setNumCols(4);
        deviceField6.setOffsetNid(8);
        jPanel3.add(deviceField6);

        jPanel1.add(jPanel3);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("ki");
        deviceField7.setNumCols(4);
        deviceField7.setOffsetNid(7);
        jPanel4.add(deviceField7);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("kvComp");
        deviceField9.setNumCols(4);
        deviceField9.setOffsetNid(12);
        jPanel4.add(deviceField9);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("iPTrig");
        deviceField8.setNumCols(4);
        deviceField8.setOffsetNid(13);
        jPanel4.add(deviceField8);

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("rVesselTuning");
        deviceField15.setNumCols(4);
        deviceField15.setOffsetNid(18);
        jPanel4.add(deviceField15);

        jPanel1.add(jPanel4);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("deltaVTorTrig");
        deviceField11.setNumCols(4);
        deviceField11.setOffsetNid(15);
        jPanel5.add(deviceField11);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("deltaTBT1");
        deviceField10.setNumCols(4);
        deviceField10.setOffsetNid(16);
        jPanel5.add(deviceField10);

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("tTrig");
        deviceField13.setNumCols(4);
        deviceField13.setOffsetNid(14);
        jPanel5.add(deviceField13);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("deltaTBT2");
        deviceField12.setNumCols(4);
        deviceField12.setOffsetNid(17);
        jPanel5.add(deviceField12);

        jPanel1.add(jPanel5);

        deviceChoice1.setChoiceIntValues(new int[] {(int)1,(int)0});
        deviceChoice1.setChoiceItems(new String[] {"ON", "OFF"});
        deviceChoice1.setConvert(true);
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("vComp");
        deviceChoice1.setOffsetNid(9);
        deviceChoice1.setUpdateIdentifier("");
        jPanel6.add(deviceChoice1);

        deviceChoice2.setChoiceIntValues(new int[] {(int)1,(int)0});
        deviceChoice2.setChoiceItems(new String[] {"ON", "OFF"});
        deviceChoice2.setConvert(true);
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("iComp");
        deviceChoice2.setOffsetNid(10);
        deviceChoice2.setUpdateIdentifier("");
        jPanel6.add(deviceChoice2);

        deviceChoice3.setChoiceIntValues(new int[] {(int)1,(int)0});
        deviceChoice3.setChoiceItems(new String[] {"ON", "OFF"});
        deviceChoice3.setConvert(true);
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("iFB");
        deviceChoice3.setOffsetNid(11);
        deviceChoice3.setUpdateIdentifier("");
        jPanel6.add(deviceChoice3);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("VME IP:");
        deviceField14.setNumCols(30);
        deviceField14.setOffsetNid(19);
        deviceField14.setTextOnly(true);
        jPanel7.add(deviceField14);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables

}
