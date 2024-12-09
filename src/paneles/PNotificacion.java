/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Ahorro;
import ventanas.VInicio;

/**
 *
 * @author zeta9
 */
public class PNotificacion extends javax.swing.JPanel {

    private javax.swing.JDesktopPane dp;
    private VInicio vInicio;
    private DefaultTableModel tbl;
    private ArrayList<Ahorro> ahorros = new ArrayList<>();
    
    public PNotificacion(VInicio ini) {
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

        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelRedondeado2 = new utilerias.PanelRedondeado();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRedondeado3 = new utilerias.PanelRedondeado();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelRedondeado4 = new utilerias.PanelRedondeado();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        panelRedondeado5 = new utilerias.PanelRedondeado();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        helpCentro1 = new help.helpCentro();

        setBackground(new java.awt.Color(7, 20, 123));
        setMinimumSize(new java.awt.Dimension(1300, 690));
        setPreferredSize(new java.awt.Dimension(1300, 690));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/notificacion.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Agrandir", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Notificaciones");

        panelRedondeado2.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado2.setRoundBottomLeft(30);
        panelRedondeado2.setRoundBottomRight(30);
        panelRedondeado2.setRoundTopLeft(30);
        panelRedondeado2.setRoundTopRight(30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dinero.png"))); // NOI18N

        jLabel20.setBackground(new java.awt.Color(7, 20, 123));
        jLabel20.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(7, 20, 123));
        jLabel20.setText("|");

        jLabel4.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 20, 123));
        jLabel4.setText("12/12/2024");

        jLabel5.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(7, 20, 123));
        jLabel5.setText("El Socio Juan Escutia solicito un retiro en la caja 2");

        jLabel6.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 20, 123));
        jLabel6.setText("Retiro");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(24, 24, 24))
        );
        panelRedondeado2Layout.setVerticalGroup(
            panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addGroup(panelRedondeado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado3.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado3.setRoundBottomLeft(30);
        panelRedondeado3.setRoundBottomRight(30);
        panelRedondeado3.setRoundTopLeft(30);
        panelRedondeado3.setRoundTopRight(30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/depositar.png"))); // NOI18N

        jLabel21.setBackground(new java.awt.Color(7, 20, 123));
        jLabel21.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(7, 20, 123));
        jLabel21.setText("|");

        jLabel11.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(7, 20, 123));
        jLabel11.setText("12/12/2024");

        jLabel12.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(7, 20, 123));
        jLabel12.setText("El Socio Daniel Garay solicito un deposito en la caja 3");

        jLabel13.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(7, 20, 123));
        jLabel13.setText("Deposito");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(24, 24, 24))
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
                        .addGroup(panelRedondeado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado4.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado4.setRoundBottomLeft(30);
        panelRedondeado4.setRoundBottomRight(30);
        panelRedondeado4.setRoundTopLeft(30);
        panelRedondeado4.setRoundTopRight(30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pedir-prestado (1).png"))); // NOI18N

        jLabel22.setBackground(new java.awt.Color(7, 20, 123));
        jLabel22.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(7, 20, 123));
        jLabel22.setText("|");

        jLabel7.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 20, 123));
        jLabel7.setText("12/12/2024");

        jLabel15.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(7, 20, 123));
        jLabel15.setText("El Socio Fernando Ortega solicito un prestamo en la caja 1");

        jLabel16.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(7, 20, 123));
        jLabel16.setText("Prestamo");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
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
                        .addGroup(panelRedondeado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRedondeado5.setBackground(new java.awt.Color(255, 255, 255));
        panelRedondeado5.setForeground(new java.awt.Color(255, 255, 255));
        panelRedondeado5.setRoundBottomLeft(30);
        panelRedondeado5.setRoundBottomRight(30);
        panelRedondeado5.setRoundTopLeft(30);
        panelRedondeado5.setRoundTopRight(30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pedir-prestado (1).png"))); // NOI18N

        jLabel23.setBackground(new java.awt.Color(7, 20, 123));
        jLabel23.setFont(new java.awt.Font("Agrandir", 0, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(7, 20, 123));
        jLabel23.setText("|");

        jLabel18.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(7, 20, 123));
        jLabel18.setText("12/12/2024");

        jLabel24.setFont(new java.awt.Font("Agrandir", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(7, 20, 123));
        jLabel24.setText("El Socio Edgar Rivera solicito un prestamo en la caja 2");

        jLabel25.setFont(new java.awt.Font("Agrandir", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(7, 20, 123));
        jLabel25.setText("Prestamo");

        javax.swing.GroupLayout panelRedondeado5Layout = new javax.swing.GroupLayout(panelRedondeado5);
        panelRedondeado5.setLayout(panelRedondeado5Layout);
        panelRedondeado5Layout.setHorizontalGroup(
            panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addGap(30, 30, 30)
                .addComponent(jLabel23)
                .addGap(33, 33, 33)
                .addGroup(panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(24, 24, 24))
        );
        panelRedondeado5Layout.setVerticalGroup(
            panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRedondeado5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRedondeado5Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17)
                        .addGroup(panelRedondeado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRedondeado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRedondeado4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRedondeado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRedondeado5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(helpCentro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(helpCentro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRedondeado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRedondeado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRedondeado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRedondeado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private help.helpCentro helpCentro1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private utilerias.PanelRedondeado panelRedondeado2;
    private utilerias.PanelRedondeado panelRedondeado3;
    private utilerias.PanelRedondeado panelRedondeado4;
    private utilerias.PanelRedondeado panelRedondeado5;
    // End of variables declaration//GEN-END:variables
}
