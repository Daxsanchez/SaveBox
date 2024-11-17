package ventanas;

import controladores.CSocio;
import java.util.ArrayList;
import modelos.Socios;
import utilerias.GenerarReporte;

/**
 *
 * @author daxsa
 */
public class VInicio extends javax.swing.JFrame {

    private static VEmpresa vntEmpresa = null;

    public VInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dp = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dp.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
