package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.*;
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
                prestamo.setInteresPendiente(rs.getDouble(10));
                prestamo.setUltimaActualizacionIntereses(rs.getDate(11));
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
                prestamo.setInteresPendiente(rs.getDouble(10));
                prestamo.setUltimaActualizacionIntereses(rs.getDate(11));
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
                prestamo.setInteresPendiente(rs.getDouble(10));
                prestamo.setUltimaActualizacionIntereses(rs.getDate(11));
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
                prestamo.setInteresPendiente(rs.getDouble(10));
                prestamo.setUltimaActualizacionIntereses(rs.getDate(11));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prestamo;
    }

    public static boolean guardarRegistro(Prestamo prestamo) {
        int registrado = 0;

        String query = "INSERT INTO Prestamo (" + Prestamo.CAMPOS + ") VALUES(";

        Object[] valores = {prestamo.getSocio().getId(), prestamo.getMonto(), prestamo.getIntereses(),
            Utileria.getFechaFormateada(prestamo.getFechaAprobacion(), Utileria.ANIO_MES_DIA),
            null, prestamo.getSaldoRestante(), prestamo.getEstatus(),
            prestamo.getUsuario().getId(), prestamo.getInteresPendiente(),
            Utileria.getFechaFormateada(prestamo.getUltimaActualizacionIntereses(), Utileria.ANIO_MES_DIA)};

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
                prestamo.setInteresPendiente(rs.getDouble(10));
                prestamo.setUltimaActualizacionIntereses(rs.getDate(11));
                prestamos.add(prestamo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prestamos;
    }

    public static void actualizarIntereses() {
        String procedimiento = "{call sp_InteresMensual}";

        try {
            Connection conexion = getConexion();
            CallableStatement cs = conexion.prepareCall(procedimiento);

            cs.execute();
            System.out.println("Intereses actualizados correctamente.");

        } catch (SQLException ex) {
            System.err.println("Error al actualizar los intereses: " + ex.getMessage());
        }
    }

    public static Integer totalAcciones() {
        String consulta = "SELECT CAST(SUM(Acciones) AS DECIMAL(10, 0)) AS TotalAcciones "
                + "FROM (SELECT montoQuincenal / (SELECT precioAccion FROM Configuracion) AS Acciones "
                + "FROM Ahorro) AS S";
        Integer totalAcciones = 0;
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            if (rs.next()) {
                totalAcciones = rs.getInt("TotalAcciones");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return totalAcciones;
    }

    public static Double totalGanacia() {
        String consulta = "SELECT SUM((monto*intereses) * DATEDIFF(MONTH,fechaAprobacion,fechaLiquidacion)) "
                + "AS TotalIntereses FROM Prestamo WHERE estatus = 'LIQUIDADO'";
        Double totalIntereses = 0.0;
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            if (rs.next()) {
                totalIntereses = rs.getDouble("TotalIntereses");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return totalIntereses;
    }

    public static ArrayList<Object[]> socioAcciones(String nombreSocio) {
        String consulta = "SELECT CONCAT(s.nombre,' ',s.apellidos) AS nombreSocio, "
                + "(a.montoQuincenal / (SELECT precioAccion FROM Configuracion)) AS Acciones "
                + "FROM Socio s INNER JOIN Ahorro a  ON s.id = a.idSocio";
        if (nombreSocio != null) {
            consulta = consulta + " WHERE s.nombre LIKE '" + nombreSocio + "%' OR s.apellidos LIKE '" + nombreSocio + "%'";
        }
        ArrayList<Object[]> accionesArray = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Object[] valores = new Object[2];
                String nomSocio = rs.getString("nombreSocio");
                double acciones = rs.getDouble("Acciones");
                valores[0] = nomSocio;
                valores[1] = acciones;
                accionesArray.add(valores);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return accionesArray;
    }
}
