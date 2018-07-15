package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GUIEditProperty extends javax.swing.JFrame {
    public int number;
    
    public GUIEditProperty() {
        initComponents();
        setPropertyName();
    }
    
    public void setPropertyName(){
        int pCounter = 1;
        try {    
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + pCounter;
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                lblProperty1.setText(rs.getString("PROPERTY_NAME"));
                pCounter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUIEditProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {    
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + pCounter;
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                lblProperty2.setText(rs.getString("PROPERTY_NAME"));
                pCounter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUIEditProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProperty1 = new javax.swing.JLabel();
        lblProperty2 = new javax.swing.JLabel();
        lblProperty3 = new javax.swing.JLabel();
        btnEdit1 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        btnEdit3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemHome = new javax.swing.JMenuItem();
        menuItemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Property");
        setResizable(false);

        lblProperty1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProperty1.setText("<property 1>");
        lblProperty1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblProperty2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProperty2.setText("<property 2>");

        lblProperty3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProperty3.setText("<property 3>");

        btnEdit1.setText("Edit");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnEdit2.setText("Edit");
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
            }
        });

        btnEdit3.setText("Edit");
        btnEdit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit3ActionPerformed(evt);
            }
        });

        jMenu1.setText("System");

        menuItemHome.setText("Dashboard");
        menuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHomeActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemHome);

        menuItemLogout.setText("Logout");
        menuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProperty1)
                    .addComponent(lblProperty2)
                    .addComponent(lblProperty3))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit3)
                    .addComponent(btnEdit2)
                    .addComponent(btnEdit1))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProperty1)
                            .addComponent(btnEdit1))
                        .addGap(44, 44, 44)
                        .addComponent(lblProperty2))
                    .addComponent(btnEdit2))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProperty3)
                    .addComponent(btnEdit3))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        number = 1;
        GUIEditPropertyPage ep = new GUIEditPropertyPage(number);
        ep.run();
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
        // TODO add your handling code here:
        number = 2;
        GUIEditPropertyPage ep = new GUIEditPropertyPage(number);
        ep.run();
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnEdit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit3ActionPerformed
        // TODO add your handling code here:
        number = 3;
        GUIEditPropertyPage ep = new GUIEditPropertyPage(number);
        ep.run();
    }//GEN-LAST:event_btnEdit3ActionPerformed

    private void menuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        Buyer b = new Buyer();
        b.login();
    }//GEN-LAST:event_menuItemLogoutActionPerformed

    private void menuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHomeActionPerformed
        // TODO add your handling code here:
        dispose();
        GUIAdminPage ap = new GUIAdminPage();
        ap.run();
    }//GEN-LAST:event_menuItemHomeActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEditProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEditProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEditProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEditProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEditProperty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEdit1;
    public javax.swing.JButton btnEdit2;
    public javax.swing.JButton btnEdit3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblProperty1;
    private javax.swing.JLabel lblProperty2;
    private javax.swing.JLabel lblProperty3;
    private javax.swing.JMenuItem menuItemHome;
    private javax.swing.JMenuItem menuItemLogout;
    // End of variables declaration//GEN-END:variables

}
