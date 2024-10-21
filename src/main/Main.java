package main;

import bd.BaseConexion;
import controladores.CSocio;
import java.util.ArrayList;
import modelos.Socios;
import utilerias.GenerarReporte;
import ventanas.Login;

/**
 *
 * @author daxsa
 */
public class Main {

    public static void main(String[] args) {
        Login dialog = new Login(new javax.swing.JFrame(), true);

        /*dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);*/
        ArrayList<Socios> socios = CSocio.getRegistros();
        
        GenerarReporte reporte = new GenerarReporte("Prueba", socios);
        reporte.run();
        
        System.exit(0);
    }
}
