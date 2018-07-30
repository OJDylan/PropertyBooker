package javaassignment2.GUIForms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class GUIPropertyPage extends javax.swing.JFrame {
    public GUIPropertyPage() {
        initComponents();
        assignProperty();
        tblProperty.setDefaultEditor(Object.class, null);
    }
    
    public void assignProperty(){
        try {
            Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
            String sql ="SELECT PROPERTY_NAME as Property, PROPERTY_TYPE as Type, TENURE as Tenure, PROPERTY_STATE as STATE FROM PROPERTY WHERE PROPERTY_STATUS = true";
            ResultSet rs = s.executeQuery(sql);
            tblProperty.setModel(DbUtils.resultSetToTableModel(rs));
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
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProperty = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Search!");
        setResizable(false);

        cbPropertyType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbPropertyType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Apartment", "Condominium", "Terrace", "Semi-Detachable" }));

        cbPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbPropertyStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Sale", "Rent" }));

        cbState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Kuala Lumpur", "Selangor", "Penang" }));

        lblCBPropertyType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBPropertyType.setText("Type");

        lblCBPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBPropertyStatus.setText("Sales/Rent");

        lblCBState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCBState.setText("State");

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch.setText("Search!");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

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
                    .addComponent(lblCBPropertyStatus)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbPropertyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
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
                    .addComponent(cbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap())
        );

        tblProperty.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tblProperty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProperty.setToolTipText("");
        tblProperty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblProperty.setMinimumSize(new java.awt.Dimension(105, 64));
        tblProperty.setName(""); // NOI18N
        tblProperty.setRowHeight(30);
        tblProperty.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblProperty.setShowVerticalLines(false);
        tblProperty.getTableHeader().setReorderingAllowed(false);
        tblProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPropertyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProperty);
        tblProperty.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblProperty.getColumnModel().getColumnCount() > 0) {
            tblProperty.getColumnModel().getColumn(0).setResizable(false);
            tblProperty.getColumnModel().getColumn(1).setResizable(false);
            tblProperty.getColumnModel().getColumn(2).setResizable(false);
            tblProperty.getColumnModel().getColumn(3).setResizable(false);
        }

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        GUILogIn l = new GUILogIn();
        l.run();
    }//GEN-LAST:event_menuitemLogoutActionPerformed

    private void tblPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPropertyMouseClicked
        // TODO add your handling code here:
        int row = tblProperty.rowAtPoint(evt.getPoint());
        int col = tblProperty.columnAtPoint(evt.getPoint());
        if(tblProperty.getValueAt(row,col).toString().equals("IJM The Loof")){
            GUIPropertyDetails pd = new GUIPropertyDetails(1);
            pd.run();
        } else if(tblProperty.getValueAt(row,col).toString().equals("SETIA The Pyramid")){
            GUIPropertyDetails pd = new GUIPropertyDetails(2);
            pd.run();
        } else if(tblProperty.getValueAt(row,col).toString().equals("ECOWORLD The Place")){
            GUIPropertyDetails pd = new GUIPropertyDetails(3);
            pd.run();
        }
    }//GEN-LAST:event_tblPropertyMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Object state = cbState.getSelectedItem();
        Object type = cbPropertyType.getSelectedItem();
        Object ros = cbPropertyStatus.getSelectedItem();
        if(state.toString().equals("All") && type.toString().equals("All") && ros.toString().equals("All")){
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql ="SELECT PROPERTY_NAME as Property, PROPERTY_TYPE as Type, TENURE as Tenure, PROPERTY_STATE as STATE FROM PROPERTY WHERE PROPERTY_STATUS = true";
                ResultSet rs = s.executeQuery(sql);
                tblProperty.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Statement s = DriverManager.getConnection("jdbc:derby://localhost:1527/javaassignment", "Dylan", "001").createStatement();
                String sql ="SELECT PROPERTY_NAME as Property, PROPERTY_TYPE as Type, TENURE as Tenure, PROPERTY_STATE as STATE FROM PROPERTY WHERE PROPERTY_STATUS = true " +
                            "AND PROPERTY_STATE = " + "'" + state + "'" +
                            "OR PROPERTY_TYPE = " + "'" + type + "'" +
                            "OR SALE_RENT = " + "'" + ros + "'";
                ResultSet rs = s.executeQuery(sql);
                tblProperty.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(GUIPropertyPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbPropertyStatus;
    private javax.swing.JComboBox<String> cbPropertyType;
    private javax.swing.JComboBox<String> cbState;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCBPropertyStatus;
    private javax.swing.JLabel lblCBPropertyType;
    private javax.swing.JLabel lblCBState;
    private javax.swing.JMenuItem menuitemLogout;
    private javax.swing.JTable tblProperty;
    // End of variables declaration//GEN-END:variables

}
