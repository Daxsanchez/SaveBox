package paneles;

import controladores.CConfiguracion;
import java.util.Date;
import javax.swing.JOptionPane;
import main.Config;
import modelos.Configuracion;
import ventanas.VInicio;

/**
 *
 * @author zeta9
 */
public class PConfig extends javax.swing.JPanel {
    
    private javax.swing.JDesktopPane dp;
    private VInicio vInicio;
    private Configuracion configuracion;
    
    public PConfig(VInicio ini) {
        initComponents();
        vInicio = ini;
        dp = vInicio.getDesktopPane();
        configuracion = CConfiguracion.getConfiguracion();
        dcFechaCierre.setDate(configuracion.getFechaCierre());
        ftPrecioAccion.setValue(configuracion.getPrecioAccion());
        ftInteresSocio.setValue(configuracion.getInteresSocio() * 100);
        ftInteresExterno.setValue(configuracion.getInteresExterno() * 100);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        helpCentro1 = new help.helpCentro();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dcFechaCierre = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        ftPrecioAccion = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        ftInteresSocio = new javax.swing.JFormattedTextField();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        ftInteresExterno = new javax.swing.JFormattedTextField();
        btnGuardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(7, 20, 123));
        setMinimumSize(new java.awt.Dimension(1300, 690));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/herramientas.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 45, -1, -1));

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Configuracion");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 59, -1, 50));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1290, 20));
        add(helpCentro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 6, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(7, 20, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Interés externo(%):");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 220, -1));
        jPanel1.add(dcFechaCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 330, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de cierre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        panelRedondeado1.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado1.setRoundBottomLeft(30);
        panelRedondeado1.setRoundBottomRight(30);
        panelRedondeado1.setRoundTopLeft(30);
        panelRedondeado1.setRoundTopRight(30);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftPrecioAccion.setBorder(null);
        ftPrecioAccion.setForeground(new java.awt.Color(7, 20, 123));
        ftPrecioAccion.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        ftPrecioAccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftPrecioAccionKeyTyped(evt);
            }
        });
        panelRedondeado1.add(ftPrecioAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 40));

        jPanel1.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 330, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio accion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Interés socio(%):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 200, -1));

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(30);
        panelRedondeado2.setRoundBottomRight(30);
        panelRedondeado2.setRoundTopLeft(30);
        panelRedondeado2.setRoundTopRight(30);
        panelRedondeado2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftInteresSocio.setBorder(null);
        ftInteresSocio.setForeground(new java.awt.Color(7, 20, 123));
        ftInteresSocio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftInteresSocio.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        ftInteresSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftInteresSocioKeyTyped(evt);
            }
        });
        panelRedondeado2.add(ftInteresSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 40));

        jPanel1.add(panelRedondeado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 330, 40));

        panelRedondeado3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setRoundBottomLeft(30);
        panelRedondeado3.setRoundBottomRight(30);
        panelRedondeado3.setRoundTopLeft(30);
        panelRedondeado3.setRoundTopRight(30);
        panelRedondeado3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ftInteresExterno.setBorder(null);
        ftInteresExterno.setForeground(new java.awt.Color(7, 20, 123));
        ftInteresExterno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftInteresExterno.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        ftInteresExterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftInteresExternoKeyTyped(evt);
            }
        });
        panelRedondeado3.add(ftInteresExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 40));

        jPanel1.add(panelRedondeado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 330, 40));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 130, 50));

        jTabbedPane1.addTab("Parámetros", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1290, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean valida = validaciones();
        if (valida) {
            int op = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cambiar estos parámetros?\n"
                    + "Esto puede alterar las validaciones de los módulos del sistema",
                    "Actualizar parámetros", JOptionPane.YES_NO_OPTION);
            if (op == JOptionPane.YES_OPTION) {
                actualizar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ftPrecioAccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftPrecioAccionKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57 || key == 46;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ftPrecioAccionKeyTyped

    private void ftInteresSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftInteresSocioKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ftInteresSocioKeyTyped

    private void ftInteresExternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftInteresExternoKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ftInteresExternoKeyTyped
    
    private boolean validaciones() {
        if (dcFechaCierre.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe de introducir una fecha",
                    "Fecha inválida", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (dcFechaCierre.getDate().compareTo(new Date()) <= 0) {
            JOptionPane.showMessageDialog(this, "La fecha cierra no puede ser menor o igual a la fecha actual",
                    "Fecha inválida", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ftPrecioAccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio para la accion",
                    "Precio accion inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        double precioAccion = Double.parseDouble(ftPrecioAccion.getValue().toString());
        if (precioAccion <= 0) {
            JOptionPane.showMessageDialog(this, "El precio de la accion no puede ser menor o igual a cero",
                    "Precio accion inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ftInteresSocio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un interes para el socio",
                    "Interés socio inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ftInteresExterno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un interes para el externo",
                    "Interés externo inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void actualizar() {
        double interesSocio = Double.parseDouble(ftInteresSocio.getValue().toString());
        double interesExterno = Double.parseDouble(ftInteresExterno.getValue().toString());
        configuracion.setFechaCierre(dcFechaCierre.getDate());
        configuracion.setPrecioAccion(Double.valueOf(ftPrecioAccion.getValue().toString()));
        configuracion.setInteresSocio(interesSocio / 100);
        configuracion.setInteresExterno(interesExterno / 100);
        int actualizar = CConfiguracion.actualizar(configuracion);
        if (actualizar == 1) {
            Config.setFechaCierre(configuracion.getFechaCierre());
            Config.setPrecioAccion(configuracion.getPrecioAccion());
            Config.setInteresSocio(configuracion.getInteresSocio());
            Config.setInteresExterno(configuracion.getInteresExterno());
            JOptionPane.showMessageDialog(this, "Los parámetros han sido actualizados correctamente",
                    "Parámetros actualizados", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dcFechaCierre;
    private javax.swing.JFormattedTextField ftInteresExterno;
    private javax.swing.JFormattedTextField ftInteresSocio;
    private javax.swing.JFormattedTextField ftPrecioAccion;
    private help.helpCentro helpCentro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado2;
    private utilerias.PanelRedondeado panelRedondeado3;
    // End of variables declaration//GEN-END:variables
}
