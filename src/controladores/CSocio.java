package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Socio;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CSocio {

    public static ArrayList<Socio> getRegistros() {
        String consulta = "SELECT * FROM Socio";
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return socios;
    }

    public static ArrayList<Socio> getSociosActivos() {
        String consulta = "SELECT * FROM Socio WHERE estatus = 1";
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socios;
    }

    public static ArrayList<Socio> getSociosInactivos() {
        String consulta = "SELECT * FROM Socio WHERE estatus = 0";
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socios;
    }

    public static Socio socioPorId(int id) {
        String consulta = "SELECT * FROM Socio WHERE id = " + id;
        Socio socio = new Socio();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socio;
    }

    public static boolean guardarRegistro(Socio socio) {
        int registrado = 0;

        String query = "INSERT INTO Socio (" + Socio.CAMPOS + ") VALUES(";

        Object[] valores = {socio.getNombre(), socio.getApellidos(), socio.getEdad(),
            socio.getCorreo(), socio.getDireccion(),
            Utileria.getFechaFormateada(socio.getFechaCreacion(), Utileria.ANIO_MES_DIA),
            socio.getEstatus(), socio.getTelefono()};

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

    public static ArrayList<Socio> porNombre(String nom, boolean estatus) {
        String consulta = "SELECT * FROM Socio WHERE (nombre LIKE '" + nom + "%' OR apellidos LIKE '" + nom + "%') "
                + "AND estatus = " + (estatus ? 1 : 0);
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socios;
    }
    
    public static ArrayList<Socio> porCorreo(String correo, boolean estatus) {
        String consulta = "SELECT * FROM Socio WHERE correo LIKE '" + correo + "%' "
                + "AND estatus = " + (estatus ? 1 : 0);
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socios;
    }
    
    public static ArrayList<Socio> porTelefono(String telefono, boolean estatus) {
        String consulta = "SELECT * FROM Socio WHERE telefono LIKE '" + telefono + "%' "
                + "AND estatus = " + (estatus ? 1 : 0);
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socio.setTelefono(rs.getString(9));
                socios.add(socio);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return socios;
    }

    public static int actualizarRegistro(Socio socio) {
        int act = 0;
        String query = "UPDATE Socio SET ";
        String campos = Socio.CAMPOS_ACT;
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {socio.getNombre(), socio.getApellidos(), socio.getCorreo(),
            socio.getDireccion(), socio.getTelefono(), socio.getId()};

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            act = ps.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex);
        }
        return act;
    }

    public static int getUltimoId() {
        ResultSet rs = CBaseDatos.getUltimoRegistro("Socio", "id");
        Integer id = null;
        try {
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);

        }
        return id;
    }

    public static int estatus(Socio socio) {
        int act = 0;
        String query = "UPDATE Socio SET ";
        String campos = "estatus";
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {socio.getEstatus(), socio.getId()};

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

}
