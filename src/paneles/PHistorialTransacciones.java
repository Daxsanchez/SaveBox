package paneles;

/**
 *
 * @author daxsa
 */
public class PHistorialTransacciones extends javax.swing.JPanel {

    
    
    public PHistorialTransacciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(7, 20, 123));
        jLabel18.setText("Historial Transacciones");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 419, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1350, 10));

        jLabel1.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 20, 123));
        jLabel1.setText("Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, 30));

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un cliente" }));
        jPanel1.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 640));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
