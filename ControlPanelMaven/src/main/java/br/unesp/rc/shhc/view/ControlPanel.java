package br.unesp.rc.shhc.view;

import br.unesp.rc.shhc.utils.FrameUtils;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ControlPanel extends javax.swing.JFrame {

    public ControlPanel() {
        initComponents();

        FrameUtils.setLookMetal(this);

        FrameUtils.center(this);
        jSTemperature.setValue(36);
        jSHeartRate.setValue(120);
        jSGlucose.setValue(100);
        jSPulseOxygen.setValue(92);
        jSAirFlow.setValue(38);
        jSSystolicBP.setValue(12);
        jSDiastolicBP.setValue(8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanelTemperature = new javax.swing.JPanel();
        jSTemperature = new javax.swing.JSpinner();
        jPanelBloodPressure = new javax.swing.JPanel();
        jSSystolicBP = new javax.swing.JSpinner();
        jSDiastolicBP = new javax.swing.JSpinner();
        jPanelPulseOxygen = new javax.swing.JPanel();
        jSPulseOxygen = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanelAirFlow = new javax.swing.JPanel();
        jSAirFlow = new javax.swing.JSpinner();
        jPanelHeartRate = new javax.swing.JPanel();
        jSHeartRate = new javax.swing.JSpinner();
        jPanelGlucose = new javax.swing.JPanel();
        jSGlucose = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Sensors"));

        jPanelTemperature.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperature"));

        jSTemperature.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSTemperatureStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelTemperatureLayout = new javax.swing.GroupLayout(jPanelTemperature);
        jPanelTemperature.setLayout(jPanelTemperatureLayout);
        jPanelTemperatureLayout.setHorizontalGroup(
            jPanelTemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTemperatureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTemperatureLayout.setVerticalGroup(
            jPanelTemperatureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTemperatureLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBloodPressure.setBorder(javax.swing.BorderFactory.createTitledBorder("BloodPressure"));

        jSSystolicBP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSSystolicBPStateChanged(evt);
            }
        });

        jSDiastolicBP.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSDiastolicBPStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelBloodPressureLayout = new javax.swing.GroupLayout(jPanelBloodPressure);
        jPanelBloodPressure.setLayout(jPanelBloodPressureLayout);
        jPanelBloodPressureLayout.setHorizontalGroup(
            jPanelBloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBloodPressureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSSystolicBP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSDiastolicBP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBloodPressureLayout.setVerticalGroup(
            jPanelBloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBloodPressureLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBloodPressureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSSystolicBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSDiastolicBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelPulseOxygen.setBorder(javax.swing.BorderFactory.createTitledBorder("Pulse Oxygen"));

        jSPulseOxygen.setModel(new javax.swing.SpinnerNumberModel(0, null, 100, 1));
        jSPulseOxygen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSPulseOxygenStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelPulseOxygenLayout = new javax.swing.GroupLayout(jPanelPulseOxygen);
        jPanelPulseOxygen.setLayout(jPanelPulseOxygenLayout);
        jPanelPulseOxygenLayout.setHorizontalGroup(
            jPanelPulseOxygenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPulseOxygenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPulseOxygen)
                .addContainerGap())
        );
        jPanelPulseOxygenLayout.setVerticalGroup(
            jPanelPulseOxygenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPulseOxygenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSPulseOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPulseOxygen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPulseOxygen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unesp/rc/shhc/view/images/corpo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Sensors"));

        jPanelAirFlow.setBorder(javax.swing.BorderFactory.createTitledBorder("AirFlow"));

        jSAirFlow.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSAirFlowStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelAirFlowLayout = new javax.swing.GroupLayout(jPanelAirFlow);
        jPanelAirFlow.setLayout(jPanelAirFlowLayout);
        jPanelAirFlowLayout.setHorizontalGroup(
            jPanelAirFlowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAirFlowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSAirFlow, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAirFlowLayout.setVerticalGroup(
            jPanelAirFlowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAirFlowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSAirFlow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelHeartRate.setBorder(javax.swing.BorderFactory.createTitledBorder("HeartRate"));

        jSHeartRate.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSHeartRateStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelHeartRateLayout = new javax.swing.GroupLayout(jPanelHeartRate);
        jPanelHeartRate.setLayout(jPanelHeartRateLayout);
        jPanelHeartRateLayout.setHorizontalGroup(
            jPanelHeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeartRateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSHeartRate)
                .addContainerGap())
        );
        jPanelHeartRateLayout.setVerticalGroup(
            jPanelHeartRateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeartRateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelGlucose.setBorder(javax.swing.BorderFactory.createTitledBorder("Glucose"));

        jSGlucose.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSGlucoseStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelGlucoseLayout = new javax.swing.GroupLayout(jPanelGlucose);
        jPanelGlucose.setLayout(jPanelGlucoseLayout);
        jPanelGlucoseLayout.setHorizontalGroup(
            jPanelGlucoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGlucoseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSGlucose)
                .addContainerGap())
        );
        jPanelGlucoseLayout.setVerticalGroup(
            jPanelGlucoseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGlucoseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSGlucose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAirFlow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelHeartRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelGlucose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAirFlow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(jPanelGlucose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSTemperatureStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSTemperatureStateChanged
        // TODO add your handling code here:
        int value = (int) jSTemperature.getValue();
        System.out.println("Temperature Value: " + value);
        setTValue(value);
    }//GEN-LAST:event_jSTemperatureStateChanged

    private void jSHeartRateStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSHeartRateStateChanged
        // TODO add your handling code here:
        int value = (int) jSHeartRate.getValue();
        System.out.println("HeartRate Value: " + value);
        setHRValue(value);
    }//GEN-LAST:event_jSHeartRateStateChanged

    private void jSGlucoseStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSGlucoseStateChanged
        int value = (int) jSGlucose.getValue();
        System.out.println("Glucose Value: " + value);
        setGlValue(value);
    }//GEN-LAST:event_jSGlucoseStateChanged

    private void jSPulseOxygenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSPulseOxygenStateChanged
        int value = (int) jSPulseOxygen.getValue();
        System.out.println("Pulse Oxygen Value: " + value);
        setPOValue(value);
    }//GEN-LAST:event_jSPulseOxygenStateChanged

    private void jSAirFlowStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSAirFlowStateChanged
        int value = (int) jSAirFlow.getValue();
        System.out.println("Air Flow Value: " + value);
        setAFValue(value);
    }//GEN-LAST:event_jSAirFlowStateChanged

    private void jSSystolicBPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSSystolicBPStateChanged
        int value = (int) jSSystolicBP.getValue();
        System.out.println("Systolic Blood Pressure Value: " + value);
        setSBPValue(value);
    }//GEN-LAST:event_jSSystolicBPStateChanged

    private void jSDiastolicBPStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSDiastolicBPStateChanged
        int value = (int) jSDiastolicBP.getValue();
        System.out.println("Diastolic Blood Pressure Value: " + value);
        setDBPValue(value);
    }//GEN-LAST:event_jSDiastolicBPStateChanged

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Message: " + ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ControlPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAirFlow;
    private javax.swing.JPanel jPanelBloodPressure;
    private javax.swing.JPanel jPanelGlucose;
    private javax.swing.JPanel jPanelHeartRate;
    private javax.swing.JPanel jPanelPulseOxygen;
    private javax.swing.JPanel jPanelTemperature;
    private javax.swing.JSpinner jSAirFlow;
    private javax.swing.JSpinner jSDiastolicBP;
    private javax.swing.JSpinner jSGlucose;
    private javax.swing.JSpinner jSHeartRate;
    private javax.swing.JSpinner jSPulseOxygen;
    private javax.swing.JSpinner jSSystolicBP;
    private javax.swing.JSpinner jSTemperature;
    // End of variables declaration//GEN-END:variables

    private static void setTValue(int temperatura) {
       
    }

    private static void setHRValue(int hrate) {

    }

    private static void setGlValue(int glucoseT) {

    }

    private static void setPOValue(int oxygenP) {

    }

    private static void setAFValue(int airflow) {

    }

    private static void setDBPValue(int diastolic) {

    }

    private static void setSBPValue(int systolic) {

    }
}
