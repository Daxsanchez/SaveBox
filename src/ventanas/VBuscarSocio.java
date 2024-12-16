package ventanas;

import controladores.CSocio;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import modelos.Socio;
import paneles.PRealizarPrestamo;
import utilerias.IconCellRenderer;

/**
 *
 * @author daxsa
 */
public class VBuscarSocio extends javax.swing.JInternalFrame {

    private PRealizarPrestamo pRealizarP = null;
    private ArrayList<Socio> socios = new ArrayList<>();
    private DefaultTableModel tbl;
    private Icon icon;
    private int clickTabla = 0;
    private Socio socioSelectAnterior = new Socio();

    public VBuscarSocio(PRealizarPrestamo rp) {
        initComponents();
        pRealizarP = rp;
        tbl = (DefaultTableModel) tblSocios.getModel();
        socios = CSocio.getSociosActivos();
        icon = new ImageIcon(getClass().getResource("/imagenes/avatarAzul.png"));
        tabla();

        tblSocios.getColumnModel().getColumn(0).setCellRenderer(new IconCellRenderer());
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; socios.size() > i; i++) {
            String nombreCompleto = socios.get(i).getNombre() + " " + socios.get(i).getApellidos();
            tbl.addRow(new Object[]{
                icon, nombreCompleto, socios.get(i).getCorreo(), socios.get(i).getTelefono(),
                socios.get(i).getFechaCreacion(), socios.get(i).getEstatus() == 1 ? "Activo" : "Inactivo"});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltra = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        lbTitulo = new javax.swing.JLabel();
        rbTelefono = new javax.swing.JRadioButton();
        rbNombre = new javax.swing.JRadioButton();
        rbCorreo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSocios = new javax.swing.JTable();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        txtBuscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Buscar Socio");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(20);
        panelRedondeado1.setRoundBottomRight(20);
        panelRedondeado1.setRoundTopLeft(20);
        panelRedondeado1.setRoundTopRight(20);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        lbTitulo.setText("Buscar Socio");
        panelRedondeado1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 290, -1));

        jPanel1.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        bgFiltra.add(rbTelefono);
        rbTelefono.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbTelefono.setForeground(new java.awt.Color(7, 20, 123));
        rbTelefono.setText("Teléfono");
        rbTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(rbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        bgFiltra.add(rbNombre);
        rbNombre.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbNombre.setForeground(new java.awt.Color(7, 20, 123));
        rbNombre.setSelected(true);
        rbNombre.setText("Nombre");
        rbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNombreActionPerformed(evt);
            }
        });
        jPanel1.add(rbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        bgFiltra.add(rbCorreo);
        rbCorreo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbCorreo.setForeground(new java.awt.Color(7, 20, 123));
        rbCorreo.setText("Correo");
        rbCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(rbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblSocios.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        tblSocios.setForeground(new java.awt.Color(7, 20, 123));
        tblSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Nombre", "Correo", "Fecha registro", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSocios.setGridColor(new java.awt.Color(255, 255, 255));
        tblSocios.setRowHeight(50);
        tblSocios.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblSocios.getTableHeader().setResizingAllowed(false);
        tblSocios.getTableHeader().setReorderingAllowed(false);
        tblSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSociosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSocios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 490, 230));

        panelRedondeado2.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado2.setRoundBottomLeft(25);
        panelRedondeado2.setRoundBottomRight(25);
        panelRedondeado2.setRoundTopLeft(25);
        panelRedondeado2.setRoundTopRight(25);
        panelRedondeado2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBackground(new java.awt.Color(7, 20, 123));
        txtBuscar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        panelRedondeado2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 6, 360, 30));

        jPanel1.add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 390, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            socios = CSocio.getSociosActivos();
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void rbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNombreActionPerformed
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            socios = CSocio.getSociosActivos();
            tabla();
        }
    }//GEN-LAST:event_rbNombreActionPerformed

    private void rbCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCorreoActionPerformed
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            socios = CSocio.getSociosActivos();
            tabla();
        }
    }//GEN-LAST:event_rbCorreoActionPerformed

    private void rbTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTelefonoActionPerformed
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            socios = CSocio.getSociosActivos();
            tabla();
        }
    }//GEN-LAST:event_rbTelefonoActionPerformed

    private void tblSociosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSociosMousePressed
        Socio socioSelect = socios.get(tblSocios.getSelectedRow());
        if (clickTabla > 0 && socioSelect.equals(socioSelectAnterior)) {
            pRealizarP.seleccionarSocio(socioSelect);
            clickTabla = 0;
            this.dispose();
        } else {
            socioSelectAnterior = socios.get(tblSocios.getSelectedRow());
            clickTabla += 1;
        }
    }//GEN-LAST:event_tblSociosMousePressed

    private void buscar() {
        if (rbNombre.isSelected()) {
            socios = CSocio.porNombre(txtBuscar.getText(), true);
        } else if (rbCorreo.isSelected()) {
            socios = CSocio.porCorreo(txtBuscar.getText(), true);
        } else {
            socios = CSocio.porTelefono(txtBuscar.getText(), true);
        }
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFiltra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JRadioButton rbCorreo;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JRadioButton rbTelefono;
    private javax.swing.JTable tblSocios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
