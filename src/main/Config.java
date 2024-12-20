package main;

import java.util.Date;
import modelos.Usuario;

/**
 *
 * @author daxsa
 */
public class Config {

    private static String rol;
    private static Usuario usuarioLog;//Usuario logeado a la sesión
    private static Date fechaCierre;
    private static Double precioAccion;
    private static Double interesSocio;
    private static Double interesExterno;

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

    public static Date getFechaCierre() {
        return fechaCierre;
    }

    public static void setFechaCierre(Date fechaCierre) {
        Config.fechaCierre = fechaCierre;
    }

    public static Double getPrecioAccion() {
        return precioAccion;
    }

    public static void setPrecioAccion(Double precioAccion) {
        Config.precioAccion = precioAccion;
    }

    public static Double getInteresSocio() {
        return interesSocio;
    }

    public static void setInteresSocio(Double interesSocio) {
        Config.interesSocio = interesSocio;
    }

    public static Double getInteresExterno() {
        return interesExterno;
    }

    public static void setInteresExterno(Double interesExterno) {
        Config.interesExterno = interesExterno;
    }
}
