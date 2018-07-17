package javaassignment2.GUIForms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIPropertyPage extends javax.swing.JFrame {
    private int pCounter = 1;
    private int number = 0;
    
    public GUIPropertyPage() {
        initComponents();
        assignProperty();
    }
    
    public void assignProperty(){
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
            Logger.getLogger(GUIPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(GUIPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbPropertyType = new javax.swing.JComboBox<>();
        cbPropertyStatus = new javax.swing.JComboBox<>();
        cbState = new javax.swing.JComboBox<>();
        lblCBPropertyType = new javax.swing.JLabel();
        lblCBPropertyStatus = new javax.swing.JLabel();
        lblCBState = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JPanel = new javax.swing.JPanel();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Search!");
        setResizable(false);

        cbPropertyType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbPropertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Apartment", "Condominium", "Terrace", "Semi-Detachable", "Bungalow" }));
        cbPropertyType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPropertyTypeActionPerformed(evt);
            }
        });

        cbPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbPropertyStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Available", "Unavailable" }));

        cbState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur", "Selangor", "Penang" }));

        lblCBPropertyType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBPropertyType.setText("Type");

        lblCBPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBPropertyStatus.setText("Status");

        lblCBState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBState.setText("State");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCBState))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCBPropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPropertyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCBPropertyStatus))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCBPropertyType)
                    .addComponent(lblCBPropertyStatus)
                    .addComponent(lblCBState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPropertyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPropertyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lblPropertyNameD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyNameD1.setText("<property name>");

        lblPropertyTypeD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyTypeD1.setText("<property type>");

        lblPropertyStatusD1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPropertyStatusD1.setText("<property status>");

        propertyPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/GUIForms/p2.png"))); // NOI18N
        propertyPic2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        propertyPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/GUIForms/p1.png"))); // NOI18N
        propertyPic1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertyPic1))
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyStatus1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnContact1)
                    .addComponent(btnContact2)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName)
                            .addComponent(lblPropertyStatus, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPropertyType, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPropertyNameD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyTypeD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPropertyStatusD))))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic1)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyName)
                            .addComponent(lblPropertyNameD))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyType)
                            .addComponent(lblPropertyTypeD))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyStatus)
                            .addComponent(lblPropertyStatusD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContact1)))
                .addGap(45, 45, 45)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic2)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyName1)
                            .addComponent(lblPropertyNameD1))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyType1)
                            .addComponent(lblPropertyTypeD1))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPropertyStatus1)
                            .addComponent(lblPropertyStatusD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContact2)))
                .addContainerGap(445, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(JPanel);

        jMenu1.setText("System");

        menuitemLogout.setText("Logout");
        menuitemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPropertyTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPropertyTypeActionPerformed
        // TODO add your handling code here:
        if(cbPropertyType.getSelectedItem().toString().equals("All")) {
            JPanel.setVisible(true);
        }
        else{
            JPanel.setVisible(false);
        }
    }//GEN-LAST:event_cbPropertyTypeActionPerformed

    private void menuitemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        GUILogIn l = new GUILogIn();
        l.run();
    }//GEN-LAST:event_menuitemLogoutActionPerformed

    private void btnContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContact1ActionPerformed
        // TODO add your handling code here:
        number = 1;
        GUIPropertyDetails pd = new GUIPropertyDetails(number);
        pd.run();
    }//GEN-LAST:event_btnContact1ActionPerformed

    private void btnContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContact2ActionPerformed
        number = 2;
        GUIPropertyDetails pd = new GUIPropertyDetails(number);
        pd.run();
    }//GEN-LAST:event_btnContact2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPropertyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnContact1;
    private javax.swing.JButton btnContact2;
    private javax.swing.JComboBox<String> cbPropertyStatus;
    private javax.swing.JComboBox<String> cbPropertyType;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCBPropertyStatus;
    private javax.swing.JLabel lblCBPropertyType;
    private javax.swing.JLabel lblCBState;
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
    private javax.swing.JMenuItem menuitemLogout;
    private javax.swing.JLabel propertyPic1;
    private javax.swing.JLabel propertyPic2;
    // End of variables declaration//GEN-END:variables

}