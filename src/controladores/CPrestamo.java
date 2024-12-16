package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelos.Prestamo;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CPrestamo {

    public static ArrayList<Prestamo> getRegistros() {
        String consulta = "SELECT * FROM Prestamo";
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(rs.getInt(1));
                prestamo.setSocio(CSocio.socioPorId(rs.getInt(2)));
                prestamo.setMonto(rs.getDouble(3));
                prestamo.setIntereses(rs.getDouble(4));
                prestamo.setFechaAprobacion(rs.getDate(5));
                prestamo.setFechaLiquidacion(rs.getDate(6));
                prestamo.setSaldoRestante(rs.getDouble(7));
                prestamo.setEstatus(rs.getString(8));
                prestamo.setUsuario(CUsuario.usuarioPorId(rs.getInt(9)));
                prestamos.add(prestamo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prestamos;
    }

    public static ArrayList<Prestamo> getPrestamosAprobados() {
        String consulta = "SELECT * FROM Prestamo WHERE estatus = 'APROBADO'";
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(rs.getInt(1));
                prestamo.setSocio(CSocio.socioPorId(rs.getInt(2)));
                prestamo.setMonto(rs.getDouble(3));
                prestamo.setIntereses(rs.getDouble(4));
                prestamo.setFechaAprobacion(rs.getDate(5));
                prestamo.setFechaLiquidacion(rs.getDate(6));
                prestamo.setSaldoRestante(rs.getDouble(7));
                prestamo.setEstatus(rs.getString(8));
                prestamo.setUsuario(CUsuario.usuarioPorId(rs.getInt(9)));
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return prestamos;
    }

    public static ArrayList<Prestamo> getPrestamosLiquidados() {
        String consulta = "SELECT * FROM Prestamo WHERE estatus = 'LIQUIDADO'";
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(rs.getInt(1));
                prestamo.setSocio(CSocio.socioPorId(rs.getInt(2)));
                prestamo.setMonto(rs.getDouble(3));
                prestamo.setIntereses(rs.getDouble(4));
                prestamo.setFechaAprobacion(rs.getDate(5));
                prestamo.setFechaLiquidacion(rs.getDate(6));
                prestamo.setSaldoRestante(rs.getDouble(7));
                prestamo.setEstatus(rs.getString(8));
                prestamo.setUsuario(CUsuario.usuarioPorId(rs.getInt(9)));
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return prestamos;
    }

    public static Prestamo prestamoPorId(int id) {
        String consulta = "SELECT * FROM Prestamo WHERE id = " + id;
        Prestamo prestamo = new Prestamo();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                prestamo.setId(rs.getInt(1));
                prestamo.setSocio(CSocio.socioPorId(rs.getInt(2)));
                prestamo.setMonto(rs.getDouble(3));
                prestamo.setIntereses(rs.getDouble(4));
                prestamo.setFechaAprobacion(rs.getDate(5));
                prestamo.setFechaLiquidacion(rs.getDate(6));
                prestamo.setSaldoRestante(rs.getDouble(7));
                prestamo.setEstatus(rs.getString(8));
                prestamo.setUsuario(CUsuario.usuarioPorId(rs.getInt(9)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prestamo;
    }

    public static boolean guardarRegistro(Prestamo prestamo) {
        int registrado = 0;
        String fechaLiquidacion = "2024-12-07";

        String query = "INSERT INTO Prestamo (" + Prestamo.CAMPOS + ") VALUES(";

        Object[] valores = {prestamo.getSocio().getId(), prestamo.getMonto(), prestamo.getIntereses(),
            Utileria.getFechaFormateada(prestamo.getFechaAprobacion(), Utileria.ANIO_MES_DIA),
            fechaLiquidacion, prestamo.getSaldoRestante(),
            prestamo.getEstatus(), prestamo.getUsuario().getId()};

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

    public static ArrayList<Prestamo> porNombreSocio(String nom, String estatus) {
        String consulta = "SELECT * FROM Prestamo p "
                + "INNER JOIN Socio s ON s.id = p.idSocio "
                + "WHERE (s.nombre LIKE '" + nom + "%' OR s.apellidos LIKE '" + nom + "%') "
                + "AND p.estatus = '" + estatus + "'";
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Prestamo prestamo = new Prestamo();
                prestamo.setId(rs.getInt(1));
                prestamo.setSocio(CSocio.socioPorId(rs.getInt(2)));
                prestamo.setMonto(rs.getDouble(3));
                prestamo.setIntereses(rs.getDouble(4));
                prestamo.setFechaAprobacion(rs.getDate(5));
                prestamo.setFechaLiquidacion(rs.getDate(6));
                prestamo.setSaldoRestante(rs.getDouble(7));
                prestamo.setEstatus(rs.getString(8));
                prestamo.setUsuario(CUsuario.usuarioPorId(rs.getInt(9)));
                prestamos.add(prestamo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prestamos;
    }
}
