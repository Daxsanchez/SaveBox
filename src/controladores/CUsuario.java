package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import utilerias.Password;

/**
 *
 * @author daxsa
 */
public class CUsuario {

    public static boolean autentificarUsuario(String contra, String usuario) {
        String consulta = "SELECT pass,salt FROM Usuario WHERE usuario = '" + usuario + "'";

        String pass = "", salt = "";
        
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            if (rs.next()) {
                pass = rs.getString(1);
                salt = rs.getString(2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String generarPass = Password.hashPassword(contra, salt);
        
        return generarPass.equals(pass);
    }
    
    public static boolean usuarioExistente(String usuario) {
        String consulta = "SELECT usuario FROM Usuario WHERE usuario = '" + usuario + "'";
        boolean existe = false;
        
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            if (rs.next()) {
                existe = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return existe;
    }
}
