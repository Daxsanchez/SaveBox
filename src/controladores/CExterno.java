package controladores;

import java.util.ArrayList;
import modelos.Externo;
import java.sql.*;
import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CExterno {

    public static ArrayList<Externo> getRegistros() {
        String consulta = "SELECT * FROM Externo";
        ArrayList<Externo> externos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Externo externo = new Externo();
                externo.setId(rs.getInt(1));
                externo.setNombre(rs.getString(2));
                externo.setApellidos(rs.getString(3));
                externo.setCorreo(rs.getString(4));
                externo.setTelefono(rs.getString(5));
                externo.setFechaCreacion(rs.getDate(6));
                externo.setEstatus(rs.getInt(7));
                externos.add(externo);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return externos;
    }

    public static ArrayList<Externo> getExternosActivos() {
        String consulta = "SELECT * FROM Externo WHERE estatus = 1";
        ArrayList<Externo> externos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Externo externo = new Externo();
                externo.setId(rs.getInt(1));
                externo.setNombre(rs.getString(2));
                externo.setApellidos(rs.getString(3));
                externo.setCorreo(rs.getString(4));
                externo.setTelefono(rs.getString(5));
                externo.setFechaCreacion(rs.getDate(6));
                externo.setEstatus(rs.getInt(7));
                externos.add(externo);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return externos;
    }

    public static ArrayList<Externo> getExternosInactivos() {
        String consulta = "SELECT * FROM Externo WHERE estatus = 0";
        ArrayList<Externo> externos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Externo externo = new Externo();
                externo.setId(rs.getInt(1));
                externo.setNombre(rs.getString(2));
                externo.setApellidos(rs.getString(3));
                externo.setCorreo(rs.getString(4));
                externo.setTelefono(rs.getString(5));
                externo.setFechaCreacion(rs.getDate(6));
                externo.setEstatus(rs.getInt(7));
                externos.add(externo);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return externos;
    }

    public static Externo externoPorId(int id) {
        String consulta = "SELECT * FROM Externo WHERE id = " + id;
        Externo externo = new Externo();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                externo.setId(rs.getInt(1));
                externo.setNombre(rs.getString(2));
                externo.setApellidos(rs.getString(3));
                externo.setCorreo(rs.getString(4));
                externo.setTelefono(rs.getString(5));
                externo.setFechaCreacion(rs.getDate(6));
                externo.setEstatus(rs.getInt(7));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return externo;
    }

    public static boolean guardarRegistro(Externo externo) {
        int registrado = 0;

        String query = "INSERT INTO Externo (" + Externo.CAMPOS + ") VALUES(";

        Object[] valores = {externo.getNombre(), externo.getApellidos(),
            externo.getCorreo(), externo.getTelefono(),
            Utileria.getFechaFormateada(externo.getFechaCreacion(), Utileria.ANIO_MES_DIA),
            externo.getEstatus()};

        query = query + CBaseDatos.formatearValores(valores.length) + ")";
        System.out.println(query);

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            registrado = ps.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            System.out.println(ex);
        }

        return registrado == 1;
    }

    public static int actualizarRegistro(Externo externo) {
        int act = 0;
        String query = "UPDATE Externo SET ";
        String campos = Externo.CAMPOS_ACT;
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {externo.getNombre(), externo.getApellidos(), externo.getCorreo(),
            externo.getTelefono(), externo.getId()};

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
        ResultSet rs = CBaseDatos.getUltimoRegistro("Externo", "id");
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

    public static int estatus(Externo externo) {
        int act = 0;
        String query = "UPDATE externo SET ";
        String campos = "estatus";
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "id" + " = ? ";

        Object[] valores = {externo.getEstatus(), externo.getId()};

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
