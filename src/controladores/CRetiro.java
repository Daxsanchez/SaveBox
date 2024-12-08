package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.Retiro;
import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import utilerias.Utileria;
import java.sql.CallableStatement;
import modelos.Ahorro;
import modelos.Socio;
import modelos.Usuario;

/**
 *
 * @author daxsa
 */
public class CRetiro {

    public static ArrayList<Retiro> retirosPorFechas(Date fechaI, Date fechaF) {
        String consulta = "SELECT r.id, a.id, r.monto, r.fecha, r.idUsuario, r.estatus FROM Socio s "
                + "INNER JOIN Ahorro a ON a.idSocio = s.id "
                + "INNER JOIN Retiro r ON r.idAhorro = a.id "
                + "WHERE r.fecha BETWEEN '" + Utileria.getFechaFormateada(fechaI, Utileria.ANIO_MES_DIA)
                + "' AND '" + Utileria.getFechaFormateada(fechaF, Utileria.ANIO_MES_DIA) + "'";
        ArrayList<Retiro> retiros = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Retiro retiro = new Retiro();
                retiro.setId(rs.getInt(1));
                retiro.setAhorro(CAhorro.ahorroPorId(rs.getInt(2)));
                retiro.setMonto(rs.getDouble(3));
                retiro.setFecha(rs.getDate(4));
                retiro.setUsuario(CUsuario.usuarioPorId(rs.getInt(5)));
                retiro.setEstatus(rs.getString(6));
                retiros.add(retiro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retiros;
    }

    public static ArrayList<Retiro> getHistorialRetiros(Integer idSocio, Integer idUsuario, Double montoMenor,
            Double montoMayor, Date fechaInicial, Date fechaFinal) {

        String procedimiento = "{call sp_historialRetiro(?, ?, ?, ?, ?, ?)}";
        ArrayList<Retiro> abonos = new ArrayList<>();

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
                Ahorro a = new Ahorro();
                Retiro retiro = new Retiro();
                Usuario us = new Usuario();

                s.setNombre(rs.getString("socio"));
                a.setSocio(s);
                us.setId(rs.getInt("idU"));
                us.setNombre(rs.getString("usuario"));
                retiro.setAhorro(a);
                retiro.setUsuario(us);
                retiro.setMonto(rs.getDouble("monto"));
                retiro.setFecha(rs.getDate("fecha"));
                abonos.add(retiro);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return abonos;
    }

    public static boolean guardarRegistro(Retiro retiro) {
        int registrado = 0;

        String query = "INSERT INTO Retiro (" + Retiro.CAMPOS + ") VALUES(";

        Object[] valores = {retiro.getAhorro().getId(), retiro.getMonto(),
            Utileria.getFechaFormateada(retiro.getFecha(), Utileria.ANIO_MES_DIA),
            retiro.getEstatus(), retiro.getUsuario().getId()};

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
}
