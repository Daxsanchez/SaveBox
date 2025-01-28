package ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Config;
import paneles.AcercaDe;
import paneles.PAcciones;
import paneles.PAhorro;
import paneles.PConfig;
import paneles.PEmpresa;
import paneles.PExterno;
import paneles.PGuia;
import paneles.PHistorialTransacciones;
import paneles.PInicio;
import paneles.PNotificacion;
import paneles.PPerfilUsuario;
import paneles.PSocio;
import paneles.PUsuario;
import paneles.PPrestamos;
import paneles.PRealizarPrestamo;
import paneles.PRealizarPrestamoExterno;

/**
 *
 * @author daxsa
 */
public class VInicio extends javax.swing.JFrame {

    private static VEmpresa vntEmpresa = null;
    private static int x = 100;
    private static int y = 110;
    private static int width = 1300;
    private static int height = 600;
    private PInicio pinicio = null;
    private PSocio pSocio = null;
    private PUsuario pUsuario = null;
    private PPrestamos pprestamo = null;
    private PRealizarPrestamo pRPrestamo = null;
    private PAhorro pAhorro = null;
    private PHistorialTransacciones pHistorialT = null;
    private AcercaDe acercaDe = null;
    private PAcciones pAcciones = null;
    private PConfig plConfiguracion = null;
    private PEmpresa plEmpresa = null;
    private PGuia plGuia = null;
    private PPerfilUsuario plUsuario = null;
    private PNotificacion plNotificacion = null;
    private PExterno pExterno = null;
    private PRealizarPrestamoExterno pRPrestamoExterno = null;

    public VInicio() {
        initComponents();

        pinicio = new PInicio(this);
        pinicio.setVisible(true);

        pinicio.setBounds(x, y, width, height);
        pEspacio.add(pinicio);
        pEspacio.setComponentZOrder(pinicio, 0);
        pEspacio.repaint();
        pEspacio.revalidate();

        validarRol();
        this.setIconImage(new ImageIcon("src/imagenes/logoA.jpg").getImage());
    }

    public void validarRol() {
        String rol = Config.getRol();
        if (rol.equalsIgnoreCase("GESTOR")) {
            pUs.setVisible(false);
            pPres.setVisible(false);
        } else if (rol.equalsIgnoreCase("ADMINISTRADOR")) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dp = new javax.swing.JDesktopPane();
        pEspacio = new javax.swing.JPanel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        pI = new utilerias.PanelRedondeado();
        lbInicio = new javax.swing.JLabel();
        pSocios = new utilerias.PanelRedondeado();
        lbSocio = new javax.swing.JLabel();
        pUs = new utilerias.PanelRedondeado();
        lbUsuario = new javax.swing.JLabel();
        pPres = new utilerias.PanelRedondeado();
        lbPrestamo = new javax.swing.JLabel();
        pAho = new utilerias.PanelRedondeado();
        lbAhorro = new javax.swing.JLabel();
        pNotificacion = new utilerias.PanelRedondeado();
        lblNotificacion = new javax.swing.JLabel();
        pPerfil = new utilerias.PanelRedondeado();
        lblPerfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pIAcciones = new utilerias.PanelRedondeado();
        lbAcciones = new javax.swing.JLabel();
        pIExterno = new utilerias.PanelRedondeado();
        lbExterno = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pCerrarSesion = new utilerias.PanelRedondeado();
        lblCerrarSesion = new javax.swing.JLabel();
        pConfiguracion = new utilerias.PanelRedondeado();
        lblConfiguracion = new javax.swing.JLabel();
        pGuia = new utilerias.PanelRedondeado();
        lblGuia = new javax.swing.JLabel();
        pEmpresa = new utilerias.PanelRedondeado();
        lblEmpresa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbAcercaDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pEspacio.setBackground(new java.awt.Color(255, 255, 255));

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(50);
        panelRedondeado1.setRoundBottomRight(50);
        panelRedondeado1.setRoundTopLeft(50);
        panelRedondeado1.setRoundTopRight(50);

        pI.setBackground(new java.awt.Color(7, 20, 123));
        pI.setRoundBottomLeft(50);
        pI.setRoundBottomRight(50);
        pI.setRoundTopLeft(50);
        pI.setRoundTopRight(50);
        pI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIMouseExited(evt);
            }
        });
        pI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbInicio.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbInicio.setText("Inicio");
        pI.add(lbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 20));

        pSocios.setBackground(new java.awt.Color(7, 20, 123));
        pSocios.setRoundBottomLeft(50);
        pSocios.setRoundBottomRight(50);
        pSocios.setRoundTopLeft(50);
        pSocios.setRoundTopRight(50);
        pSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pSociosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pSociosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pSociosMouseExited(evt);
            }
        });
        pSocios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSocio.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbSocio.setForeground(new java.awt.Color(255, 255, 255));
        lbSocio.setText("Socios");
        pSocios.add(lbSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, -1, 30));

        pUs.setBackground(new java.awt.Color(7, 20, 123));
        pUs.setRoundBottomLeft(50);
        pUs.setRoundBottomRight(50);
        pUs.setRoundTopLeft(50);
        pUs.setRoundTopRight(50);
        pUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pUsMouseExited(evt);
            }
        });
        pUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsuario.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuario");
        pUs.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 66, 30));

        pPres.setBackground(new java.awt.Color(7, 20, 123));
        pPres.setRoundBottomLeft(50);
        pPres.setRoundBottomRight(50);
        pPres.setRoundTopLeft(50);
        pPres.setRoundTopRight(50);
        pPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pPresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pPresMouseExited(evt);
            }
        });
        pPres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPrestamo.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lbPrestamo.setText("Prestamos");
        pPres.add(lbPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 100, 30));

        pAho.setBackground(new java.awt.Color(7, 20, 123));
        pAho.setRoundBottomLeft(50);
        pAho.setRoundBottomRight(50);
        pAho.setRoundTopLeft(50);
        pAho.setRoundTopRight(50);
        pAho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pAhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pAhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pAhoMouseExited(evt);
            }
        });
        pAho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAhorro.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbAhorro.setForeground(new java.awt.Color(255, 255, 255));
        lbAhorro.setText("Ahorros");
        pAho.add(lbAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 20));

        pNotificacion.setBackground(new java.awt.Color(7, 20, 123));
        pNotificacion.setRoundBottomLeft(20);
        pNotificacion.setRoundBottomRight(20);
        pNotificacion.setRoundTopLeft(20);
        pNotificacion.setRoundTopRight(20);
        pNotificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pNotificacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pNotificacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pNotificacionMouseExited(evt);
            }
        });

        lblNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/noti.png"))); // NOI18N

        javax.swing.GroupLayout pNotificacionLayout = new javax.swing.GroupLayout(pNotificacion);
        pNotificacion.setLayout(pNotificacionLayout);
        pNotificacionLayout.setHorizontalGroup(
            pNotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNotificacionLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblNotificacion)
                .addGap(18, 18, 18))
        );
        pNotificacionLayout.setVerticalGroup(
            pNotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNotificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pPerfil.setBackground(new java.awt.Color(7, 20, 123));
        pPerfil.setRoundBottomLeft(20);
        pPerfil.setRoundBottomRight(20);
        pPerfil.setRoundTopLeft(20);
        pPerfil.setRoundTopRight(20);
        pPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pPerfilMouseExited(evt);
            }
        });

        lblPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar_chico.png"))); // NOI18N

        javax.swing.GroupLayout pPerfilLayout = new javax.swing.GroupLayout(pPerfil);
        pPerfil.setLayout(pPerfilLayout);
        pPerfilLayout.setHorizontalGroup(
            pPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPerfilLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblPerfil)
                .addGap(14, 14, 14))
        );
        pPerfilLayout.setVerticalGroup(
            pPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPerfilLayout.createSequentialGroup()
                .addComponent(lblPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("|");

        pIAcciones.setBackground(new java.awt.Color(7, 20, 123));
        pIAcciones.setRoundBottomLeft(50);
        pIAcciones.setRoundBottomRight(50);
        pIAcciones.setRoundTopLeft(50);
        pIAcciones.setRoundTopRight(50);
        pIAcciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIAccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pIAccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIAccionesMouseExited(evt);
            }
        });
        pIAcciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAcciones.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbAcciones.setForeground(new java.awt.Color(255, 255, 255));
        lbAcciones.setText("Acciones");
        pIAcciones.add(lbAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, -1));

        pIExterno.setBackground(new java.awt.Color(7, 20, 123));
        pIExterno.setRoundBottomLeft(50);
        pIExterno.setRoundBottomRight(50);
        pIExterno.setRoundTopLeft(50);
        pIExterno.setRoundTopRight(50);
        pIExterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pIExternoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pIExternoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIExternoMouseExited(evt);
            }
        });
        pIExterno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExterno.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbExterno.setForeground(new java.awt.Color(255, 255, 255));
        lbExterno.setText("Externo");
        pIExterno.add(lbExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 70, -1));

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pUs, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(pPres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(pAho, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(pIAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(pIExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pI, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(pSocios, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                            .addComponent(pPres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pAho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pIAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pIExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRedondeado1Layout.createSequentialGroup()
                        .addComponent(pPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );

        jPanel2.setBackground(new java.awt.Color(7, 20, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCerrarSesion.setBackground(new java.awt.Color(7, 20, 123));
        pCerrarSesion.setRoundBottomLeft(20);
        pCerrarSesion.setRoundBottomRight(20);
        pCerrarSesion.setRoundTopLeft(20);
        pCerrarSesion.setRoundTopRight(20);
        pCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCerrarSesionMouseExited(evt);
            }
        });
        pCerrarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        lblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSesionMouseClicked(evt);
            }
        });
        pCerrarSesion.add(lblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 37, -1));

        jPanel2.add(pCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 666, 70, 70));

        pConfiguracion.setBackground(new java.awt.Color(7, 20, 123));
        pConfiguracion.setRoundBottomLeft(20);
        pConfiguracion.setRoundBottomRight(20);
        pConfiguracion.setRoundTopLeft(20);
        pConfiguracion.setRoundTopRight(20);
        pConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConfiguracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConfiguracionMouseExited(evt);
            }
        });

        lblConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N

        javax.swing.GroupLayout pConfiguracionLayout = new javax.swing.GroupLayout(pConfiguracion);
        pConfiguracion.setLayout(pConfiguracionLayout);
        pConfiguracionLayout.setHorizontalGroup(
            pConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfiguracionLayout.createSequentialGroup()
                .addComponent(lblConfiguracion)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        pConfiguracionLayout.setVerticalGroup(
            pConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfiguracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfiguracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        pGuia.setBackground(new java.awt.Color(7, 20, 123));
        pGuia.setRoundBottomLeft(20);
        pGuia.setRoundBottomRight(20);
        pGuia.setRoundTopLeft(20);
        pGuia.setRoundTopRight(20);
        pGuia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pGuiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pGuiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pGuiaMouseExited(evt);
            }
        });

        lblGuia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro.png"))); // NOI18N

        javax.swing.GroupLayout pGuiaLayout = new javax.swing.GroupLayout(pGuia);
        pGuia.setLayout(pGuiaLayout);
        pGuiaLayout.setHorizontalGroup(
            pGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGuiaLayout.createSequentialGroup()
                .addComponent(lblGuia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pGuiaLayout.setVerticalGroup(
            pGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuia, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.add(pGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        pEmpresa.setBackground(new java.awt.Color(7, 20, 123));
        pEmpresa.setRoundBottomLeft(20);
        pEmpresa.setRoundBottomRight(20);
        pEmpresa.setRoundTopLeft(20);
        pEmpresa.setRoundTopRight(20);
        pEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEmpresaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEmpresaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pEmpresaLayout = new javax.swing.GroupLayout(pEmpresa);
        pEmpresa.setLayout(pEmpresaLayout);
        pEmpresaLayout.setHorizontalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpresaLayout.createSequentialGroup()
                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        pEmpresaLayout.setVerticalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpresaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpresa))
        );

        jPanel2.add(pEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(7, 20, 123));

        jLabel2.setBackground(new java.awt.Color(7, 20, 123));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoTec.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, 60));

        lbAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acercaDe.png"))); // NOI18N
        lbAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAcercaDeMouseClicked(evt);
            }
        });
        jPanel2.add(lbAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 50));

        javax.swing.GroupLayout pEspacioLayout = new javax.swing.GroupLayout(pEspacio);
        pEspacio.setLayout(pEspacioLayout);
        pEspacioLayout.setHorizontalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspacioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        pEspacioLayout.setVerticalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEspacioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pEspacioLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
        );

        dp.add(pEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 1490, 900));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 1449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pIAccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAccionesMouseExited
        salePanel(pIAcciones, lbAcciones);
    }//GEN-LAST:event_pIAccionesMouseExited

    private void pIAccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAccionesMouseEntered
        entraPanel(pIAcciones, lbAcciones);
    }//GEN-LAST:event_pIAccionesMouseEntered

    private void pAhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhoMouseExited
        salePanel(pAho, lbAhorro);
    }//GEN-LAST:event_pAhoMouseExited

    private void pAhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhoMouseEntered
        entraPanel(pAho, lbAhorro);
    }//GEN-LAST:event_pAhoMouseEntered

    private void pPresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPresMouseExited
        salePanel(pPres, lbPrestamo);
    }//GEN-LAST:event_pPresMouseExited

    private void pPresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPresMouseEntered
        entraPanel(pPres, lbPrestamo);
    }//GEN-LAST:event_pPresMouseEntered

    private void pUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseExited
        salePanel(pUs, lbUsuario);
    }//GEN-LAST:event_pUsMouseExited

    private void pUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseEntered
        entraPanel(pUs, lbUsuario);
    }//GEN-LAST:event_pUsMouseEntered

    private void pUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseClicked
        quitarPaneles();
        if (pUsuario == null) {
            pUsuario = new PUsuario(this);
            pUsuario.setVisible(true);
            pUsuario.setBounds(x, y, width, height);
            pEspacio.add(pUsuario);
            pEspacio.setComponentZOrder(pUsuario, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pUsMouseClicked

    private void pSociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSociosMouseExited
        salePanel(pSocios, lbSocio);
    }//GEN-LAST:event_pSociosMouseExited

    private void pSociosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSociosMouseEntered
        entraPanel(pSocios, lbSocio);
    }//GEN-LAST:event_pSociosMouseEntered

    private void pSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSociosMouseClicked
        quitarPaneles();
        if (pSocio == null) {
            pSocio = new PSocio(this);
            pSocio.setVisible(true);
            pSocio.setBounds(x, y, width, height);
            pEspacio.add(pSocio);
            pEspacio.setComponentZOrder(pSocio, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pSociosMouseClicked

    private void pIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIMouseExited
        salePanel(pI, lbInicio);
    }//GEN-LAST:event_pIMouseExited

    private void pIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIMouseEntered
        entraPanel(pI, lbInicio);
    }//GEN-LAST:event_pIMouseEntered

    private void pIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIMouseClicked
        quitarPaneles();
        if (pinicio == null) {
            pinicio = new PInicio(this);
            pinicio.setVisible(true);
            pinicio.setBounds(x, y, width, height);
            pEspacio.add(pinicio);
            pEspacio.setComponentZOrder(pinicio, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pIMouseClicked

    private void pPresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPresMouseClicked
        quitarPaneles();
        if (pprestamo == null) {
            pprestamo = new PPrestamos(this);
            pprestamo.setVisible(true);
            pprestamo.setBounds(x, y, width, height);
            pEspacio.add(pprestamo);
            pEspacio.setComponentZOrder(pprestamo, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pPresMouseClicked

    private void pAhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhoMouseClicked
        quitarPaneles();
        if (pAhorro == null) {
            pAhorro = new PAhorro(this);
            pAhorro.setVisible(true);
            pAhorro.setBounds(x, y, width, height);
            pEspacio.add(pAhorro);
            pEspacio.setComponentZOrder(pAhorro, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pAhoMouseClicked

    //----------------------------------------------------------------------------------------- Cerrar Sesion
    private void pCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarSesionMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pCerrarSesionMouseClicked

    private void pCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarSesionMouseEntered
        entraPanel(pCerrarSesion, lblCerrarSesion);
    }//GEN-LAST:event_pCerrarSesionMouseEntered

    private void pCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCerrarSesionMouseExited
        salePanel(pCerrarSesion, lblCerrarSesion);
    }//GEN-LAST:event_pCerrarSesionMouseExited
    //----------------------------------------------------------------------------------------- Cerrar Sesion  

    //----------------------------------------------------------------------------------------- Configuracion  

    private void pConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfiguracionMouseClicked
        quitarPaneles();
        if (plConfiguracion == null) {
            plConfiguracion = new PConfig(this);
            plConfiguracion.setVisible(true);
            plConfiguracion.setBounds(x, y, width, height);
            pEspacio.add(plConfiguracion);
            pEspacio.setComponentZOrder(plConfiguracion, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pConfiguracionMouseClicked

    private void pConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfiguracionMouseEntered
        entraPanel(pConfiguracion, lblConfiguracion);
    }//GEN-LAST:event_pConfiguracionMouseEntered

    private void pConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfiguracionMouseExited
        salePanel(pConfiguracion, lblConfiguracion);
    }//GEN-LAST:event_pConfiguracionMouseExited
    //----------------------------------------------------------------------------------------- Configuracion

    //----------------------------------------------------------------------------------------- Guia de Usuario
    private void pGuiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuiaMouseClicked
        quitarPaneles();
        if (plGuia == null) {
            plGuia = new PGuia(this);
            plGuia.setVisible(true);
            plGuia.setBounds(x, y, width, height);
            pEspacio.add(plGuia);
            pEspacio.setComponentZOrder(plGuia, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pGuiaMouseClicked

    private void pGuiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuiaMouseEntered
        entraPanel(pGuia, lblGuia);
    }//GEN-LAST:event_pGuiaMouseEntered

    private void pGuiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pGuiaMouseExited
        salePanel(pGuia, lblGuia);
    }//GEN-LAST:event_pGuiaMouseExited
    //----------------------------------------------------------------------------------------- Guia de Usuario

    //----------------------------------------------------------------------------------------- Empresa
    private void pEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpresaMouseClicked
        quitarPaneles();
        if (plEmpresa == null) {
            plEmpresa = new PEmpresa(this);
            plEmpresa.setVisible(true);
            plEmpresa.setBounds(x, y, width, height);
            pEspacio.add(plEmpresa);
            pEspacio.setComponentZOrder(plEmpresa, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pEmpresaMouseClicked

    private void pEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpresaMouseEntered
        entraPanel(pEmpresa, lblEmpresa);
    }//GEN-LAST:event_pEmpresaMouseEntered

    private void pEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpresaMouseExited
        salePanel(pEmpresa, lblEmpresa);
    }//GEN-LAST:event_pEmpresaMouseExited
    //----------------------------------------------------------------------------------------- Empresa

    //----------------------------------------------------------------------------------------- Notificacion
    private void pNotificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotificacionMouseClicked
        quitarPaneles();
        if (plNotificacion == null) {
            plNotificacion = new PNotificacion(this);
            plNotificacion.setVisible(true);
            plNotificacion.setBounds(x, y, width, height);
            pEspacio.add(plNotificacion);
            pEspacio.setComponentZOrder(plNotificacion, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pNotificacionMouseClicked

    private void pNotificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotificacionMouseEntered
        entraPanel(pNotificacion, lblNotificacion);
    }//GEN-LAST:event_pNotificacionMouseEntered

    private void pNotificacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pNotificacionMouseExited
        salePanel(pNotificacion, lblNotificacion);
    }//GEN-LAST:event_pNotificacionMouseExited
    //----------------------------------------------------------------------------------------- Notificacion

    //----------------------------------------------------------------------------------------- Perfil
    private void pPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseClicked
        quitarPaneles();
        if (plUsuario == null) {
            plUsuario = new PPerfilUsuario(this);
            plUsuario.setVisible(true);
            plUsuario.setBounds(x, y, width, height);
            pEspacio.add(plUsuario);
            pEspacio.setComponentZOrder(plUsuario, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_pPerfilMouseClicked

    private void pPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseEntered
        entraPanel(pPerfil, lblPerfil);
    }//GEN-LAST:event_pPerfilMouseEntered

    private void pPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPerfilMouseExited
        salePanel(pPerfil, lblPerfil);
    }//GEN-LAST:event_pPerfilMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        quitarPaneles();
        if (plEmpresa == null) {
            plEmpresa = new PEmpresa(this);
            plEmpresa.setVisible(true);
            plEmpresa.setBounds(x, y, width, height);
            pEspacio.add(plEmpresa);
            pEspacio.setComponentZOrder(plEmpresa, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSesionMouseClicked
        cerrarSesion();
    }//GEN-LAST:event_lblCerrarSesionMouseClicked

    private void pIAccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAccionesMouseClicked
        quitarPaneles();

        if (pAcciones == null) {
            pAcciones = new PAcciones(this);
            pAcciones.setBounds(x, y, width, height);
            pEspacio.add(pAcciones);
            pEspacio.setComponentZOrder(pAcciones, 0);
        }

        pAcciones.setVisible(true);
        pEspacio.repaint();
        pEspacio.revalidate();
    }//GEN-LAST:event_pIAccionesMouseClicked

    private void lbAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAcercaDeMouseClicked
        quitarPaneles();

        if (acercaDe == null) {
            acercaDe = new AcercaDe(this);
            acercaDe.setBounds(x, y, width, height);
            pEspacio.add(acercaDe);
            pEspacio.setComponentZOrder(acercaDe, 0);
        }

        acercaDe.setVisible(true);
        pEspacio.repaint();
        pEspacio.revalidate();
    }//GEN-LAST:event_lbAcercaDeMouseClicked

    private void pIExternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIExternoMouseClicked
        quitarPaneles();

        if (pExterno == null) {
            pExterno = new PExterno(this);
            pExterno.setBounds(x, y, width, height);
            pEspacio.add(pExterno);
            pEspacio.setComponentZOrder(pExterno, 0);
        }

        pExterno.setVisible(true);
        pEspacio.repaint();
        pEspacio.revalidate();
    }//GEN-LAST:event_pIExternoMouseClicked

    private void pIExternoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIExternoMouseEntered
        entraPanel(pIExterno, lbExterno);
    }//GEN-LAST:event_pIExternoMouseEntered

    private void pIExternoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIExternoMouseExited
        salePanel(pIExterno, lbExterno);
    }//GEN-LAST:event_pIExternoMouseExited

    private void cerrarSesion() {
        Config.setUsuarioLog(null);
        Config.setRol(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        dispose();
    }

    public void abrirRealizarPrestamo() {
        quitarPaneles();
        if (pRPrestamo == null) {
            pRPrestamo = new PRealizarPrestamo(this);
            pRPrestamo.setVisible(true);
            pRPrestamo.setBounds(x, y, width, height);
            pEspacio.add(pRPrestamo);
            pEspacio.setComponentZOrder(pRPrestamo, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void abrirPrestamo() {
        quitarPaneles();
        if (pprestamo == null) {
            pprestamo = new PPrestamos(this);
            pprestamo.setVisible(true);
            pprestamo.setBounds(x, y, width, height);
            pEspacio.add(pprestamo);
            pEspacio.setComponentZOrder(pprestamo, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void abrirExterno() {
        quitarPaneles();
        if (pExterno == null) {
            pExterno = new PExterno(this);
            pExterno.setVisible(true);
            pExterno.setBounds(x, y, width, height);
            pEspacio.add(pExterno);
            pEspacio.setComponentZOrder(pExterno, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void abrirPrestamoExterno() {
        quitarPaneles();
        if (pRPrestamoExterno == null) {
            pRPrestamoExterno = new PRealizarPrestamoExterno(this);
            pRPrestamoExterno.setVisible(true);
            pRPrestamoExterno.setBounds(x, y, width, height);
            pEspacio.add(pRPrestamoExterno);
            pEspacio.setComponentZOrder(pRPrestamoExterno, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void abrirHistorialTransacciones() {
        quitarPaneles();
        if (pHistorialT == null) {
            pHistorialT = new PHistorialTransacciones(this);
            pHistorialT.setVisible(true);
            pHistorialT.setBounds(x, y, width, height);
            pEspacio.add(pHistorialT);
            pEspacio.setComponentZOrder(pHistorialT, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void abrirInicio() {
        quitarPaneles();
        if (pinicio == null) {
            pinicio = new PInicio(this);
            pinicio.setVisible(true);
            pinicio.setBounds(x, y, width, height);
            pEspacio.add(pinicio);
            pEspacio.setComponentZOrder(pinicio, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }
    }

    public void quitarPaneles() {
        if (pinicio != null) {
            pEspacio.remove(pinicio);
            pinicio = null;
        }
        if (pSocio != null) {
            pEspacio.remove(pSocio);
            pSocio = null;
        }
        if (pUsuario != null) {
            pEspacio.remove(pUsuario);
            pUsuario = null;
        }
        if (pprestamo != null) {
            pEspacio.remove(pprestamo);
            pprestamo = null;
        }
        if (pRPrestamo != null) {
            pEspacio.remove(pRPrestamo);
            pRPrestamo = null;
        }
        if (pAhorro != null) {
            pEspacio.remove(pAhorro);
            pAhorro = null;
        }
        if (acercaDe != null) {
            pEspacio.remove(acercaDe);
            acercaDe = null;
        }
        if (plConfiguracion != null) {
            pEspacio.remove(plConfiguracion);
            plConfiguracion = null;
        }
        if (plEmpresa != null) {
            pEspacio.remove(plEmpresa);
            plEmpresa = null;
        }
        if (plGuia != null) {
            pEspacio.remove(plGuia);
            plGuia = null;
        }
        if (plUsuario != null) {
            pEspacio.remove(plUsuario);
            plUsuario = null;
        }
        if (plNotificacion != null) {
            pEspacio.remove(plNotificacion);
            plNotificacion = null;
        }
        if (pHistorialT != null) {
            pEspacio.remove(pHistorialT);
            pHistorialT = null;
        }
        if (pAcciones != null) {
            pEspacio.remove(pAcciones);
            pAcciones = null;
        }
        if (pExterno != null) {
            pEspacio.remove(pExterno);
            pExterno = null;
        }
        if (pRPrestamoExterno != null) {
            pEspacio.remove(pRPrestamoExterno);
            pRPrestamoExterno = null;
        }
        pEspacio.invalidate();
        pEspacio.validate();
        pEspacio.repaint();
    }

    private void entraPanel(JPanel panel, JLabel lb) {
        panel.setBackground(Color.WHITE);
        lb.setForeground(Color.decode("#07147b"));
    }

    private void salePanel(JPanel panel, JLabel lb) {
        panel.setBackground(Color.decode("#07147b"));
        lb.setForeground(Color.WHITE);
    }

    public void centrarInternalFrame(JInternalFrame internalFrame, JDesktopPane desktopPane) {
        int desktopWidth = desktopPane.getWidth();
        int desktopHeight = desktopPane.getHeight();

        int frameWidth = internalFrame.getWidth();
        int frameHeight = internalFrame.getHeight();

        int x = (desktopWidth - frameWidth) / 2;
        int y = (desktopHeight - frameHeight) / 2;

        internalFrame.setLocation(x, y);
    }

    public JDesktopPane getDesktopPane() {
        return this.dp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAcciones;
    private javax.swing.JLabel lbAcercaDe;
    private javax.swing.JLabel lbAhorro;
    private javax.swing.JLabel lbExterno;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbPrestamo;
    private javax.swing.JLabel lbSocio;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblNotificacion;
    private javax.swing.JLabel lblPerfil;
    private utilerias.PanelRedondeado pAho;
    private utilerias.PanelRedondeado pCerrarSesion;
    private utilerias.PanelRedondeado pConfiguracion;
    private utilerias.PanelRedondeado pEmpresa;
    private javax.swing.JPanel pEspacio;
    private utilerias.PanelRedondeado pGuia;
    private utilerias.PanelRedondeado pI;
    private utilerias.PanelRedondeado pIAcciones;
    private utilerias.PanelRedondeado pIExterno;
    private utilerias.PanelRedondeado pNotificacion;
    private utilerias.PanelRedondeado pPerfil;
    private utilerias.PanelRedondeado pPres;
    private utilerias.PanelRedondeado pSocios;
    private utilerias.PanelRedondeado pUs;
    private utilerias.PanelRedondeado panelRedondeado1;
    // End of variables declaration//GEN-END:variables
}
