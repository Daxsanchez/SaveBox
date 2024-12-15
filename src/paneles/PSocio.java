package paneles;

import controladores.CSocio;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelos.Socio;
import utilerias.IconCellRenderer;
import ventanas.VInicio;
import ventanas.VRegistrarSocio;
//import ventanas.VRegistrarSocio;

/**
 *
 * @author daxsa
 */
public class PSocio extends javax.swing.JPanel {

    private DefaultTableModel tbl;
    private VInicio vInicio = new VInicio();
    private ArrayList<Socio> socios = new ArrayList<>();
    private ImageIcon icon;

    public PSocio(VInicio ini) {
        initComponents();
        vInicio = ini;
        this.dp = ini.getDesktopPane();
        socios = CSocio.getSociosActivos();
        tbl = (DefaultTableModel) tblSocios.getModel();
        icon = new ImageIcon(getClass().getResource("/imagenes/avatarAzul.png"));
        tabla();

        tblSocios.getColumnModel().getColumn(0).setCellRenderer(new IconCellRenderer());
        eventoTabla();
    }

    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; socios.size() > i; i++) {
            String nombreCompleto = socios.get(i).getNombre() + " " + socios.get(i).getApellidos();
            tbl.addRow(new Object[]{
                icon, nombreCompleto, socios.get(i).getCorreo(),
                socios.get(i).getFechaCreacion(), socios.get(i).getEstatus() == 1 ? "Activo" : "Inactivo"});
        }
    }

    private void eventoTabla() {
        PSocio ps = this;
        tblSocios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tblSocios.getSelectedRow();
                    if (selectedRow != -1) {
                        Socio socio = socios.get(tblSocios.getSelectedRow());

                        VRegistrarSocio registrarUsuario = new VRegistrarSocio(ps, socio);
                        registrarUsuario.setSize(376, 750);
                        registrarUsuario.setVisible(true);
                        dp.setLayout(null);
                        if (dp != null) {
                            try {
                                vInicio.centrarInternalFrame(registrarUsuario, dp);
                                dp.add(registrarUsuario);

                                registrarUsuario.setSelected(true);
                            } catch (java.beans.PropertyVetoException ex) {
                                System.out.println(ex);
                            }
                        }
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltra = new javax.swing.ButtonGroup();
        dp = new javax.swing.JDesktopPane();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        jLabel18 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbAgregar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSocios = new javax.swing.JTable();
        helpCentro1 = new help.helpCentro();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(10);
        panelRedondeado1.setRoundBottomRight(10);
        panelRedondeado1.setRoundTopLeft(10);
        panelRedondeado1.setRoundTopRight(10);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Socios Registrados");
        panelRedondeado1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, 419, -1));

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(30);
        panelRedondeado2.setRoundBottomRight(30);
        panelRedondeado2.setRoundTopLeft(30);
        panelRedondeado2.setRoundTopRight(30);

        txtBuscar.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(7, 20, 123));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (1).png"))); // NOI18N

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado1.add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        lbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        lbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarMouseClicked(evt);
            }
        });
        panelRedondeado1.add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, -1));
        panelRedondeado1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 840, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblSocios.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
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
        jScrollPane1.setViewportView(tblSocios);

        panelRedondeado1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 124, 1300, 498));
        panelRedondeado1.add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        bgFiltra.add(rbActivo);
        rbActivo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbActivo.setForeground(new java.awt.Color(255, 255, 255));
        rbActivo.setSelected(true);
        rbActivo.setText("Activos");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });
        panelRedondeado1.add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, -1, -1));

        bgFiltra.add(rbInactivo);
        rbInactivo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbInactivo.setForeground(new java.awt.Color(255, 255, 255));
        rbInactivo.setText("Inactivos");
        rbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInactivoActionPerformed(evt);
            }
        });
        panelRedondeado1.add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, -1, -1));

        dp.setLayer(panelRedondeado1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        txtBuscar.setText("Buscar");
    }//GEN-LAST:event_txtBuscarFocusLost

    private void lbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarMouseClicked
        VRegistrarSocio registrarSocio = new VRegistrarSocio(this);
        registrarSocio.setSize(376, 750);
        registrarSocio.setVisible(true);
        dp.setLayout(null);
        dp.setLayout(null);
        if (dp != null) {
            vInicio.centrarInternalFrame(registrarSocio, dp);
            dp.add(registrarSocio);
            try {
                registrarSocio.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("No se encontró un JDesktopPane para añadir el InternalFrame");
        }
    }//GEN-LAST:event_lbAgregarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            socios = CSocio.getRegistros();
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void rbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInactivoActionPerformed
        tblSocios.clearSelection();
        socios = CSocio.getSociosInactivos();
        tabla();
    }//GEN-LAST:event_rbInactivoActionPerformed

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
        tblSocios.clearSelection();
        socios = CSocio.getSociosActivos();
        tabla();
    }//GEN-LAST:event_rbActivoActionPerformed

    private void buscar() {
        socios = CSocio.porNombre(txtBuscar.getText());
        tabla();
    }

    public void actualizarTabla() {
        tblSocios.clearSelection();
        rbActivo.setSelected(true);
        socios = CSocio.getSociosActivos();
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFiltra;
    private javax.swing.JDesktopPane dp;
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAgregar;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JTable tblSocios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
