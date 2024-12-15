package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.Config;
import modelos.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilerias.Password;
import utilerias.Utileria;

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
        String consulta = "SELECT pass,salt,rol,id FROM Usuario WHERE usuario = '" + usuario + "'";

        String pass = "", salt = "";

        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            if (rs.next()) {
                pass = rs.getString(1);
                salt = rs.getString(2);
                Config.setRol(rs.getString(3));
                Config.setUsuarioLog(CUsuario.usuarioPorId(rs.getInt(4)));
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

    public static boolean guardarRegistro(Usuario usuario) {
        int registrado = 0;

        String query = "INSERT INTO Usuario (" + Usuario.CAMPOS + ") VALUES(";

        Object[] valores = {usuario.getNombre(), usuario.getApellidos(), 0,
            usuario.getCorreo(), usuario.getDireccion(), usuario.getRol(), usuario.getUsuario(), usuario.getPass(),
            0, Utileria.getFechaFormateada(usuario.getFechaCreacion(), Utileria.ANIO_MES_DIA),
            usuario.getEstatus(), 1, usuario.getSalt()};

        query = query + CBaseDatos.formatearValores(valores.length) + ")";

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            registrado = ps.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex);
        }

        return registrado == 1;
    }

    public static int actualizarRegistro(Usuario usuario) {
        int act = 0;
        String query = "UPDATE Usuario SET ";
        String campos = usuario.CAMPOS_ACT;
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {usuario.getNombre(), usuario.getApellidos(),
            usuario.getCorreo(), usuario.getDireccion(), usuario.getRol(), usuario.getUsuario(), usuario.getPass(),
            usuario.getSalt(), usuario.getId()};

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            act = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        return act;
    }

    public static ArrayList<Usuario> porNombre(String nom) {
        String consulta = "SELECT * FROM Usuario WHERE nombre LIKE '" + nom + "%' OR apellidos LIKE '" + nom + "%'";
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

    public static ArrayList<Usuario> getUsuariosActivos() {
        String consulta = "SELECT * FROM Usuario WHERE estatus = 1";
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
        } catch (SQLException e) {
            System.out.println(e);
        }
        return usuarios;
    }

    public static ArrayList<Usuario> getUsuariosInactivos() {
        String consulta = "SELECT * FROM Usuario WHERE estatus = 0";
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
        } catch (SQLException e) {
            System.out.println(e);
        }
        return usuarios;
    }
    
    public static int estatus(Usuario usuario) {
        int act = 0;
        String query = "UPDATE Usuario SET ";
        String campos = "estatus";
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {usuario.getEstatus(), usuario.getId()};

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            act = ps.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex);
        }
        return act;
    }

}
