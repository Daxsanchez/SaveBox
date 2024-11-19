package ventanas;

import java.util.Date;

/**
 *
 * @author daxsa
 */
public class VRetirar extends javax.swing.JInternalFrame {

    public VRetirar() {
        initComponents();
        dcFecha.setDate(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        txtMonto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(7, 20, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(7, 20, 123));
        jLabel2.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Retirar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));
        jPanel1.add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 300, 30));

        panelRedondeado3.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado3.setRoundBottomLeft(50);
        panelRedondeado3.setRoundBottomRight(50);
        panelRedondeado3.setRoundTopLeft(50);
        panelRedondeado3.setRoundTopRight(50);
        panelRedondeado3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.setBackground(new java.awt.Color(7, 20, 123));
        txtMonto.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));
        txtMonto.setText("Monto");
        txtMonto.setBorder(null);
        txtMonto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMontoFocusLost(evt);
            }
        });
        panelRedondeado3.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 350, 30));

        jPanel1.add(panelRedondeado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 380, 40));

        jLabel1.setBackground(new java.awt.Color(7, 20, 123));
        jLabel1.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 20, 123));
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 60, 30));

        btnGuardar.setBackground(new java.awt.Color(7, 20, 123));
        btnGuardar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/retirar.png"))); // NOI18N
        btnGuardar.setText("Retirar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMontoFocusGained
        txtMonto.setText("");
    }//GEN-LAST:event_txtMontoFocusGained

    private void txtMontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMontoFocusLost
        if(txtMonto.getText().isEmpty()){
            txtMonto.setText("Monto");
        }
    }//GEN-LAST:event_txtMontoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private utilerias.PanelRedondeado panelRedondeado3;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
