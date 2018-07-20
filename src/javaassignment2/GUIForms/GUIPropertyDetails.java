package javaassignment2.GUIForms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GUIPropertyDetails extends javax.swing.JFrame {
    private static int number;
    private static String[] filename = {"map(1).png", "map(2).png", "map(3).png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), 
                           new ImageIcon(getClass().getResource(filename[1])),
                           new ImageIcon(getClass().getResource(filename[2]))};
    
    public GUIPropertyDetails(int num) {
        initComponents();
        number = num;
        setDetails(number);
    }
    
    public void setDetails(int number){
        if(number == 1){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM AGENT WHERE AGENT_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    lblName.setText(rs.getString("AGENT_NAME"));
                    lblNumber.setText(rs.getString("AGENT_CONTACT"));
                    lblEmail.setText(rs.getString("AGENT_EMAIL"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    lblPrice.setText(rs.getString("PROPERTY_PRICE"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblMap.setIcon(pics[0]);
        }
        else if(number == 2){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM AGENT WHERE AGENT_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    lblName.setText(rs.getString("AGENT_NAME"));
                    lblNumber.setText(rs.getString("AGENT_CONTACT"));
                    lblEmail.setText(rs.getString("AGENT_EMAIL"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    lblPrice.setText(rs.getString("PROPERTY_PRICE"));
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblMap.setIcon(pics[1]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMap = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblMapInfo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblNumber = new javax.swing.JLabel();
        lblPropertyPrice = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblAgentEmail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contact");
        setResizable(false);

        lblAgentName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgentName.setText("Agent Name");

        lblContact.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblContact.setText("Contact Number");

        lblMapInfo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMapInfo.setText("Location");

        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setText("<name>");

        lblNumber.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNumber.setText("<number>");

        lblPropertyPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyPrice.setText("Property Price");

        lblPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrice.setText("<price>");

        lblAgentEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgentEmail.setText("Email");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmail.setText("<email>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMapInfo)
                    .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAgentName)
                            .addComponent(lblContact)
                            .addComponent(lblPropertyPrice)
                            .addComponent(lblAgentEmail))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblPrice)
                            .addComponent(lblNumber)
                            .addComponent(lblName))))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentName)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContact)
                    .addComponent(lblNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropertyPrice)
                    .addComponent(lblPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentEmail)
                    .addComponent(lblEmail))
                .addGap(37, 37, 37)
                .addComponent(lblMapInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMap, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIPropertyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPropertyDetails(number).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAgentEmail;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblMapInfo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPropertyPrice;
    // End of variables declaration//GEN-END:variables

}
