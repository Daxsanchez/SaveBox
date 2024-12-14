package paneles;

import controladores.CAbonoPrestamo;
import controladores.CDeposito;
import controladores.CRetiro;
import controladores.CSocio;
import controladores.CUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.AbonoPrestamo;
import modelos.Deposito;
import modelos.Retiro;
import modelos.Socio;
import modelos.Usuario;
import ventanas.VInicio;

/**
 *
 * @author daxsa
 */
public class PHistorialTransacciones extends javax.swing.JPanel {

    private DefaultTableModel tbl;
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<AbonoPrestamo> abonos = new ArrayList<>();
    private ArrayList<Deposito> depositos = new ArrayList<>();
    private ArrayList<Retiro> retiros = new ArrayList<>();
    private VInicio vInicio = new VInicio();

    public PHistorialTransacciones(VInicio vIni) {
        initComponents();
        vInicio = vIni;
        tbl = (DefaultTableModel) tblTransacciones.getModel();
        cargarParametros();
        tablaAbonoP();
    }

    private void cargarParametros() {
        socios = CSocio.getRegistros();
        for (Socio s : socios) {
            cmbSocio.addItem(s.getNombre() + " " + s.getApellidos());
        }
        rbAbono.setSelected(true);
        usuarios = CUsuario.getRegistros();
        for (Usuario u : usuarios) {
            cmbUsuario.addItem(u.getNombre() + " " + u.getApellidos());
        }
        ftMontoMenor.setValue(null);
        ftMontoMayor.setValue(null);
        dcFechaInicial.setDate(null);
        dcFechaFinal.setDate(null);
        rbAbono.setSelected(true);
        abonos = CAbonoPrestamo.getHistorialAbonos(null, null, null, null, null, null);
    }

    private void tablaAbonoP() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; abonos.size() > i; i++) {
            tbl.addRow(new Object[]{
                abonos.get(i).getPrestamo().getSocio().getNombre() + " " + abonos.get(i).getPrestamo().getSocio().getApellidos(),
                abonos.get(i).getUsuario().getNombre(), abonos.get(i).getMonto(),
                abonos.get(i).getFecha()});
        }
    }

    private void tablaDeposito() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; depositos.size() > i; i++) {
            tbl.addRow(new Object[]{
                depositos.get(i).getAhorro().getSocio().getNombre() + " " + depositos.get(i).getAhorro().getSocio().getApellidos(),
                depositos.get(i).getUsuario().getNombre(), depositos.get(i).getMonto(),
                depositos.get(i).getFecha()});
        }
    }

    private void tablaRetiro() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; retiros.size() > i; i++) {
            tbl.addRow(new Object[]{
                retiros.get(i).getAhorro().getSocio().getNombre() + " " + retiros.get(i).getAhorro().getSocio().getApellidos(),
                retiros.get(i).getUsuario().getNombre(), retiros.get(i).getMonto(),
                retiros.get(i).getFecha()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmbSocio = new javax.swing.JComboBox<>();
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
        btnFiltrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 70, 30));

        cmbSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jPanel1.add(cmbSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 30));

        jLabel2.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 20, 123));
        jLabel2.setText("Fecha final:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 100, 30));

        bgGrupo.add(rbRetiro);
        rbRetiro.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbRetiro.setForeground(new java.awt.Color(7, 20, 123));
        rbRetiro.setText("Retiro");
        jPanel1.add(rbRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        bgGrupo.add(rbDeposito);
        rbDeposito.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbDeposito.setForeground(new java.awt.Color(7, 20, 123));
        rbDeposito.setText("Deposito");
        jPanel1.add(rbDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 20, 123));
        jLabel3.setText("Tipo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 50, 30));

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        jPanel1.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 70, 230, 30));

        jLabel4.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 20, 123));
        jLabel4.setText("Socio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, 30));

        jLabel5.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 20, 123));
        jLabel5.setText("Monto mayor a:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));
        jPanel1.add(dcFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 230, 30));

        jLabel6.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 20, 123));
        jLabel6.setText("Monto menor a:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 30));
        jPanel1.add(ftMontoMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, 30));
        jPanel1.add(ftMontoMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 230, 30));

        jLabel7.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 20, 123));
        jLabel7.setText("Fecha inicial:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 110, 30));
        jPanel1.add(dcFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 230, 30));

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
                "Socio", "Usuario", "Monto", "Fecha"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1250, 320));

        bgGrupo.add(rbAbono);
        rbAbono.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        rbAbono.setForeground(new java.awt.Color(7, 20, 123));
        rbAbono.setText("Abono Préstamo");
        jPanel1.add(rbAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresarAzul.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 70, -1, -1));

        btnFiltrar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        btnFiltrar.setForeground(new java.awt.Color(7, 20, 123));
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/filtrar.png"))); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 130, 40));

        jButton1.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(7, 20, 123));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        vInicio.abrirInicio();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        filtrar();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarParametros();
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiar() {
        cmbSocio.setSelectedIndex(0);
        cmbUsuario.setSelectedIndex(0);
        dcFechaInicial.setDate(null);
        dcFechaFinal.setDate(null);
        ftMontoMenor.setText("");
        ftMontoMayor.setText("");
    }

    private void filtrar() {
        if (rbAbono.isSelected()) {
            filtrarAbonoP();
        } else if (rbDeposito.isSelected()) {
            filtrarDeposito();
        } else {
            filtrarRetiro();
        }
    }

    private void filtrarAbonoP() {
        Integer idSocio = 0, idUsuario = 0;
        if (cmbSocio.getSelectedIndex() == 0) {
            idSocio = null;
        } else {
            idSocio = socios.get(cmbSocio.getSelectedIndex() - 1).getId();
        }
        if (cmbUsuario.getSelectedIndex() == 0) {
            idUsuario = null;
        } else {
            idUsuario = usuarios.get(cmbUsuario.getSelectedIndex() - 1).getId();
        }
        Double montoMenor = null, montoMayor = null;
        if (!ftMontoMenor.getText().isEmpty()) {
            montoMenor = Double.valueOf(ftMontoMenor.getText());
        }
        if (!ftMontoMayor.getText().isEmpty()) {
            montoMayor = Double.valueOf(ftMontoMayor.getText());
        }
        abonos = CAbonoPrestamo.getHistorialAbonos(idSocio, idUsuario,
                montoMenor, montoMayor,
                dcFechaInicial.getDate(), dcFechaFinal.getDate());

        tablaAbonoP();
    }

    private void filtrarDeposito() {
        Integer idSocio = 0, idUsuario = 0;
        if (cmbSocio.getSelectedIndex() == 0) {
            idSocio = null;
        } else {
            idSocio = cmbSocio.getSelectedIndex();
        }
        if (cmbUsuario.getSelectedIndex() == 0) {
            idUsuario = null;
        } else {
            idUsuario = cmbUsuario.getSelectedIndex();
        }
        Double montoMenor = null, montoMayor = null;
        if (!ftMontoMenor.getText().isEmpty()) {
            montoMenor = Double.valueOf(ftMontoMenor.getText());
        }
        if (!ftMontoMayor.getText().isEmpty()) {
            montoMayor = Double.valueOf(ftMontoMayor.getText());
        }
        depositos = CDeposito.getHistorialDepositos(idSocio, idUsuario,
                montoMenor, montoMayor,
                dcFechaInicial.getDate(), dcFechaFinal.getDate());

        tablaDeposito();
    }

    public void filtrarRetiro() {
        Integer idSocio = 0, idUsuario = 0;
        if (cmbSocio.getSelectedIndex() == 0) {
            idSocio = null;
        } else {
            idSocio = cmbSocio.getSelectedIndex();
        }
        if (cmbUsuario.getSelectedIndex() == 0) {
            idUsuario = null;
        } else {
            idUsuario = cmbUsuario.getSelectedIndex();
        }
        Double montoMenor = null, montoMayor = null;
        if (!ftMontoMenor.getText().isEmpty()) {
            montoMenor = Double.valueOf(ftMontoMenor.getText());
        }
        if (!ftMontoMayor.getText().isEmpty()) {
            montoMayor = Double.valueOf(ftMontoMayor.getText());
        }
        retiros = CRetiro.getHistorialRetiros(idSocio, idUsuario,
                montoMenor, montoMayor,
                dcFechaInicial.getDate(), dcFechaFinal.getDate());

        tablaRetiro();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGrupo;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JComboBox<String> cmbSocio;
    private javax.swing.JComboBox<String> cmbUsuario;
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaInicial;
    private javax.swing.JFormattedTextField ftMontoMayor;
    private javax.swing.JFormattedTextField ftMontoMenor;
    private javax.swing.JButton jButton1;
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
