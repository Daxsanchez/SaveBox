package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Ahorro;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CAhorro {

    public static ArrayList<Ahorro> getRegistros() {
        String consulta = "SELECT * FROM Ahorro";
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
                ahorros.add(ahorro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ahorros;
    }

    public static ArrayList<Ahorro> getAhorrosVigentes() {
        String consulta = "SELECT * FROM Ahorro WHERE estatus = 1";
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
                ahorros.add(ahorro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ahorros;
    }

    public static ArrayList<Ahorro> getAhorrosFinalizados() {
        String consulta = "SELECT * FROM Ahorro WHERE estatus = 0";
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
                ahorros.add(ahorro);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ahorros;
    }

    public static Ahorro ahorroPorId(int id) {
        String consulta = "SELECT * FROM Ahorro WHERE id = " + id;
        Ahorro ahorro = new Ahorro();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ahorro;
    }

    public static boolean guardarRegistro(Ahorro ahorro) {
        int registrado = 0;

        String query = "INSERT INTO Ahorro (" + Ahorro.CAMPOS + ") VALUES(";

        Object[] valores = {ahorro.getSocio().getId(), ahorro.getMontoMensual(),
            Utileria.getFechaFormateada(ahorro.getFechaApertura(), Utileria.ANIO_MES_DIA), ahorro.getEstatus(),
            ahorro.getUsuario().getId(), ahorro.getAhorrado()};

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

    public static Ahorro ahorroPorIdSocio(int id) {
        String consulta = "SELECT * FROM Ahorro WHERE idSocio = " + id;
        Ahorro ahorro = new Ahorro();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ahorro;
    }

    public static ArrayList<Ahorro> porNombreSocio(String nom, int estatus) {
        String consulta = "SELECT * FROM Ahorro a "
                + "INNER JOIN Socio s ON s.id = a.idSocio "
                + "WHERE (s.nombre LIKE '" + nom + "%' OR s.apellidos LIKE '" + nom + "%') "
                + "AND a.estatus = " + estatus;
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Ahorro ahorro = new Ahorro();
                ahorro.setId(rs.getInt(1));
                ahorro.setSocio(CSocio.socioPorId(rs.getInt(2)));
                ahorro.setMontoMensual(rs.getDouble(3));
                ahorro.setFechaApertura(rs.getDate(4));
                ahorro.setEstatus(rs.getInt(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
                ahorros.add(ahorro);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ahorros;
    }
}
