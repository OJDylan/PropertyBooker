package javaassignment2;

public class AppointmentReport extends javax.swing.JFrame {
    private int counter = 1;
    
    public AppointmentReport() {
        initComponents();
        
        //NOT WORKING - Replace label with agent name
        AdminLogin a = new AdminLogin();
        lblAgentName.setText(a.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgent = new javax.swing.JLabel();
        lblTenant = new javax.swing.JLabel();
        lblPropertyID = new javax.swing.JLabel();
        lblPropertyName = new javax.swing.JLabel();
        lblBookingDate = new javax.swing.JLabel();
        lblBookingTime = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        txtTenantName = new javax.swing.JTextField();
        txtPropertyID = new javax.swing.JTextField();
        txtPropertyName = new javax.swing.JTextField();
        txtBookDate = new javax.swing.JTextField();
        txtBookTime = new javax.swing.JTextField();
        btnConfirmApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generate Report");
        setResizable(false);

        lblAgent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgent.setText("Agent");

        lblTenant.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTenant.setText("Tenant");

        lblPropertyID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyID.setText("Property ID");

        lblPropertyName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName.setText("Property Name");

        lblBookingDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBookingDate.setText("Appointment Date");

        lblBookingTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBookingTime.setText("Appointment Time");

        jLabel7.setText("Appointment ID: ");

        jLabel8.setText("<Appointment ID>");

        lblAgentName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAgentName.setText("<Agent Name>");

        txtTenantName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPropertyID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPropertyName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtBookDate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtBookTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnConfirmApp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfirmApp.setText("Confirm");
        btnConfirmApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBookingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPropertyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPropertyID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTenant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBookingTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBookTime)
                    .addComponent(txtBookDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPropertyName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPropertyID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenantName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnConfirmApp)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgent)
                    .addComponent(lblAgentName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenant)
                    .addComponent(txtTenantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropertyID)
                    .addComponent(txtPropertyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropertyName)
                    .addComponent(txtPropertyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingDate)
                    .addComponent(txtBookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingTime)
                    .addComponent(txtBookTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmApp)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAppActionPerformed
        // TODO add your handling code here:
//        Appointment a = new Appointment(txt);
//        a.confirmAppointment();
    }//GEN-LAST:event_btnConfirmAppActionPerformed

    public static void run() {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmApp;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblBookingTime;
    private javax.swing.JLabel lblPropertyID;
    private javax.swing.JLabel lblPropertyName;
    private javax.swing.JLabel lblTenant;
    private javax.swing.JTextField txtBookDate;
    private javax.swing.JTextField txtBookTime;
    private javax.swing.JTextField txtPropertyID;
    private javax.swing.JTextField txtPropertyName;
    private javax.swing.JTextField txtTenantName;
    // End of variables declaration//GEN-END:variables

}
