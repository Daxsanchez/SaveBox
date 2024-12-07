package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.AbonoPrestamo;
import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import utilerias.Utileria;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Prestamo;
import modelos.Socio;
import modelos.Usuario;

/**
 *
 * @author daxsa
 */
public class CAbonoPrestamo {

    public static ArrayList<AbonoPrestamo> getRegistros() {
        String consulta = "SELECT * FROM AbonoPrestamo";
        ArrayList<AbonoPrestamo> abonos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                AbonoPrestamo abono = new AbonoPrestamo();
                abono.setId(rs.getInt(1));
                abono.setPrestamo(CPrestamo.prestamoPorId(rs.getInt(2)));
                abono.setMonto(rs.getDouble(3));
                abono.setFecha(rs.getDate(4));
                abono.setMetodo(rs.getString(5));
                abono.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                abonos.add(abono);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return abonos;
    }

    public static ArrayList<AbonoPrestamo> abonosPorFechas(Date fechaI, Date fechaF) {
        String consulta = "SELECT ap.id, p.id, ap.monto, ap.fecha, ap.metodo "
                + "FROM Socio s INNER JOIN Prestamo p ON p.idSocio = s.id "
                + "INNER JOIN AbonoPrestamo ap ON ap.idPrestamo = p.id  "
                + "WHERE ap.fecha BETWEEN '" + Utileria.getFechaFormateada(fechaI, Utileria.ANIO_MES_DIA)
                + "' AND '" + Utileria.getFechaFormateada(fechaF, Utileria.ANIO_MES_DIA) + "'";
        ArrayList<AbonoPrestamo> abonos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                AbonoPrestamo abono = new AbonoPrestamo();
                abono.setId(rs.getInt(1));
                abono.setPrestamo(CPrestamo.prestamoPorId(rs.getInt(2)));
                abono.setMonto(rs.getDouble(3));
                abono.setFecha(rs.getDate(4));
                abono.setMetodo(rs.getString(5));
                abonos.add(abono);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return abonos;
    }

    public static ArrayList<AbonoPrestamo> getHistorialAbonos(Integer idSocio, Integer idUsuario, Double montoMenor,
            Double montoMayor, Date fechaInicial, Date fechaFinal) {

        String procedimiento = "{call sp_historialAbonoPrestamo(?, ?, ?, ?, ?, ?)}";
        ArrayList<AbonoPrestamo> abonos = new ArrayList<>();

        try {

            CallableStatement cs = getConexion().prepareCall(procedimiento);

            cs.setObject(1, idSocio, java.sql.Types.INTEGER);
            cs.setObject(2, idUsuario, java.sql.Types.INTEGER);
            cs.setObject(3, montoMenor, java.sql.Types.DOUBLE);
            cs.setObject(4, montoMayor, java.sql.Types.DOUBLE);
            cs.setDate(5, fechaInicial != null ? new java.sql.Date(fechaInicial.getTime()) : null);
            cs.setDate(6, fechaFinal != null ? new java.sql.Date(fechaFinal.getTime()) : null);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                Socio s = new Socio();
                Prestamo p = new Prestamo();
                AbonoPrestamo abono = new AbonoPrestamo();
                Usuario us = new Usuario();

                s.setNombre(rs.getString("socio"));
                p.setSocio(s);
                us.setId(rs.getInt("idU"));
                us.setNombre(rs.getString("usuario"));
                abono.setPrestamo(p);
                abono.setUsuario(us);
                abono.setMonto(rs.getDouble("monto"));
                abono.setFecha(rs.getDate("fecha"));
                abonos.add(abono);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return abonos;
    }

}
