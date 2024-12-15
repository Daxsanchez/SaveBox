package paneles;

import controladores.CUsuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelos.Usuario;
import utilerias.IconCellRenderer;
import ventanas.VInicio;
import ventanas.VRegistrarUsuario;

/**
 *
 * @author daxsa
 */
public class PUsuario extends javax.swing.JPanel {
    
    private DefaultTableModel tbl;
    private VInicio vInicio;
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ImageIcon icon;
    
    public PUsuario(VInicio ini) {
        initComponents();
        vInicio = ini;
        this.dp = vInicio.getDesktopPane();
        
        usuarios = CUsuario.getUsuariosActivos();
        tbl = (DefaultTableModel) tblUsuarios.getModel();
        icon = new ImageIcon(getClass().getResource("/imagenes/avatarAzul.png"));
        tabla();
        
        tblUsuarios.getColumnModel().getColumn(0).setCellRenderer(new IconCellRenderer());
        
        eventoTabla();
    }
    
    private void tabla() {
        int filas = tbl.getRowCount();
        for (int i = 0; i < filas; i++) {
            tbl.removeRow(0);
        }
        for (int i = 0; usuarios.size() > i; i++) {
            tbl.addRow(new Object[]{
                icon, usuarios.get(i).getNombre() + " " + usuarios.get(i).getApellidos(),
                usuarios.get(i).getCorreo(), usuarios.get(i).getRol(),
                usuarios.get(i).getFechaCreacion(), usuarios.get(i).getEstatus() == 1 ? "Activo" : "Inactivo"});
        }
    }
    
    private void eventoTabla() {
        PUsuario pUs = this;
        tblUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tblUsuarios.getSelectedRow();
                    if (selectedRow != -1) {
                        Usuario us = usuarios.get(tblUsuarios.getSelectedRow());
                        
                        VRegistrarUsuario registrarUsuario = new VRegistrarUsuario(pUs, us);
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

        bgEstatus = new javax.swing.ButtonGroup();
        dp = new javax.swing.JDesktopPane();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        jLabel18 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbAgregar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        helpCentro1 = new help.helpCentro();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1216, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(10);
        panelRedondeado1.setRoundBottomRight(10);
        panelRedondeado1.setRoundTopLeft(10);
        panelRedondeado1.setRoundTopRight(10);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Usuarios Registrados");
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

        panelRedondeado1.add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        lbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarUsuario.png"))); // NOI18N
        lbAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAgregarMouseClicked(evt);
            }
        });
        panelRedondeado1.add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, -1, -1));
        panelRedondeado1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 931, 10));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblUsuarios.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(7, 20, 123));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Foto", "Nombre", "Correo", "Rol", "Fecha registro", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tblUsuarios.setRowHeight(50);
        tblUsuarios.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuarios);

        panelRedondeado1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 1300, 486));
        panelRedondeado1.add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        bgEstatus.add(rbActivo);
        rbActivo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbActivo.setForeground(new java.awt.Color(255, 255, 255));
        rbActivo.setSelected(true);
        rbActivo.setText("Activos");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });
        panelRedondeado1.add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, -1, -1));

        bgEstatus.add(rbInactivo);
        rbInactivo.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        rbInactivo.setForeground(new java.awt.Color(255, 255, 255));
        rbInactivo.setText("Inactivos");
        rbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInactivoActionPerformed(evt);
            }
        });
        panelRedondeado1.add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusGained
        txtBuscar.setText("");
    }//GEN-LAST:event_txtBuscarFocusGained

    private void lbAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAgregarMouseClicked
        VRegistrarUsuario registrarUsuario = new VRegistrarUsuario(this);
        registrarUsuario.setSize(376, 750);
        registrarUsuario.setVisible(true);
        dp.setLayout(null);
        
        if (dp != null) {
            try {
                vInicio.centrarInternalFrame(registrarUsuario, dp);
                dp.add(registrarUsuario);
                registrarUsuario.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_lbAgregarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (!txtBuscar.getText().isEmpty()) {
            buscar();
        } else {
            usuarios = CUsuario.getRegistros();
            tabla();
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
        tblUsuarios.clearSelection();
        usuarios = CUsuario.getUsuariosActivos();
        tabla();
    }//GEN-LAST:event_rbActivoActionPerformed

    private void rbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInactivoActionPerformed
        tblUsuarios.clearSelection();
        usuarios = CUsuario.getUsuariosInactivos();
        tabla();
    }//GEN-LAST:event_rbInactivoActionPerformed
    
    private void buscar() {
        usuarios = CUsuario.porNombre(txtBuscar.getText());
        tabla();
    }
    
    public void actualizarTabla() {
        tblUsuarios.clearSelection();
        rbActivo.setSelected(true);
        usuarios = CUsuario.getUsuariosActivos();
        tabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstatus;
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
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
