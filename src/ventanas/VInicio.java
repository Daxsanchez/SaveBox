package ventanas;

import controladores.CSocio;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daxsa
 */
public class VInicio extends javax.swing.JFrame {

    private static VEmpresa vntEmpresa = null;
    private DefaultTableModel tabla;

    public VInicio() {
        initComponents();
        tabla = (DefaultTableModel) tblTransacciones.getModel();
        Object[] ob = new Object[4];
        ob[0] = "José Hernández";
        ob[1] = "Préstamo";
        ob[2] = "15/11/2024";
        ob[3] = "$10,000";
        tabla.addRow(ob);
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
        jPanel3 = new javax.swing.JPanel();
        panelRedondeado1 = new utilerias.PanelRedondeado();
        pInicio = new utilerias.PanelRedondeado();
        lbInicio = new javax.swing.JLabel();
        pSocios = new utilerias.PanelRedondeado();
        lbSocio = new javax.swing.JLabel();
        pEmpresa = new utilerias.PanelRedondeado();
        lbEmpresa = new javax.swing.JLabel();
        pPrestamo = new utilerias.PanelRedondeado();
        lbPrestamo = new javax.swing.JLabel();
        pAhorro = new utilerias.PanelRedondeado();
        lbAhorro = new javax.swing.JLabel();
        pIAcerca = new utilerias.PanelRedondeado();
        lbAcerca = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel9 = new javax.swing.JLabel();
        lbRol = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransacciones = new javax.swing.JTable();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        panelRedondeado1.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado1.setRoundBottomLeft(50);
        panelRedondeado1.setRoundBottomRight(50);
        panelRedondeado1.setRoundTopLeft(50);
        panelRedondeado1.setRoundTopRight(50);

        pInicio.setBackground(new java.awt.Color(7, 20, 123));
        pInicio.setRoundBottomLeft(50);
        pInicio.setRoundBottomRight(50);
        pInicio.setRoundTopLeft(50);
        pInicio.setRoundTopRight(50);
        pInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pInicioMouseExited(evt);
            }
        });

        lbInicio.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbInicio.setText("Inicio");

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
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
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pSociosLayout.setVerticalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSocio, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEmpresa.setBackground(new java.awt.Color(7, 20, 123));
        pEmpresa.setRoundBottomLeft(50);
        pEmpresa.setRoundBottomRight(50);
        pEmpresa.setRoundTopLeft(50);
        pEmpresa.setRoundTopRight(50);
        pEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pEmpresaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEmpresaMouseExited(evt);
            }
        });

        lbEmpresa.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpresa.setText("Empresa");

        javax.swing.GroupLayout pEmpresaLayout = new javax.swing.GroupLayout(pEmpresa);
        pEmpresa.setLayout(pEmpresaLayout);
        pEmpresaLayout.setHorizontalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpresaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbEmpresa)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pEmpresaLayout.setVerticalGroup(
            pEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEmpresaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        pPrestamo.setBackground(new java.awt.Color(7, 20, 123));
        pPrestamo.setRoundBottomLeft(50);
        pPrestamo.setRoundBottomRight(50);
        pPrestamo.setRoundTopLeft(50);
        pPrestamo.setRoundTopRight(50);
        pPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
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

        javax.swing.GroupLayout pPrestamoLayout = new javax.swing.GroupLayout(pPrestamo);
        pPrestamo.setLayout(pPrestamoLayout);
        pPrestamoLayout.setHorizontalGroup(
            pPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrestamoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lbPrestamo)
                .addGap(15, 15, 15))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAhorroLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lbAhorro)
                .addGap(23, 23, 23))
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
                .addGap(25, 25, 25)
                .addComponent(lbAcerca)
                .addContainerGap(25, Short.MAX_VALUE))
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N

        javax.swing.GroupLayout panelRedondeado1Layout = new javax.swing.GroupLayout(panelRedondeado1);
        panelRedondeado1.setLayout(panelRedondeado1Layout);
        panelRedondeado1Layout.setHorizontalGroup(
            panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(pEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(pPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(pAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(42, 42, 42))
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
                                .addComponent(pEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(pIAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRedondeado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addGroup(panelRedondeado1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7))))
                    .addGroup(panelRedondeado1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelRedondeado2.setBackground(new java.awt.Color(7, 20, 123));
        panelRedondeado2.setRoundBottomLeft(10);
        panelRedondeado2.setRoundBottomRight(10);
        panelRedondeado2.setRoundTopLeft(10);
        panelRedondeado2.setRoundTopRight(10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N

        lbRol.setBackground(new java.awt.Color(255, 255, 255));
        lbRol.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        lbRol.setForeground(new java.awt.Color(255, 255, 255));
        lbRol.setText("ADMINISTRADOR");

        jLabel10.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenido a SaveBox");

        jLabel11.setFont(new java.awt.Font("Agrandir", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Dax Naim Sánchez López");

        jLabel12.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Empresa: XXXXXX");

        jLabel13.setFont(new java.awt.Font("Agrandir", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID: XXXXXXX");

        jLabel14.setFont(new java.awt.Font("Agrandir", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("____");

        jLabel15.setFont(new java.awt.Font("Agrandir", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("____");

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(lbRol)
                .addGap(286, 286, 286)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel9)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel11)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)))
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbRol)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(7, 20, 123));
        jLabel17.setText("Ver todas");

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(7, 20, 123));
        jLabel18.setText("Historial Transacciones");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha_d.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(7, 20, 123));
        jScrollPane1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        tblTransacciones.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        tblTransacciones.setForeground(new java.awt.Color(7, 20, 123));
        tblTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Socio", "Tipo", "Monto", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTransacciones.setGridColor(new java.awt.Color(255, 255, 255));
        tblTransacciones.setRowHeight(50);
        tblTransacciones.setSelectionBackground(new java.awt.Color(7, 20, 123));
        tblTransacciones.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblTransacciones.getTableHeader().setResizingAllowed(false);
        tblTransacciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTransacciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRedondeado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRedondeado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dp.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dp.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpLayout.createSequentialGroup()
                .addGroup(dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pInicioMouseEntered
        entraPanel(pInicio, lbInicio);
    }//GEN-LAST:event_pInicioMouseEntered

    private void pInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pInicioMouseExited
        salePanel(pInicio, lbInicio);
    }//GEN-LAST:event_pInicioMouseExited

    private void pSociosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSociosMouseEntered
        entraPanel(pSocios, lbSocio);
    }//GEN-LAST:event_pSociosMouseEntered

    private void pSociosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pSociosMouseExited
        salePanel(pSocios, lbSocio);
    }//GEN-LAST:event_pSociosMouseExited

    private void pEmpresaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpresaMouseEntered
        entraPanel(pEmpresa, lbEmpresa);
    }//GEN-LAST:event_pEmpresaMouseEntered

    private void pEmpresaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEmpresaMouseExited
        salePanel(pEmpresa, lbEmpresa);
    }//GEN-LAST:event_pEmpresaMouseExited

    private void pPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPrestamoMouseEntered
        entraPanel(pPrestamo, lbPrestamo);
    }//GEN-LAST:event_pPrestamoMouseEntered

    private void pPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pPrestamoMouseExited
        salePanel(pPrestamo, lbPrestamo);
    }//GEN-LAST:event_pPrestamoMouseExited

    private void pAhorroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhorroMouseEntered
        entraPanel(pAhorro, lbAhorro);
    }//GEN-LAST:event_pAhorroMouseEntered

    private void pAhorroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pAhorroMouseExited
        salePanel(pAhorro, lbAhorro);
    }//GEN-LAST:event_pAhorroMouseExited

    private void pIAcercaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAcercaMouseEntered
        entraPanel(pIAcerca, lbAcerca);
    }//GEN-LAST:event_pIAcercaMouseEntered

    private void pIAcercaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pIAcercaMouseExited
        salePanel(pIAcerca, lbAcerca);
    }//GEN-LAST:event_pIAcercaMouseExited

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAcerca;
    private javax.swing.JLabel lbAhorro;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbPrestamo;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbSocio;
    private utilerias.PanelRedondeado pAhorro;
    private utilerias.PanelRedondeado pEmpresa;
    private utilerias.PanelRedondeado pIAcerca;
    private utilerias.PanelRedondeado pInicio;
    private utilerias.PanelRedondeado pPrestamo;
    private utilerias.PanelRedondeado pSocios;
    private utilerias.PanelRedondeado panelRedondeado1;
    private utilerias.PanelRedondeado panelRedondeado2;
    private javax.swing.JTable tblTransacciones;
    // End of variables declaration//GEN-END:variables
}
