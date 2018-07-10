package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PropertyPage extends javax.swing.JFrame {
    private int pCounter = 1;
    
    public PropertyPage() {
        initComponents();
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + pCounter;
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                lblPropertyNameD.setText(rs.getString("PROPERTY_NAME"));
                lblPropertyTypeD.setText(rs.getString("PROPERTY_TYPE"));
                if(rs.getString("PROPERTY_STATUS").equals("true")){
                    String status = "Available";
                    lblPropertyStatusD.setText(status);
                }
                else if(rs.getString("PROPERTY_STATUS").equals("false")){
                    String status = "Unavailable";
                    lblPropertyStatusD.setText(status);
                }
                pCounter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Not optimal code but it works
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + pCounter;
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                lblPropertyNameD1.setText(rs.getString("PROPERTY_NAME"));
                lblPropertyTypeD1.setText(rs.getString("PROPERTY_TYPE"));
                if(rs.getString("PROPERTY_STATUS").equals("true")){
                    String status = "Available";
                    lblPropertyStatusD1.setText(status);
                }
                else if(rs.getString("PROPERTY_STATUS").equals("false")){
                    String status = "Unavailable";
                    lblPropertyStatusD1.setText(status);
                }
                pCounter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblPropertyNameD1 = new javax.swing.JLabel();
        lblPropertyTypeD1 = new javax.swing.JLabel();
        lblPropertyStatusD1 = new javax.swing.JLabel();
        propertyPic2 = new javax.swing.JLabel();
        lblPropertyStatus1 = new javax.swing.JLabel();
        lblPropertyName1 = new javax.swing.JLabel();
        lblPropertyType1 = new javax.swing.JLabel();
        lblPropertyTypeD = new javax.swing.JLabel();
        lblPropertyStatusD = new javax.swing.JLabel();
        propertyPic1 = new javax.swing.JLabel();
        lblPropertyName = new javax.swing.JLabel();
        lblPropertyType = new javax.swing.JLabel();
        lblPropertyStatus = new javax.swing.JLabel();
        lblPropertyNameD = new javax.swing.JLabel();
        btnContact2 = new javax.swing.JButton();
        btnContact1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Search!");
        setResizable(false);

        lblPropertyNameD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyNameD1.setText("<property name>");

        lblPropertyTypeD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyTypeD1.setText("<property type>");

        lblPropertyStatusD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyStatusD1.setText("<property status>");

        propertyPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p2.png"))); // NOI18N

        lblPropertyStatus1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus1.setText("Availability");

        lblPropertyName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName1.setText("Property Name");

        lblPropertyType1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType1.setText("Property Type");

        lblPropertyTypeD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyTypeD.setText("<property type>");

        lblPropertyStatusD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyStatusD.setText("<property status>");

        propertyPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p1.png"))); // NOI18N

        lblPropertyName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName.setText("Property Name");

        lblPropertyType.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType.setText("Property Type");

        lblPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus.setText("Availability");

        lblPropertyNameD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyNameD.setText("<property name>");

        btnContact2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnContact2.setText("Contact Agent!");
        btnContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContact2ActionPerformed(evt);
            }
        });

        btnContact1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnContact1.setText("Contact Agent!");
        btnContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContact1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertyPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyStatus1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnContact1)
                    .addComponent(btnContact2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName)
                            .addComponent(lblPropertyStatus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyName)
                            .addComponent(lblPropertyNameD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyType)
                            .addComponent(lblPropertyTypeD))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyStatus)
                            .addComponent(lblPropertyStatusD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContact1)))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyNameD1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyType1)
                            .addComponent(lblPropertyTypeD1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyStatus1)
                            .addComponent(lblPropertyStatusD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContact2)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContact2ActionPerformed
        try {
            // TODO add your handling code here:
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM AGENT WHERE AGENT_ID = " + 1;
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                JOptionPane.showMessageDialog(null, "Contact " + rs.getString("AGENT_NAME") + " @ " + rs.getString("AGENT_CONTACT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnContact2ActionPerformed

    private void btnContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContact1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM AGENT WHERE AGENT_ID = " + 2;
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                JOptionPane.showMessageDialog(null, "Contact " + rs.getString("AGENT_NAME") + " @ " + rs.getString("AGENT_CONTACT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnContact1ActionPerformed

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
            java.util.logging.Logger.getLogger(PropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropertyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContact1;
    private javax.swing.JButton btnContact2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPropertyName;
    private javax.swing.JLabel lblPropertyName1;
    private javax.swing.JLabel lblPropertyNameD;
    private javax.swing.JLabel lblPropertyNameD1;
    private javax.swing.JLabel lblPropertyStatus;
    private javax.swing.JLabel lblPropertyStatus1;
    private javax.swing.JLabel lblPropertyStatusD;
    private javax.swing.JLabel lblPropertyStatusD1;
    private javax.swing.JLabel lblPropertyType;
    private javax.swing.JLabel lblPropertyType1;
    private javax.swing.JLabel lblPropertyTypeD;
    private javax.swing.JLabel lblPropertyTypeD1;
    private javax.swing.JLabel propertyPic1;
    private javax.swing.JLabel propertyPic2;
    // End of variables declaration//GEN-END:variables

}
