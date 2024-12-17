package ventanas;

import controladores.CAbonoPrestamo;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Config;
import modelos.AbonoPrestamo;
import modelos.Prestamo;
import paneles.PPrestamos;

/**
 *
 * @author daxsa
 */
public class VAbonoPrestamo extends javax.swing.JInternalFrame {
    
    private Prestamo prestamo;
    private AbonoPrestamo abono = new AbonoPrestamo();
    private PPrestamos pPrestamo;
    
    public VAbonoPrestamo(PPrestamos pPres, Prestamo p) {
        initComponents();
        pPrestamo = pPres;
        prestamo = p;
        txtRestante.setEditable(false);
        Double saldoPendiente = prestamo.getSaldoRestante() + prestamo.getInteresPendiente();
        txtRestante.setText(saldoPendiente.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        txtMonto = new javax.swing.JFormattedTextField();
        cmbMetodo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAbonar = new javax.swing.JButton();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        txtRestante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbLiquidar = new javax.swing.JRadioButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(7, 20, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(7, 20, 123));
        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Abono");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));
        jPanel1.add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 310, 30));

        panelRedondeado3.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado3.setRoundBottomLeft(50);
        panelRedondeado3.setRoundBottomRight(50);
        panelRedondeado3.setRoundTopLeft(50);
        panelRedondeado3.setRoundTopRight(50);
        panelRedondeado3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.setBackground(new java.awt.Color(7, 20, 123));
        txtMonto.setBorder(null);
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));
        txtMonto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtMonto.setText("Monto");
        txtMonto.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtMonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMontoMouseClicked(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        panelRedondeado3.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2, 230, 40));

        jPanel1.add(panelRedondeado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 40));

        cmbMetodo.setBackground(new java.awt.Color(7, 20, 123));
        cmbMetodo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        cmbMetodo.setForeground(new java.awt.Color(255, 255, 255));
        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metodo de Pago", "Efectivo", "Transferencia", "Cheque" }));
        cmbMetodo.setBorder(null);
        jPanel1.add(cmbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 30));

        jLabel1.setBackground(new java.awt.Color(7, 20, 123));
        jLabel1.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 20, 123));
        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 30));

        btnAbonar.setBackground(new java.awt.Color(7, 20, 123));
        btnAbonar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        btnAbonar.setForeground(new java.awt.Color(255, 255, 255));
        btnAbonar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abonar.png"))); // NOI18N
        btnAbonar.setText("Abonar");
        btnAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 140, 40));

        panelRedondeado4.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado4.setRoundBottomLeft(50);
        panelRedondeado4.setRoundBottomRight(50);
        panelRedondeado4.setRoundTopLeft(50);
        panelRedondeado4.setRoundTopRight(50);
        panelRedondeado4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRestante.setEditable(false);
        txtRestante.setBackground(new java.awt.Color(7, 20, 123));
        txtRestante.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtRestante.setForeground(new java.awt.Color(255, 255, 255));
        txtRestante.setBorder(null);
        panelRedondeado4.add(txtRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, 260, 30));

        jPanel1.add(panelRedondeado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 290, 40));

        jLabel2.setBackground(new java.awt.Color(7, 20, 123));
        jLabel2.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 20, 123));
        jLabel2.setText("Restante:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        rbLiquidar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbLiquidar.setForeground(new java.awt.Color(7, 20, 123));
        rbLiquidar.setText("Liquidar");
        rbLiquidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLiquidarActionPerformed(evt);
            }
        });
        jPanel1.add(rbLiquidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonarActionPerformed
        boolean valida = validaciones();
        if (valida) {
            guardar();
        }
    }//GEN-LAST:event_btnAbonarActionPerformed

    private void rbLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLiquidarActionPerformed
        if (rbLiquidar.isSelected()) {
            txtMonto.setEditable(false);
            double restante = Double.parseDouble(txtRestante.getText());
            txtMonto.setValue(restante);
        } else {
            txtMonto.setEditable(true);
            txtMonto.setText("0");
        }
    }//GEN-LAST:event_rbLiquidarActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57 || key == 46;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtMontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMouseClicked
        txtMonto.setText("");
    }//GEN-LAST:event_txtMontoMouseClicked
    
    private boolean validaciones() {
        if (cmbMetodo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar un método de pago",
                    "Seleccione Método", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (dcFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe de seleccionar la fecha en la que se realizó el pago",
                    "Seleccione Fecha", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        double monto = Double.parseDouble(txtMonto.getText());
        if (monto > prestamo.getSaldoRestante()) {
            JOptionPane.showMessageDialog(this, "El monto no puede ser mayor al saldo restante",
                    "Monto inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void guardar() {
        abono.setFecha(dcFecha.getDate());
        abono.setMetodo(cmbMetodo.getSelectedItem().toString());
        abono.setMonto(Double.parseDouble(txtMonto.getValue().toString()));
        abono.setPrestamo(prestamo);
        abono.setUsuario(Config.getUsuarioLog());
        boolean guardado = CAbonoPrestamo.guardarRegistro(abono);
        if (guardado) {
            JOptionPane.showMessageDialog(this, "El abono ha sido registrado correctamente", "Abono Realizado",
                    JOptionPane.INFORMATION_MESSAGE);
            pPrestamo.actualizarTabla();
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbonar;
    private javax.swing.JComboBox<String> cmbMetodo;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private utilerias.PanelRedondeado panelRedondeado3;
    private utilerias.PanelRedondeado panelRedondeado4;
    private javax.swing.JRadioButton rbLiquidar;
    private javax.swing.JFormattedTextField txtMonto;
    private javax.swing.JTextField txtRestante;
    // End of variables declaration//GEN-END:variables
}
