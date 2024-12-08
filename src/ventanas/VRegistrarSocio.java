package ventanas;

import bd.CBaseDatos;
import controladores.CAhorro;
import controladores.CSocio;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Config;
import modelos.Ahorro;
import modelos.Socio;
import paneles.PSocio;

/**
 *
 * @author rafae
 */
public class VRegistrarSocio extends javax.swing.JInternalFrame {

    private boolean modifica = false;
    private Socio socio = new Socio();
    private Ahorro ahorro = new Ahorro();
    private PSocio pSocio;

    public VRegistrarSocio(PSocio ps) {
        initComponents();
        pSocio = ps;
    }

    public VRegistrarSocio(PSocio ps, Socio so) {
        initComponents();
        pSocio = ps;
        modifica = true;
        socio = so;
        lbTitulo.setText("Socio");
        txtNombre.setText(socio.getNombre());
        txtApellidos.setText(socio.getApellidos());
        txtCorreo.setText(socio.getCorreo());
        txtDirección.setText(socio.getDireccion());

        ahorro = CAhorro.ahorroPorIdSocio(socio.getId());
        txtMontoMensual.setText(ahorro.getAhorrado() + "");
        txtMontoMensual.setEnabled(false);
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
        panelRedondeado17 = new utilerias.PanelRedondeado();
        txtDirección = new javax.swing.JTextField();
        panelRedondeado24 = new utilerias.PanelRedondeado();
        txtCorreo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        panelRedondeado25 = new utilerias.PanelRedondeado();
        txtMontoMensual = new javax.swing.JTextField();

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
        lbTitulo.setText("Nuevo Socio");

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
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado13Layout.setVerticalGroup(
            panelRedondeado13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRedondeado17.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado17.setRoundBottomLeft(16);
        panelRedondeado17.setRoundBottomRight(16);
        panelRedondeado17.setRoundTopLeft(16);
        panelRedondeado17.setRoundTopRight(16);

        txtDirección.setBackground(new java.awt.Color(7, 20, 123));
        txtDirección.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtDirección.setForeground(new java.awt.Color(255, 255, 255));
        txtDirección.setText("Dirección");
        txtDirección.setBorder(null);
        txtDirección.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDirecciónFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDirecciónFocusLost(evt);
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
                    .addComponent(txtDirección, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        panelRedondeado17Layout.setVerticalGroup(
            panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado17Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(txtDirección, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );

        panelRedondeado24.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado24.setRoundBottomLeft(16);
        panelRedondeado24.setRoundBottomRight(16);
        panelRedondeado24.setRoundTopLeft(16);
        panelRedondeado24.setRoundTopRight(16);

        txtCorreo.setBackground(new java.awt.Color(7, 20, 123));
        txtCorreo.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado24Layout = new javax.swing.GroupLayout(panelRedondeado24);
        panelRedondeado24.setLayout(panelRedondeado24Layout);
        panelRedondeado24Layout.setHorizontalGroup(
            panelRedondeado24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado24Layout.setVerticalGroup(
            panelRedondeado24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado24Layout.createSequentialGroup()
                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
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

        panelRedondeado25.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado25.setRoundBottomLeft(16);
        panelRedondeado25.setRoundBottomRight(16);
        panelRedondeado25.setRoundTopLeft(16);
        panelRedondeado25.setRoundTopRight(16);

        txtMontoMensual.setBackground(new java.awt.Color(7, 20, 123));
        txtMontoMensual.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtMontoMensual.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoMensual.setText("Monto mensual");
        txtMontoMensual.setBorder(null);
        txtMontoMensual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMontoMensualFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMontoMensualFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado25Layout = new javax.swing.GroupLayout(panelRedondeado25);
        panelRedondeado25.setLayout(panelRedondeado25Layout);
        panelRedondeado25Layout.setHorizontalGroup(
            panelRedondeado25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMontoMensual)
                .addContainerGap())
        );
        panelRedondeado25Layout.setVerticalGroup(
            panelRedondeado25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMontoMensual, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                                    .addComponent(panelRedondeado11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelRedondeado25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(37, 37, 37)
                .addComponent(panelRedondeado11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(panelRedondeado17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panelRedondeado24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(panelRedondeado25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
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

    private void txtDirecciónFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirecciónFocusGained
        txtDirección.setText("");
    }//GEN-LAST:event_txtDirecciónFocusGained

    private void txtDirecciónFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirecciónFocusLost
        if (txtDirección.getText().isEmpty()) {
            txtDirección.setText("Telefono");
        }
    }//GEN-LAST:event_txtDirecciónFocusLost

    private void txtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusGained
        txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoFocusGained

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Correo");
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtMontoMensualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMontoMensualFocusGained
        txtMontoMensual.setText("");
    }//GEN-LAST:event_txtMontoMensualFocusGained

    private void txtMontoMensualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMontoMensualFocusLost

    }//GEN-LAST:event_txtMontoMensualFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!modifica) {
            guardar();
        } else {
            actualizar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void guardar() {
        socio.setNombre(txtNombre.getText());
        socio.setApellidos(txtApellidos.getText());
        socio.setDireccion(txtDirección.getText());
        socio.setCorreo(txtCorreo.getText());
        socio.setEstatus(1);
        socio.setFechaCreacion(new Date());
        boolean guardado = CSocio.guardarRegistro(socio);
        if (guardado) {
            socio.setId(CSocio.getUltimoId());
            ahorro.setMontoMensual(Double.parseDouble(txtMontoMensual.getText()));
            ahorro.setEstatus(1);
            ahorro.setAhorrado(0);
            ahorro.setFechaApertura(new Date());
            ahorro.setSocio(socio);
            ahorro.setUsuario(Config.getUsuarioLog());
            CAhorro.guardarRegistro(ahorro);
        }
        JOptionPane.showMessageDialog(this, "El socio ha sido guardado correctamente", "Socio Guardado",
                JOptionPane.INFORMATION_MESSAGE);
        pSocio.actualizarTabla();
        this.dispose();
    }

    public void actualizar() {
        socio.setNombre(txtNombre.getText());
        socio.setApellidos(txtApellidos.getText());
        socio.setDireccion(txtDirección.getText());
        socio.setCorreo(txtCorreo.getText());
        int actualizado = CSocio.actualizarRegistro(socio);
        if (actualizado == 1) {
            JOptionPane.showMessageDialog(this, "El socio ha sido actualizado correctamente", "Socio Actualizado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        pSocio.actualizarTabla();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitulo;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado11;
    private utilerias.PanelRedondeado panelRedondeado13;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado17;
    private utilerias.PanelRedondeado panelRedondeado24;
    private utilerias.PanelRedondeado panelRedondeado25;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirección;
    private javax.swing.JTextField txtMontoMensual;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
