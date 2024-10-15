package main;

import ventanas.Login;

/**
 *
 * @author daxsa
 */
public class Main {

    public static void main(String[] args) {
        Login dialog = new Login(new javax.swing.JFrame(), true);

        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    }
}
