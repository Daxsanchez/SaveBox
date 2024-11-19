package ventanas;

import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import main.Config;
import paneles.PAhorro;
import paneles.PInicio;
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

    public VInicio() {
        initComponents();

        pinicio = new PInicio();
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
        if (rol.equals("GESTOR")) {
            pUs.setVisible(false);
            pPres.setVisible(false);
        } else if (rol.equals("ADMINISTRADOR")) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dp = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        helpCentro2 = new help.helpCentro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        dp.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(7, 20, 123));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoTec.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libro.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/configuracion.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        dp.add(jPanel2);
        jPanel2.setBounds(0, 0, 62, 757);

        pEspacio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pEspacioLayout = new javax.swing.GroupLayout(pEspacio);
        pEspacio.setLayout(pEspacioLayout);
        pEspacioLayout.setHorizontalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1359, Short.MAX_VALUE)
        );
        pEspacioLayout.setVerticalGroup(
            pEspacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );

        dp.add(pEspacio);
        pEspacio.setBounds(90, 110, 1359, 757);

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
                .addGap(22, 22, 22)
                .addComponent(lbAhorro)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pAhoLayout.setVerticalGroup(
            pAhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAhoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lbAhorro)
                .addGap(17, 17, 17))
        );

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

        javax.swing.GroupLayout pIAcercaLayout = new javax.swing.GroupLayout(pIAcerca);
        pIAcerca.setLayout(pIAcercaLayout);
        pIAcercaLayout.setHorizontalGroup(
            pIAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIAcercaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbAcerca)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pIAcercaLayout.setVerticalGroup(
            pIAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pIAcercaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lbAcerca)
                .addGap(16, 16, 16))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("|");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/noti.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar_chico.png"))); // NOI18N

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(pAho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(helpCentro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(35, 35, 35))
        );
        panelRedondeado1Layout.setVerticalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(helpCentro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pAho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dp.add(panelRedondeado1);
        panelRedondeado1.setBounds(88, 13, 1342, 82);

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
            pinicio = new PInicio();
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAcerca;
    private javax.swing.JLabel lbAhorro;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbPrestamo;
    private javax.swing.JLabel lbSocio;
    private javax.swing.JLabel lbUsuario;
    private utilerias.PanelRedondeado pAho;
    private javax.swing.JPanel pEspacio;
    private utilerias.PanelRedondeado pI;
    private utilerias.PanelRedondeado pIAcerca;
    private utilerias.PanelRedondeado pPres;
    private utilerias.PanelRedondeado pSocios;
    private utilerias.PanelRedondeado pUs;
    private utilerias.PanelRedondeado panelRedondeado1;
    // End of variables declaration//GEN-END:variables
}
