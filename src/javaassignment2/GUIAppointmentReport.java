package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class GUIAppointmentReport extends javax.swing.JFrame {
    int counter = 1;
    
    public GUIAppointmentReport() {
        initComponents();
        
        //Counter cannot increase
        lblAppointmentNum.setText("" + counter);
        
        //Why is this fucking this null?
        try {
            Agent a = new Agent();
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM AGENT WHERE AGENT_NAME = " + "'" + a.agentName + "'";
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                lblAgentName.setText(rs.getString("AGENT_NAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUIAppointmentReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        lblAgent = new javax.swing.JLabel();
        lblTenant = new javax.swing.JLabel();
        lblPropertyID = new javax.swing.JLabel();
        lblPropertyName = new javax.swing.JLabel();
        lblBookingDate = new javax.swing.JLabel();
        lblAppointmentID = new javax.swing.JLabel();
        lblAppointmentNum = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        txtTenantName = new javax.swing.JTextField();
        txtPropertyID = new javax.swing.JTextField();
        txtPropertyName = new javax.swing.JTextField();
        btnConfirmApp = new javax.swing.JButton();
        JDateChooser = new com.toedter.calendar.JDateChooser();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        lblAppointmentID.setText("Appointment ID: ");

        lblAppointmentNum.setText("<Appointment ID>");

        lblAgentName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAgentName.setText("<agent name>");

        txtTenantName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtPropertyID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtPropertyName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnConfirmApp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfirmApp.setText("Confirm");
        btnConfirmApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAppActionPerformed(evt);
            }
        });

        JDateChooser.setDateFormatString("yyyy-MM-dd");
        JDateChooser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBookingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPropertyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPropertyID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTenant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPropertyName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPropertyID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenantName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblAppointmentID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblAppointmentNum))
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
                    .addComponent(lblAppointmentID)
                    .addComponent(lblAppointmentNum))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(lblBookingDate))
                    .addComponent(JDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnConfirmApp)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAppActionPerformed
        // TODO add your handling code here:
        AppointmentDetails a = new AppointmentDetails(counter, ((JTextField)JDateChooser.getDateEditor().getUiComponent()).getText(), txtTenantName.getText(), Integer.parseInt(txtPropertyID.getText()), txtPropertyName.getText());
        a.confirmAppointment();
        dispose();
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
            java.util.logging.Logger.getLogger(GUIAppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAppointmentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAppointmentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JDateChooser;
    private javax.swing.JButton btnConfirmApp;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblAppointmentID;
    private javax.swing.JLabel lblAppointmentNum;
    private javax.swing.JLabel lblBookingDate;
    private javax.swing.JLabel lblPropertyID;
    private javax.swing.JLabel lblPropertyName;
    private javax.swing.JLabel lblTenant;
    private javax.swing.JTextField txtPropertyID;
    private javax.swing.JTextField txtPropertyName;
    private javax.swing.JTextField txtTenantName;
    // End of variables declaration//GEN-END:variables

}
