package javaassignment2;

public class PropertyPage extends javax.swing.JFrame {
    public PropertyPage() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Property Search!");
        setResizable(false);

        propertyPic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p1.png"))); // NOI18N

        propertyPic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaassignment2/p2.png"))); // NOI18N

        lblPropertyName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName.setText("Property Name");

        lblPropertyType.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType.setText("Type");

        lblPropertyStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus.setText("Availability");

        lblPropertyStatus1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyStatus1.setText("Availability");

        lblPropertyName1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyName1.setText("Property Name");

        lblPropertyType1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPropertyType1.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(propertyPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(propertyPic2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblPropertyName)
                        .addComponent(lblPropertyStatus, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPropertyType, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblPropertyName1)
                        .addComponent(lblPropertyStatus1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPropertyType1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyPic1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPropertyName)
                        .addGap(18, 18, 18)
                        .addComponent(lblPropertyType)
                        .addGap(23, 23, 23)
                        .addComponent(lblPropertyStatus)))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyPic2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPropertyName1)
                        .addGap(18, 18, 18)
                        .addComponent(lblPropertyType1)
                        .addGap(18, 18, 18)
                        .addComponent(lblPropertyStatus1)))
                .addContainerGap(116, Short.MAX_VALUE))
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
    private javax.swing.JLabel lblPropertyName;
    private javax.swing.JLabel lblPropertyName1;
    private javax.swing.JLabel lblPropertyStatus;
    private javax.swing.JLabel lblPropertyStatus1;
    private javax.swing.JLabel lblPropertyType;
    private javax.swing.JLabel lblPropertyType1;
    private javax.swing.JLabel propertyPic1;
    private javax.swing.JLabel propertyPic2;
    // End of variables declaration//GEN-END:variables

}
