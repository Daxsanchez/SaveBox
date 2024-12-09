package ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Config;
import paneles.AcercaDe;
import paneles.PAhorro;
import paneles.PConfig;
import paneles.PEmpresa;
import paneles.PGuia;
import paneles.PHistorialTransacciones;
import paneles.PInicio;
import paneles.PNotificacion;
import paneles.PPerfilUsuario;
import paneles.PSocio;
import paneles.PUsuario;
import paneles.PPrestamos;
import paneles.PRealizarPrestamo;

/**
 *
 * @author daxsa
 */
public class VInicio extends javax.swing.JFrame {

    private static VEmpresa vntEmpresa = null;
    private static int x = 30;
    private static int y = 30;
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
    
    private PConfig plConfiguracion = null;
    private PEmpresa plEmpresa = null;
    private PGuia plGuia = null; 
    private PPerfilUsuario plUsuario = null;
    private PNotificacion plNotificacion = null;

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
        jPanel2 = new javax.swing.JPanel();
        pCerrarSesion = new utilerias.PanelRedondeado();
        lblCerrarSesion = new javax.swing.JLabel();
        pConfiguracion = new utilerias.PanelRedondeado();
        lblConfiguracion = new javax.swing.JLabel();
        pGuia = new utilerias.PanelRedondeado();
        lblGuia = new javax.swing.JLabel();
        pEmpresa = new utilerias.PanelRedondeado();
        lblEmpresa = new javax.swing.JLabel();
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
        pIAcerca = new utilerias.PanelRedondeado();
        lbAcerca = new javax.swing.JLabel();
        pNotificacion = new utilerias.PanelRedondeado();
        lblNotificacion = new javax.swing.JLabel();
        pPerfil = new utilerias.PanelRedondeado();
        lblPerfil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        helpCentro2 = new help.helpCentro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(7, 20, 123));

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

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N

        javax.swing.GroupLayout pCerrarSesionLayout = new javax.swing.GroupLayout(pCerrarSesion);
        pCerrarSesion.setLayout(pCerrarSesionLayout);
        pCerrarSesionLayout.setHorizontalGroup(
            pCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pCerrarSesionLayout.setVerticalGroup(
            pCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCerrarSesion)
                .addContainerGap())
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConfiguracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfiguracion)
                .addContainerGap())
        );
        pConfiguracionLayout.setVerticalGroup(
            pConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConfiguracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfiguracion)
                .addContainerGap())
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pGuiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGuia)
                .addContainerGap())
        );
        pGuiaLayout.setVerticalGroup(
            pGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGuia)
        );

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

        lblEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoTec.png"))); // NOI18N

        javax.swing.GroupLayout pEmpresaLayout = new javax.swing.GroupLayout(pEmpresa);
        pEmpresa.setLayout(pEmpresaLayout);
        pEmpresaLayout.setHorizontalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpresaLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(lblEmpresa))
        );
        pEmpresaLayout.setVerticalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpresaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEmpresa))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pGuia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(pCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        dp.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pEspacio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pEspacioLayout = new javax.swing.GroupLayout(pEspacio);
        pEspacio.setLayout(pEspacioLayout);
        pEspacioLayout.setHorizontalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1404, Short.MAX_VALUE)
        );
        pEspacioLayout.setVerticalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );

        dp.add(pEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(50);
        panelRedondeado1.setRoundBottomRight(50);
        panelRedondeado1.setRoundTopLeft(50);
        panelRedondeado1.setRoundTopRight(50);
        panelRedondeado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lbInicio.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbInicio.setText("Inicio");

        javax.swing.GroupLayout pILayout = new javax.swing.GroupLayout(pI);
        pI.setLayout(pILayout);
        pILayout.setHorizontalGroup(
            pILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pILayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbInicio)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pILayout.setVerticalGroup(
            pILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pILayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbInicio)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelRedondeado1.add(pI, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 12, -1, -1));

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

        lbSocio.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbSocio.setForeground(new java.awt.Color(255, 255, 255));
        lbSocio.setText("Socios");

        javax.swing.GroupLayout pSociosLayout = new javax.swing.GroupLayout(pSocios);
        pSocios.setLayout(pSociosLayout);
        pSociosLayout.setHorizontalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSociosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pSociosLayout.setVerticalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSociosLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbSocio)
                .addGap(17, 17, 17))
        );

        panelRedondeado1.add(pSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 12, -1, -1));

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

        lbUsuario.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuario");

        javax.swing.GroupLayout pUsLayout = new javax.swing.GroupLayout(pUs);
        pUs.setLayout(pUsLayout);
        pUsLayout.setHorizontalGroup(
            pUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pUsLayout.setVerticalGroup(
            pUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbUsuario)
                .addGap(17, 17, 17))
        );

        panelRedondeado1.add(pUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 12, -1, -1));

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

        lbPrestamo.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lbPrestamo.setText("Prestamos");

        javax.swing.GroupLayout pPresLayout = new javax.swing.GroupLayout(pPres);
        pPres.setLayout(pPresLayout);
        pPresLayout.setHorizontalGroup(
            pPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbPrestamo)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pPresLayout.setVerticalGroup(
            pPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPresLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lbPrestamo)
                .addGap(17, 17, 17))
        );

        panelRedondeado1.add(pPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 12, -1, -1));

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

        lbAhorro.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbAhorro.setForeground(new java.awt.Color(255, 255, 255));
        lbAhorro.setText("Ahorros");

        javax.swing.GroupLayout pAhoLayout = new javax.swing.GroupLayout(pAho);
        pAho.setLayout(pAhoLayout);
        pAhoLayout.setHorizontalGroup(
            pAhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAhorro)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pAhoLayout.setVerticalGroup(
            pAhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAhoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbAhorro)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelRedondeado1.add(pAho, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 12, -1, -1));

        pIAcerca.setBackground(new java.awt.Color(7, 20, 123));
        pIAcerca.setRoundBottomLeft(50);
        pIAcerca.setRoundBottomRight(50);
        pIAcerca.setRoundTopLeft(50);
        pIAcerca.setRoundTopRight(50);
        pIAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pIAcercaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pIAcercaMouseExited(evt);
            }
        });

        lbAcerca.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbAcerca.setForeground(new java.awt.Color(255, 255, 255));
        lbAcerca.setText("Acerca de");
        lbAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAcercaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pIAcercaLayout = new javax.swing.GroupLayout(pIAcerca);
        pIAcerca.setLayout(pIAcercaLayout);
        pIAcercaLayout.setHorizontalGroup(
            pIAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIAcercaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbAcerca)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pIAcercaLayout.setVerticalGroup(
            pIAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIAcercaLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lbAcerca))
        );

        panelRedondeado1.add(pIAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, -1, 30));

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
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(lblNotificacion))
        );
        pNotificacionLayout.setVerticalGroup(
            pNotificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNotificacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRedondeado1.add(pNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 50, 50));

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
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(lblPerfil))
        );
        pPerfilLayout.setVerticalGroup(
            pPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado1.add(pPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1205, 12, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("|");
        panelRedondeado1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, -1, 54));
        panelRedondeado1.add(helpCentro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, -1, 60));

        dp.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 13, 1312, 80));

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

    private void pIAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAcercaMouseExited
        salePanel(pIAcerca, lbAcerca);
    }//GEN-LAST:event_pIAcercaMouseExited

    private void pIAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAcercaMouseEntered
        entraPanel(pIAcerca, lbAcerca);
    }//GEN-LAST:event_pIAcercaMouseEntered

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

    private void lbAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAcercaMouseClicked
        quitarPaneles(); // Ocultar otros paneles o limpiar la vista

        if (acercaDe == null) {
            acercaDe = new AcercaDe(this); // Crear el panel "AcercaDe"
            acercaDe.setBounds(x, y, width, height); // Configurar posición y tamaño
            pEspacio.add(acercaDe); // Agregar al contenedor de paneles
            pEspacio.setComponentZOrder(acercaDe, 0); // Asegurar que esté al frente
        }

        acercaDe.setVisible(true); // Mostrar el panel
        pEspacio.repaint(); // Redibujar el contenedor
        pEspacio.revalidate(); // Validar cambios
    }//GEN-LAST:event_lbAcercaMouseClicked

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
    //----------------------------------------------------------------------------------------- Perfil
    
    
    
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
    private help.helpCentro helpCentro2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAcerca;
    private javax.swing.JLabel lbAhorro;
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
    private utilerias.PanelRedondeado pIAcerca;
    private utilerias.PanelRedondeado pNotificacion;
    private utilerias.PanelRedondeado pPerfil;
    private utilerias.PanelRedondeado pPres;
    private utilerias.PanelRedondeado pSocios;
    private utilerias.PanelRedondeado pUs;
    private utilerias.PanelRedondeado panelRedondeado1;
    // End of variables declaration//GEN-END:variables
}
