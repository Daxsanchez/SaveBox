package ventanas;

import controladores.CUsuario;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Usuario;
import paneles.PUsuario;
import utilerias.Password;

/**
 *
 * @author rafae
 */
public class VRegistrarUsuario extends javax.swing.JInternalFrame {

    private boolean modifica = false;
    private Usuario usuario;
    private PUsuario pUsuario;
    private Icon iconEstatus = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
    private boolean estatus = true;

    public VRegistrarUsuario(PUsuario pUs) {
        initComponents();
        pUsuario = pUs;
        btnEstatus.setEnabled(false);
        btnEstatus.setIcon(iconEstatus);
    }

    public VRegistrarUsuario(PUsuario pUs, Usuario us) {
        initComponents();
        pUsuario = pUs;
        modifica = true;
        usuario = us;
        lbTitulo.setText("Usuario");
        txtNombre.setText(us.getNombre());
        txtApellidos.setText(us.getApellidos());
        txtDireccion.setText(us.getDireccion());
        txtUsuario.setText(us.getUsuario());
        cmbRol.setSelectedItem(us.getRol());
        pfPass.setText(us.getPass());

        estatus = usuario.getEstatus() == 1;
        if (estatus) {
            iconEstatus = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
            btnEstatus.setText("Eliminar");
        } else {
            iconEstatus = new ImageIcon(getClass().getResource("/imagenes/palomita.png"));
            btnEstatus.setText("Activar");
        }
        btnEstatus.setIcon(iconEstatus);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRedondeado14 = new utilerias.PanelRedondeado();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRedondeado11 = new utilerias.PanelRedondeado();
        txtApellidos = new javax.swing.JTextField();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        lbTitulo = new javax.swing.JLabel();
        panelRedondeado13 = new utilerias.PanelRedondeado();
        txtNombre = new javax.swing.JTextField();
        panelRedondeado15 = new utilerias.PanelRedondeado();
        txtUsuario = new javax.swing.JTextField();
        panelRedondeado17 = new utilerias.PanelRedondeado();
        txtDireccion = new javax.swing.JTextField();
        panelRedondeado24 = new utilerias.PanelRedondeado();
        pfPass = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        cmbRol = new javax.swing.JComboBox<>();
        btnEstatus = new javax.swing.JButton();

        panelRedondeado14.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado14.setRoundBottomLeft(16);
        panelRedondeado14.setRoundBottomRight(16);
        panelRedondeado14.setRoundTopLeft(16);
        panelRedondeado14.setRoundTopRight(16);

        javax.swing.GroupLayout panelRedondeado14Layout = new javax.swing.GroupLayout(panelRedondeado14);
        panelRedondeado14.setLayout(panelRedondeado14Layout);
        panelRedondeado14Layout.setHorizontalGroup(
            panelRedondeado14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
        panelRedondeado14Layout.setVerticalGroup(
            panelRedondeado14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 74, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Agrandir", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 20, 123));
        jLabel2.setText("Ingrese los siguientes datos:");

        panelRedondeado11.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado11.setRoundBottomLeft(16);
        panelRedondeado11.setRoundBottomRight(16);
        panelRedondeado11.setRoundTopLeft(16);
        panelRedondeado11.setRoundTopRight(16);

        txtApellidos.setBackground(new java.awt.Color(7, 20, 123));
        txtApellidos.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setText("Apellidos");
        txtApellidos.setBorder(null);
        txtApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidosFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado11Layout = new javax.swing.GroupLayout(panelRedondeado11);
        panelRedondeado11.setLayout(panelRedondeado11Layout);
        panelRedondeado11Layout.setHorizontalGroup(
            panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado11Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        panelRedondeado11Layout.setVerticalGroup(
            panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado11Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(20);
        panelRedondeado1.setRoundBottomRight(20);
        panelRedondeado1.setRoundTopLeft(20);
        panelRedondeado1.setRoundTopRight(20);

        lbTitulo.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/agregar-usuario (1).png"))); // NOI18N
        lbTitulo.setText("Nuevo Usuario");

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado13.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado13.setForeground(new java.awt.Color(51, 0, 204));
        panelRedondeado13.setRoundBottomLeft(16);
        panelRedondeado13.setRoundBottomRight(16);
        panelRedondeado13.setRoundTopLeft(16);
        panelRedondeado13.setRoundTopRight(16);

        txtNombre.setBackground(new java.awt.Color(7, 20, 123));
        txtNombre.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Nombre");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado13Layout = new javax.swing.GroupLayout(panelRedondeado13);
        panelRedondeado13.setLayout(panelRedondeado13Layout);
        panelRedondeado13Layout.setHorizontalGroup(
            panelRedondeado13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre)
                .addContainerGap())
        );
        panelRedondeado13Layout.setVerticalGroup(
            panelRedondeado13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRedondeado15.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado15.setRoundBottomLeft(16);
        panelRedondeado15.setRoundBottomRight(16);
        panelRedondeado15.setRoundTopLeft(16);
        panelRedondeado15.setRoundTopRight(16);

        txtUsuario.setBackground(new java.awt.Color(7, 20, 123));
        txtUsuario.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado15Layout = new javax.swing.GroupLayout(panelRedondeado15);
        panelRedondeado15.setLayout(panelRedondeado15Layout);
        panelRedondeado15Layout.setHorizontalGroup(
            panelRedondeado15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsuario)
                .addContainerGap())
        );
        panelRedondeado15Layout.setVerticalGroup(
            panelRedondeado15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado15Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        panelRedondeado17.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado17.setRoundBottomLeft(16);
        panelRedondeado17.setRoundBottomRight(16);
        panelRedondeado17.setRoundTopLeft(16);
        panelRedondeado17.setRoundTopRight(16);

        txtDireccion.setBackground(new java.awt.Color(7, 20, 123));
        txtDireccion.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setText("Direccion");
        txtDireccion.setBorder(null);
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado17Layout = new javax.swing.GroupLayout(panelRedondeado17);
        panelRedondeado17.setLayout(panelRedondeado17Layout);
        panelRedondeado17Layout.setHorizontalGroup(
            panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado17Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        panelRedondeado17Layout.setVerticalGroup(
            panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado17Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );

        panelRedondeado24.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado24.setRoundBottomLeft(16);
        panelRedondeado24.setRoundBottomRight(16);
        panelRedondeado24.setRoundTopLeft(16);
        panelRedondeado24.setRoundTopRight(16);

        pfPass.setBackground(new java.awt.Color(7, 20, 123));
        pfPass.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        pfPass.setForeground(new java.awt.Color(255, 255, 255));
        pfPass.setText("Contraseña");
        pfPass.setBorder(null);
        pfPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado24Layout = new javax.swing.GroupLayout(panelRedondeado24);
        panelRedondeado24.setLayout(panelRedondeado24Layout);
        panelRedondeado24Layout.setHorizontalGroup(
            panelRedondeado24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfPass)
                .addContainerGap())
        );
        panelRedondeado24Layout.setVerticalGroup(
            panelRedondeado24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(7, 20, 123));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbRol.setBackground(new java.awt.Color(7, 20, 123));
        cmbRol.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        cmbRol.setForeground(new java.awt.Color(255, 255, 255));
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un rol", "Administrador", "Gestor" }));

        btnEstatus.setText("Eliminar");
        btnEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(59, 59, 59))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panelRedondeado11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRol, 0, 311, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRedondeado13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelRedondeado11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelRedondeado17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(panelRedondeado15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelRedondeado24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre");
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusGained
        txtApellidos.setText("");
    }//GEN-LAST:event_txtApellidosFocusGained

    private void txtApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidosFocusLost
        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Apellidos");
        }
    }//GEN-LAST:event_txtApellidosFocusLost

    private void txtDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusGained
        txtDireccion.setText("");
    }//GEN-LAST:event_txtDireccionFocusGained

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
        if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setText("Telefono");
        }
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void pfPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusGained
        pfPass.setText("");
    }//GEN-LAST:event_pfPassFocusGained

    private void pfPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfPassFocusLost
        if (pfPass.getText().isEmpty()) {
            pfPass.setText("Contraseña");
        }
    }//GEN-LAST:event_pfPassFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!modifica) {
            guardar();
        } else {
            actualizar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatusActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea " + (estatus ? "eliminar" : "activar") + " esta usuario?",
                "Confirme esta acción", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            usuario.setEstatus(estatus ? 0 : 1);
            CUsuario.estatus(usuario);
            JOptionPane.showMessageDialog(null, "Usuario " + (estatus ? "eliminado" : "activado"));
            pUsuario.actualizarTabla();
            this.dispose();
        }
    }//GEN-LAST:event_btnEstatusActionPerformed

    private void guardar() {
        usuario = new Usuario();
        usuario.setNombre(txtNombre.getText());
        usuario.setApellidos(txtApellidos.getText());
        usuario.setDireccion(txtDireccion.getText());
        usuario.setCorreo("");
        usuario.setRol(cmbRol.getSelectedItem().toString());
        usuario.setEstatus(1);
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSalt(Password.getSalt());
        usuario.setPass(Password.hashPassword(pfPass.getText(), usuario.getSalt()));
        usuario.setFechaCreacion(new Date());
        boolean guardado = CUsuario.guardarRegistro(usuario);
        if (guardado) {
            JOptionPane.showMessageDialog(this, "El usuario ha sido guardado correctamente", "Usuario Guardado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        pUsuario.actualizarTabla();
        this.dispose();
    }

    public void actualizar() {
        usuario.setNombre(txtNombre.getText());
        usuario.setApellidos(txtApellidos.getText());
        usuario.setDireccion(txtDireccion.getText());
        usuario.setRol(cmbRol.getSelectedItem().toString());
        usuario.setUsuario(txtUsuario.getText());
        usuario.setSalt(Password.getSalt());
        usuario.setPass(Password.hashPassword(pfPass.getText(), usuario.getSalt()));
        int actualizado = CUsuario.actualizarRegistro(usuario);
        if (actualizado == 1) {
            JOptionPane.showMessageDialog(this, "El usuario ha sido actualizado correctamente", "Usuario Actualizado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        pUsuario.actualizarTabla();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstatus;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitulo;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado11;
    private utilerias.PanelRedondeado panelRedondeado13;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado15;
    private utilerias.PanelRedondeado panelRedondeado17;
    private utilerias.PanelRedondeado panelRedondeado24;
    private javax.swing.JPasswordField pfPass;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
