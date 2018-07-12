package javaassignment2;

public class AdminPage extends javax.swing.JFrame {
    public AdminPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateReport = new javax.swing.JButton();
        menubarAdmin = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitemEdit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        btnCreateReport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCreateReport.setText("Create Booking Report");
        btnCreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReportActionPerformed(evt);
            }
        });

        jMenu1.setText("System");

        menuitemEdit.setText("Edit Property");
        menuitemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemEditActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemEdit);

        menubarAdmin.add(jMenu1);

        setJMenuBar(menubarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnCreateReport)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnCreateReport)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemEditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuitemEditActionPerformed

    private void btnCreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReportActionPerformed
        // TODO add your handling code here:
        BookingReport r = new BookingReport();
        r.run();
    }//GEN-LAST:event_btnCreateReportActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateReport;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menubarAdmin;
    private javax.swing.JMenuItem menuitemEdit;
    // End of variables declaration//GEN-END:variables

}
