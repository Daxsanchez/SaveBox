package paneles;

import controladores.CSocio;
import controladores.CUsuario;
import java.util.ArrayList;
import java.util.Date;
import modelos.Socio;
import modelos.Usuario;
import utilerias.Utileria;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PHistorialTransacciones extends javax.swing.JPanel {

    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private VInicio vInicio = new VInicio();

    public PHistorialTransacciones(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        cargarParametros();
    }

    private void cargarParametros() {
        socios = CSocio.getRegistros();
        for (Socio s : socios) {
            cmbCliente.addItem(s.getNombre() + " " + s.getApellidos());
        }
        rbAbono.setSelected(true);
        usuarios = CUsuario.getRegistros();
        for (Usuario u : usuarios) {
            cmbUsuario.addItem(u.getNombre() + " " + u.getApellidos());
        }
        ftMontoMenor.setValue(0);
        ftMontoMayor.setValue(0);
        Date fechaI = Utileria.sumarRestarDias(new Date(), -60);
        Date fechaF = new Date();
        dcFechaInicial.setDate(fechaI);
        dcFechaFinal.setDate(fechaF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        rbRetiro = new javax.swing.JRadioButton();
        rbDeposito = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dcFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        ftMontoMenor = new javax.swing.JFormattedTextField();
        ftMontoMayor = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        dcFechaInicial = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransacciones = new javax.swing.JTable();
        rbAbono = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 70, 30));

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un cliente" }));
        jPanel1.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 30));

        jLabel2.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 20, 123));
        jLabel2.setText("Fecha final:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 100, 30));

        bgGrupo.add(rbRetiro);
        rbRetiro.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbRetiro.setForeground(new java.awt.Color(7, 20, 123));
        rbRetiro.setText("Retiro");
        jPanel1.add(rbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        bgGrupo.add(rbDeposito);
        rbDeposito.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbDeposito.setForeground(new java.awt.Color(7, 20, 123));
        rbDeposito.setText("Deposito");
        jPanel1.add(rbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 20, 123));
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 50, 30));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona usuario" }));
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 230, 30));

        jLabel4.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 20, 123));
        jLabel4.setText("Socio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, 30));

        jLabel5.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 20, 123));
        jLabel5.setText("Monto menor a:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));
        jPanel1.add(dcFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 230, 30));

        jLabel6.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 20, 123));
        jLabel6.setText("Monto mayor a:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 140, 30));
        jPanel1.add(ftMontoMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));
        jPanel1.add(ftMontoMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 190, 30));

        jLabel7.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 20, 123));
        jLabel7.setText("Fecha inicial:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 110, 30));
        jPanel1.add(dcFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 230, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblTransacciones.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblTransacciones.setForeground(new java.awt.Color(7, 20, 123));
        tblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Socio", "Tipo", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransacciones.setGridColor(new java.awt.Color(255, 255, 255));
        tblTransacciones.setRowHeight(50);
        tblTransacciones.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblTransacciones.getTableHeader().setResizingAllowed(false);
        tblTransacciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTransacciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1180, 350));

        bgGrupo.add(rbAbono);
        rbAbono.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbAbono.setForeground(new java.awt.Color(7, 20, 123));
        rbAbono.setText("Abono Préstamo");
        jPanel1.add(rbAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarAzul.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 70, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        vInicio.abrirInicio();
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupo;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbUsuario;
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaInicial;
    private javax.swing.JFormattedTextField ftMontoMayor;
    private javax.swing.JFormattedTextField ftMontoMenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbAbono;
    private javax.swing.JRadioButton rbDeposito;
    private javax.swing.JRadioButton rbRetiro;
    private javax.swing.JTable tblTransacciones;
    // End of variables declaration//GEN-END:variables
}
