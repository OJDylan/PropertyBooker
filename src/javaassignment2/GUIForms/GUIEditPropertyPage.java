package javaassignment2.GUIForms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaassignment2.Property;

public class GUIEditPropertyPage extends javax.swing.JFrame {
    private static int number;
    
    public GUIEditPropertyPage(int num){
        initComponents();
        number = num;
        setDetails(number);
    }
    
    private void setDetails(int number){
        if(number == 1){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    txtPName.setText(rs.getString("PROPERTY_NAME"));
                    txtPPrice.setText(rs.getString("PROPERTY_PRICE"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GUIEditPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(number == 2){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    txtPName.setText(rs.getString("PROPERTY_NAME"));
                    txtPPrice.setText(rs.getString("PROPERTY_PRICE"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GUIEditPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(number == 3){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql = "SELECT * FROM PROPERTY WHERE PROPERTY_ID = " + number;
                ResultSet rs = s.executeQuery(sql);
                
                while(rs.next()){
                    txtPName.setText(rs.getString("PROPERTY_NAME"));
                    txtPPrice.setText(rs.getString("PROPERTY_PRICE"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(GUIEditPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private boolean setStatus(){
        boolean a = true;
        Object selected = cbStatus.getSelectedItem();
        if(selected.toString().equals("Available")){
            a = true;
        }
        else if(selected.toString().equals("Unavailable")){
            a = false;
        }
        return a;
    }
    
    private String setSaleOrRent(){
        String a = "";
        Object selected = cbSaleOrRent.getSelectedItem();
        if(selected.toString().equals("Sale")){
            a = "Sale";
        }
        else if(selected.toString().equals("Rent")){
            a = "Rent";
        }
        return a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPName = new javax.swing.JTextField();
        txtPPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        btnConfirmUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbSaleOrRent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit");
        setResizable(false);

        txtPName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtPPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Property Name");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Property Price");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Property Status");

        cbStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable" }));

        btnConfirmUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConfirmUpdate.setText("Confirm");
        btnConfirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUpdateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("For Sale/Rent");

        cbSaleOrRent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbSaleOrRent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sale", "Rent" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPName)
                            .addComponent(txtPPrice)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cbSaleOrRent, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnConfirmUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSaleOrRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmUpdate)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUpdateActionPerformed
        // TODO add your handling code here:
        Property p = new Property(number, txtPName.getText(), txtPPrice.getText(), setStatus(), setSaleOrRent());
        p.updateProperty();
        dispose();
    }//GEN-LAST:event_btnConfirmUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEditPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEditPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEditPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEditPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEditPropertyPage(number).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmUpdate;
    private javax.swing.JComboBox<String> cbSaleOrRent;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPPrice;
    // End of variables declaration//GEN-END:variables

}
