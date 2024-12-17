package main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import controladores.CPrestamo;
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
        }).start();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
