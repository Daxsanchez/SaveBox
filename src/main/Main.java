package main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controladores.CConfiguracion;
import controladores.CPrestamo;
import modelos.Configuracion;
import ventanas.Login;

/**
 *
 * @author daxsa
 */
public class Main {

    public static void main(String[] args) {
        FlatLaf.registerCustomDefaultsSource("raven.table");
        FlatLightLaf.setup();

        new Thread(() -> {
            CPrestamo.actualizarIntereses();
            llenarConfig();
        }).start();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private static void llenarConfig() {
        Configuracion conf = CConfiguracion.getConfiguracion();
        Config.setFechaCierre(conf.getFechaCierre());
        Config.setPrecioAccion(conf.getPrecioAccion());
        Config.setInteresSocio(conf.getInteresSocio());
        Config.setInteresExterno(conf.getInteresExterno());
    }
}
