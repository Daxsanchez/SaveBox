package ventanas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import paneles.PInicio;
import paneles.PSocio;
import paneles.PUsuario;
import paneles.PPrestamos;

/**
 *
 * @author daxsa
 */
public class VInicio extends javax.swing.JFrame {

    private static VEmpresa vntEmpresa = null;
    private static int x = 30;
    private static int y = 120;
    private static int width = 1250;
    private static int height = 600;
    private PInicio pinicio = null;
    private PSocio pSocio = null;
    private PUsuario pUsuario = null;
    private PPrestamos pprestamo = null;

    public VInicio() {
        initComponents();

        pinicio = new PInicio();
        pinicio.setVisible(true);

        pinicio.setBounds(x, y, width, height);
        pEspacio.add(pinicio);
        pEspacio.setComponentZOrder(pinicio, 0);
        pEspacio.repaint();
        pEspacio.revalidate();
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
        pPrestamo = new utilerias.PanelRedondeado();
        lbPrestamo = new javax.swing.JLabel();
        pAhorro = new utilerias.PanelRedondeado();
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
        dp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        dp.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 757));

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

        dp.add(pEspacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

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
        lbInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbInicioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pILayout = new javax.swing.GroupLayout(pI);
        pI.setLayout(pILayout);
        pILayout.setHorizontalGroup(
            pILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pILayout.createSequentialGroup()
                .addComponent(lbInicio)
                .addGap(0, 73, Short.MAX_VALUE))
        );
        pILayout.setVerticalGroup(
            pILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGroup(pSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pSociosLayout.setVerticalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
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
        lbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pUsLayout = new javax.swing.GroupLayout(pUs);
        pUs.setLayout(pUsLayout);
        pUsLayout.setHorizontalGroup(
            pUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUsLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pUsLayout.setVerticalGroup(
            pUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPrestamo.setBackground(new java.awt.Color(7, 20, 123));
        pPrestamo.setRoundBottomLeft(50);
        pPrestamo.setRoundBottomRight(50);
        pPrestamo.setRoundTopLeft(50);
        pPrestamo.setRoundTopRight(50);
        pPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pPrestamoMouseExited(evt);
            }
        });

        lbPrestamo.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lbPrestamo.setText("Prestamos");
        lbPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPrestamoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pPrestamoLayout = new javax.swing.GroupLayout(pPrestamo);
        pPrestamo.setLayout(pPrestamoLayout);
        pPrestamoLayout.setHorizontalGroup(
            pPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPrestamo)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pPrestamoLayout.setVerticalGroup(
            pPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pAhorro.setBackground(new java.awt.Color(7, 20, 123));
        pAhorro.setRoundBottomLeft(50);
        pAhorro.setRoundBottomRight(50);
        pAhorro.setRoundTopLeft(50);
        pAhorro.setRoundTopRight(50);
        pAhorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pAhorroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pAhorroMouseExited(evt);
            }
        });

        lbAhorro.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbAhorro.setForeground(new java.awt.Color(255, 255, 255));
        lbAhorro.setText("Ahorros");

        javax.swing.GroupLayout pAhorroLayout = new javax.swing.GroupLayout(pAhorro);
        pAhorro.setLayout(pAhorroLayout);
        pAhorroLayout.setHorizontalGroup(
            pAhorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAhorroLayout.createSequentialGroup()
                .addComponent(lbAhorro)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        pAhorroLayout.setVerticalGroup(
            pAhorroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAhorroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAhorro, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(lbAcerca)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        pIAcercaLayout.setVerticalGroup(
            pIAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pIAcercaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAcerca, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(48, 48, 48)
                .addComponent(pI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(pUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(pAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pUs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(helpCentro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        dp.add(panelRedondeado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 13, 1360, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void pAhorroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhorroMouseExited
        salePanel(pAhorro, lbAhorro);
    }//GEN-LAST:event_pAhorroMouseExited

    private void pAhorroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhorroMouseEntered
        entraPanel(pAhorro, lbAhorro);
    }//GEN-LAST:event_pAhorroMouseEntered

    private void pPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPrestamoMouseExited
        salePanel(pPrestamo, lbPrestamo);
    }//GEN-LAST:event_pPrestamoMouseExited

    private void pPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPrestamoMouseEntered
        entraPanel(pPrestamo, lbPrestamo);
    }//GEN-LAST:event_pPrestamoMouseEntered

    private void pUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseExited
        salePanel(pUs, lbUsuario);
    }//GEN-LAST:event_pUsMouseExited

    private void pUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseEntered
        entraPanel(pUs, lbUsuario);
    }//GEN-LAST:event_pUsMouseEntered

    private void pUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsMouseClicked
        quitarPaneles();
        if (pUsuario == null) {
            pUsuario = new PUsuario(this.dp);
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
            pSocio = new PSocio(this.dp);
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

    private void lbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUsuarioMouseClicked


    }//GEN-LAST:event_lbUsuarioMouseClicked

    private void lbPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPrestamoMouseClicked

    }//GEN-LAST:event_lbPrestamoMouseClicked

    private void lbInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbInicioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbInicioKeyPressed

    private void pPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPrestamoMouseClicked

        quitarPaneles();
        if (pprestamo == null) {
            pprestamo = new PPrestamos(this.dp);
            pinicio.setVisible(true);
            pprestamo.setBounds(x, y, width, height);
            pEspacio.add(pinicio);
            pEspacio.setComponentZOrder(pinicio, 0);
            pEspacio.repaint();
            pEspacio.revalidate();
        }

    }//GEN-LAST:event_pPrestamoMouseClicked

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
    private utilerias.PanelRedondeado pAhorro;
    private javax.swing.JPanel pEspacio;
    private utilerias.PanelRedondeado pI;
    private utilerias.PanelRedondeado pIAcerca;
    private utilerias.PanelRedondeado pPrestamo;
    private utilerias.PanelRedondeado pSocios;
    private utilerias.PanelRedondeado pUs;
    private utilerias.PanelRedondeado panelRedondeado1;
    // End of variables declaration//GEN-END:variables
}
