/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manduchi
 */
public class RFXVICONTROLSetup extends DeviceSetup {

    /**
     * Creates new form RFXVICONTROLSetup
     */
    public RFXVICONTROLSetup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceChoice2 = new DeviceChoice();
        jPanel5 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField3 = new DeviceField();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        deviceWave1 = new DeviceWave();
        jPanel7 = new javax.swing.JPanel();
        deviceWave2 = new DeviceWave();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        deviceWave3 = new DeviceWave();

        setDeviceProvider("localhost");
        setDeviceTitle("RFX VI CONTROL Setup");
        setDeviceType("RFXVICONTROL");
        setHeight(500);
        setWidth(600);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Comment:");
        deviceField1.setNumCols(30);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel3.add(deviceField1);

        jPanel2.add(jPanel3);

        deviceChoice1.setChoiceIntValues(new int[] {1, 2, 3, 4, 5, 6, 7});
        deviceChoice1.setChoiceItems(new String[] {"Open Loop Continuous Flux", "Closed  Loop Continuous Flux", "Pulsed Flux", "Fixed Charge", "Open Loop Continuous Flux + Pulsed Flux", "Closed Loop Continuous Flux + Pulsed Flux", "Fixed Charge + Pulsed Flux"});
        deviceChoice1.setConvert(true);
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Filling Type: ");
        deviceChoice1.setOffsetNid(2);
        deviceChoice1.setUpdateIdentifier("");
        jPanel4.add(deviceChoice1);
        deviceChoice2.setChoiceIntValues(new int[] {1, 0});
        deviceChoice2.setChoiceItems(new String[] {"Enabled", "Disabled"});
        deviceChoice2.setConvert(true);
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Control:");
        deviceChoice2.setOffsetNid(5);
        deviceChoice2.setUpdateIdentifier("");
        jPanel4.add(deviceChoice2);

        jPanel2.add(jPanel4);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Filling Press (mbar)");
        deviceField2.setNumCols(5);
        deviceField2.setOffsetNid(4);
        jPanel5.add(deviceField2);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Impurity Lev. (Volt):");
        deviceField3.setNumCols(5);
        deviceField3.setOffsetNid(3);
        jPanel5.add(deviceField3);

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        deviceWave1.setIdentifier("");
        deviceWave1.setMaxYVisible(false);
        deviceWave1.setOffsetNid(13);
        deviceWave1.setUpdateExpression("");
        jPanel6.add(deviceWave1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("H2 injection", jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        deviceWave2.setIdentifier("");
        deviceWave2.setMaxYVisible(false);
        deviceWave2.setOffsetNid(8);
        deviceWave2.setUpdateExpression("");
        jPanel7.add(deviceWave2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("He/impurities injection", jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Ctrl Start Time:");
        deviceField4.setNumCols(4);
        deviceField4.setOffsetNid(6);
        jPanel9.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString(" Ne Scale: ");
        deviceField5.setNumCols(8);
        deviceField5.setOffsetNid(7);
        jPanel9.add(deviceField5);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        deviceWave3.setIdentifier("");
        deviceWave3.setMaxYVisible(false);
        deviceWave3.setOffsetNid(18);
        deviceWave3.setUpdateExpression("");
        jPanel8.add(deviceWave3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Density Control", jPanel8);

        jPanel1.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceWave deviceWave1;
    private DeviceWave deviceWave2;
    private DeviceWave deviceWave3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
