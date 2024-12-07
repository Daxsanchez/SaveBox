package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.Config;
import modelos.Usuario;
import utilerias.Password;

/**
 *
 * @author daxsa
 */
public class CUsuario {
    
    public static ArrayList<Usuario> getRegistros() {
        String consulta = "SELECT * FROM Usuario";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);
            
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellidos(rs.getString(3));
                usuario.setEdad(rs.getInt(4));
                usuario.setCorreo(rs.getString(5));
                usuario.setDireccion(rs.getString(6));
                usuario.setRol(rs.getString(7));
                usuario.setUsuario(rs.getString(8));
                usuario.setPass(rs.getString(9));
                usuario.setSalario(rs.getDouble(10));
                usuario.setFechaCreacion(rs.getDate(11));
                usuario.setEstatus(rs.getInt(12));
                //usuario.setEmpresa(empresa);
                usuario.setSalt(rs.getString(14));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    
    public static boolean autentificarUsuario(String contra, String usuario) {
        String consulta = "SELECT pass,salt,rol FROM Usuario WHERE usuario = '" + usuario + "'";
        
        String pass = "", salt = "";
        
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);
            
            if (rs.next()) {
                pass = rs.getString(1);
                salt = rs.getString(2);
                Config.setRol(rs.getString(3));
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
    
    public static Usuario usuarioPorId(int id) {
        String consulta = "SELECT * FROM Usuario WHERE id = " + id;
        Usuario usuario = new Usuario();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);
            
            while (rs.next()) {
                usuario.setId(rs.getInt(1));
                usuario.setNombre(rs.getString(2));
                usuario.setApellidos(rs.getString(3));
                usuario.setEdad(rs.getInt(4));
                usuario.setCorreo(rs.getString(5));
                usuario.setDireccion(rs.getString(6));
                usuario.setRol(rs.getString(7));
                usuario.setUsuario(rs.getString(8));
                usuario.setPass(rs.getString(9));
                usuario.setSalario(rs.getDouble(10));
                usuario.setFechaCreacion(rs.getDate(11));
                usuario.setEstatus(rs.getInt(12));
                //usuario.setEmpresa(empresa);
                usuario.setSalt(rs.getString(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
}
