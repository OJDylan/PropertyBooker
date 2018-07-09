package javaassignment2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertyPage extends javax.swing.JFrame {
    private int counter = 1;
    
    public PropertyPage() {
        initComponents();
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + counter;
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
                counter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Not optimal code but it works
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + counter;
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
                counter++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        propertyPic1 = new javax.swing.JLabel();
        propertyPic2 = new javax.swing.JLabel();
        lblPropertyName = new javax.swing.JLabel();
        lblPropertyType = new javax.swing.JLabel();
        lblPropertyStatus = new javax.swing.JLabel();
        lblPropertyStatus1 = new javax.swing.JLabel();
        lblPropertyName1 = new javax.swing.JLabel();
        lblPropertyType1 = new javax.swing.JLabel();
        lblPropertyNameD = new javax.swing.JLabel();
        lblPropertyTypeD = new javax.swing.JLabel();
        lblPropertyStatusD = new javax.swing.JLabel();
        lblPropertyNameD1 = new javax.swing.JLabel();
        lblPropertyTypeD1 = new javax.swing.JLabel();
        lblPropertyStatusD1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Search!");
        setResizable(false);

        propertyPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p1.png"))); // NOI18N

        propertyPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p2.png"))); // NOI18N

        lblPropertyName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName.setText("Property Name");

        lblPropertyType.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType.setText("Property Type");

        lblPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus.setText("Availability");

        lblPropertyStatus1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus1.setText("Availability");

        lblPropertyName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName1.setText("Property Name");

        lblPropertyType1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType1.setText("Property Type");

        lblPropertyNameD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyNameD.setText("<property name>");

        lblPropertyTypeD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyTypeD.setText("<property type>");

        lblPropertyStatusD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyStatusD.setText("<property status>");

        lblPropertyNameD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyNameD1.setText("<property name>");

        lblPropertyTypeD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyTypeD1.setText("<property type>");

        lblPropertyStatusD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyStatusD1.setText("<property status>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertyPic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName)
                            .addComponent(lblPropertyStatus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyStatus1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propertyPic1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPropertyName)
                                    .addComponent(lblPropertyNameD))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPropertyType)
                                    .addComponent(lblPropertyTypeD))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPropertyStatus)
                                    .addComponent(lblPropertyStatusD)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyPic2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyNameD1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyType1)
                            .addComponent(lblPropertyTypeD1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyStatus1)
                            .addComponent(lblPropertyStatusD1))))
                .addContainerGap(86, Short.MAX_VALUE))
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
    private javax.swing.JPanel jPanel1;
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
