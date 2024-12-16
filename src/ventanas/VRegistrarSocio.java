package ventanas;

import bd.CBaseDatos;
import controladores.CAhorro;
import controladores.CSocio;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    private Icon iconEstatus = new ImageIcon(getClass().getResource("/imagenes/salir.png"));
    private boolean estatus = true;
    
    public VRegistrarSocio(PSocio ps) {
        initComponents();
        pSocio = ps;
        btnEstatus.setEnabled(false);
        btnEstatus.setIcon(iconEstatus);
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
        estatus = socio.getEstatus() == 1;
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
        txtMontoMensual = new javax.swing.JFormattedTextField();
        btnEstatus = new javax.swing.JButton();
        panelRedondeado12 = new utilerias.PanelRedondeado();
        txtTelefono = new javax.swing.JTextField();
        panelRedondeado11 = new utilerias.PanelRedondeado();
        txtApellidos = new javax.swing.JTextField();

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 88, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agrandir", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 20, 123));
        jLabel2.setText("Ingrese los siguientes datos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 214, -1, -1));

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

        jPanel2.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

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
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado13Layout = new javax.swing.GroupLayout(panelRedondeado13);
        panelRedondeado13.setLayout(panelRedondeado13Layout);
        panelRedondeado13Layout.setHorizontalGroup(
            panelRedondeado13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRedondeado13Layout.setVerticalGroup(
            panelRedondeado13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(panelRedondeado13, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 244, 320, 40));

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
        txtDirección.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDirecciónMouseClicked(evt);
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
                    .addComponent(txtDirección, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        panelRedondeado17Layout.setVerticalGroup(
            panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panelRedondeado17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado17Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(txtDirección)
                    .addGap(8, 8, 8)))
        );

        jPanel2.add(panelRedondeado17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 320, 40));

        panelRedondeado24.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado24.setRoundBottomLeft(16);
        panelRedondeado24.setRoundBottomRight(16);
        panelRedondeado24.setRoundTopLeft(16);
        panelRedondeado24.setRoundTopRight(16);
        panelRedondeado24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreo.setBackground(new java.awt.Color(7, 20, 123));
        txtCorreo.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("Correo");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCorreoMouseClicked(evt);
            }
        });
        panelRedondeado24.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 299, 26));

        jPanel2.add(panelRedondeado24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 320, 40));

        btnGuardar.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(7, 20, 123));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 604, 130, 50));

        panelRedondeado25.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado25.setRoundBottomLeft(16);
        panelRedondeado25.setRoundBottomRight(16);
        panelRedondeado25.setRoundTopLeft(16);
        panelRedondeado25.setRoundTopRight(16);
        panelRedondeado25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMontoMensual.setBackground(new java.awt.Color(7, 20, 123));
        txtMontoMensual.setBorder(null);
        txtMontoMensual.setForeground(new java.awt.Color(255, 255, 255));
        txtMontoMensual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtMontoMensual.setText("Monto mensual");
        txtMontoMensual.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtMontoMensual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMontoMensualMouseClicked(evt);
            }
        });
        txtMontoMensual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoMensualKeyTyped(evt);
            }
        });
        panelRedondeado25.add(txtMontoMensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, 300, 30));

        jPanel2.add(panelRedondeado25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 320, 40));

        btnEstatus.setText("Eliminar");
        btnEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatusActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 600, 130, 50));

        panelRedondeado12.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado12.setRoundBottomLeft(16);
        panelRedondeado12.setRoundBottomRight(16);
        panelRedondeado12.setRoundTopLeft(16);
        panelRedondeado12.setRoundTopRight(16);

        txtTelefono.setBackground(new java.awt.Color(7, 20, 123));
        txtTelefono.setFont(new java.awt.Font("Agrandir", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Telefono");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado12Layout = new javax.swing.GroupLayout(panelRedondeado12);
        panelRedondeado12.setLayout(panelRedondeado12Layout);
        panelRedondeado12Layout.setHorizontalGroup(
            panelRedondeado12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        panelRedondeado12Layout.setVerticalGroup(
            panelRedondeado12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(panelRedondeado12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 320, 40));

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
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApellidosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRedondeado11Layout = new javax.swing.GroupLayout(panelRedondeado11);
        panelRedondeado11.setLayout(panelRedondeado11Layout);
        panelRedondeado11Layout.setHorizontalGroup(
            panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado11Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        panelRedondeado11Layout.setVerticalGroup(
            panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(panelRedondeado11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRedondeado11Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.add(panelRedondeado11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!modifica) {
            guardar();
        } else {
            actualizar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMouseClicked
        txtApellidos.setText("");
    }//GEN-LAST:event_txtApellidosMouseClicked

    private void txtDirecciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirecciónMouseClicked
        txtDirección.setText("");
    }//GEN-LAST:event_txtDirecciónMouseClicked

    private void txtCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMouseClicked
        txtCorreo.setText("");
    }//GEN-LAST:event_txtCorreoMouseClicked

    private void btnEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatusActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea " + (estatus ? "eliminar" : "activar") + " esta socio?",
                "Confirme esta acción", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            socio.setEstatus(estatus ? 0 : 1);
            CSocio.estatus(socio);
            JOptionPane.showMessageDialog(null, "Socio " + (estatus ? "eliminado" : "activado"));
            pSocio.actualizarTabla();
            this.dispose();
        }
    }//GEN-LAST:event_btnEstatusActionPerformed

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        txtTelefono.setText("");
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtMontoMensualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMensualMouseClicked
        txtMontoMensual.setText("");
    }//GEN-LAST:event_txtMontoMensualMouseClicked

    private void txtMontoMensualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoMensualKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57 || key == 46;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoMensualKeyTyped
    
    private void guardar() {
        socio.setNombre(txtNombre.getText());
        socio.setApellidos(txtApellidos.getText());
        socio.setDireccion(txtDirección.getText());
        socio.setCorreo(txtCorreo.getText());
        socio.setEstatus(1);
        socio.setTelefono(txtTelefono.getText());
        socio.setFechaCreacion(new Date());
        boolean guardado = CSocio.guardarRegistro(socio);
        if (guardado) {
            socio.setId(CSocio.getUltimoId());
            ahorro.setMontoMensual(Double.parseDouble(txtMontoMensual.getValue().toString()));
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
        socio.setTelefono(txtTelefono.getText());
        int actualizado = CSocio.actualizarRegistro(socio);
        if (actualizado == 1) {
            JOptionPane.showMessageDialog(this, "El socio ha sido actualizado correctamente", "Socio Actualizado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        pSocio.actualizarTabla();
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstatus;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitulo;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado11;
    private utilerias.PanelRedondeado panelRedondeado12;
    private utilerias.PanelRedondeado panelRedondeado13;
    private utilerias.PanelRedondeado panelRedondeado14;
    private utilerias.PanelRedondeado panelRedondeado17;
    private utilerias.PanelRedondeado panelRedondeado24;
    private utilerias.PanelRedondeado panelRedondeado25;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirección;
    private javax.swing.JFormattedTextField txtMontoMensual;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
