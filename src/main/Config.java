package main;

import modelos.Usuario;

/**
 *
 * @author daxsa
 */
public class Config {

    private static String rol;
    private static Usuario usuarioLog;//Usuario logeado a la sesión

    public static Usuario getUsuarioLog() {
        return usuarioLog;
    }

    public static void setUsuarioLog(Usuario usuarioLog) {
        Config.usuarioLog = usuarioLog;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        Config.rol = rol;
    }
}
