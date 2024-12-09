/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import ventanas.VInicio;

/**
 *
 * @author zeta9
 */
public class PConfig extends javax.swing.JPanel {

    /**
     * Creates new form PConfig
     */
    private javax.swing.JDesktopPane dp;
    private VInicio vInicio;
    
    public PConfig(VInicio ini) {
        initComponents();
        vInicio = ini;
        dp = vInicio.getDesktopPane();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(7, 20, 123));
        setMinimumSize(new java.awt.Dimension(1300, 690));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/herramientas.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Configuracion");

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        panelRedondeado3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setRoundBottomLeft(30);
        panelRedondeado3.setRoundBottomRight(30);
        panelRedondeado3.setRoundTopLeft(30);
        panelRedondeado3.setRoundTopRight(30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/accesibilidad.png"))); // NOI18N

        jLabel21.setBackground(new java.awt.Color(7, 20, 123));
        jLabel21.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(7, 20, 123));
        jLabel21.setText("|");

        jLabel12.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(7, 20, 123));
        jLabel12.setText("Visualiza la app desde otra perspectiva");

        jLabel13.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(7, 20, 123));
        jLabel13.setText("Accesibilidad");

        javax.swing.GroupLayout panelRedondeado3Layout = new javax.swing.GroupLayout(panelRedondeado3);
        panelRedondeado3.setLayout(panelRedondeado3Layout);
        panelRedondeado3Layout.setHorizontalGroup(
            panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addComponent(jLabel21)
                .addGap(33, 33, 33)
                .addGroup(panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        panelRedondeado3Layout.setVerticalGroup(
            panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(30);
        panelRedondeado2.setRoundBottomRight(30);
        panelRedondeado2.setRoundTopLeft(30);
        panelRedondeado2.setRoundTopRight(30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/seguridad-activada.png"))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(7, 20, 123));
        jLabel20.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(7, 20, 123));
        jLabel20.setText("|");

        jLabel5.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 20, 123));
        jLabel5.setText("Visualizacion y proteccion de datos");

        jLabel6.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 20, 123));
        jLabel6.setText("Privacidad y Seguridad");

        javax.swing.GroupLayout panelRedondeado2Layout = new javax.swing.GroupLayout(panelRedondeado2);
        panelRedondeado2.setLayout(panelRedondeado2Layout);
        panelRedondeado2Layout.setHorizontalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addGap(33, 33, 33)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRedondeado2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5))
                        .addGroup(panelRedondeado2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado4.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setRoundBottomLeft(30);
        panelRedondeado4.setRoundBottomRight(30);
        panelRedondeado4.setRoundTopLeft(30);
        panelRedondeado4.setRoundTopRight(30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/deshacer.png"))); // NOI18N

        jLabel22.setBackground(new java.awt.Color(7, 20, 123));
        jLabel22.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(7, 20, 123));
        jLabel22.setText("|");

        jLabel15.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(7, 20, 123));
        jLabel15.setText("Regreso al punto de partida");

        jLabel16.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(7, 20, 123));
        jLabel16.setText("Restablecer Configuracion");

        javax.swing.GroupLayout panelRedondeado4Layout = new javax.swing.GroupLayout(panelRedondeado4);
        panelRedondeado4.setLayout(panelRedondeado4Layout);
        panelRedondeado4Layout.setHorizontalGroup(
            panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addGap(33, 33, 33)
                .addGroup(panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRedondeado4Layout.setVerticalGroup(
            panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRedondeado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRedondeado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRedondeado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRedondeado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRedondeado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private utilerias.PanelRedondeado panelRedondeado3;
    private utilerias.PanelRedondeado panelRedondeado4;
    // End of variables declaration//GEN-END:variables
}
