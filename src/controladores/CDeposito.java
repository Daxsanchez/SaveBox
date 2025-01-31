package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.Deposito;
import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import modelos.Ahorro;
import modelos.Socio;
import modelos.Usuario;
import utilerias.Utileria;
import java.sql.CallableStatement;

/**
 *
 * @author daxsa
 */
public class CDeposito {

    public static ArrayList<Deposito> depositosPorFechas(Date fechaI, Date fechaF) {
        String consulta = "SELECT d.id, a.id, d.monto, d.fecha,d.idUsuario,d.metodo FROM Socio s "
                + "INNER JOIN Ahorro a ON a.idSocio = s.id "
                + "INNER JOIN Deposito d ON d.idAhorro = a.id "
                + "WHERE d.fecha BETWEEN '" + Utileria.getFechaFormateada(fechaI, Utileria.ANIO_MES_DIA)
                + "' AND '" + Utileria.getFechaFormateada(fechaF, Utileria.ANIO_MES_DIA) + "'";
        ArrayList<Deposito> depositos = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Deposito deposito = new Deposito();
                deposito.setId(rs.getInt(1));
                deposito.setAhorro(CAhorro.ahorroPorId(rs.getInt(2)));
                deposito.setMonto(rs.getDouble(3));
                deposito.setFecha(rs.getDate(4));
                deposito.setUsuario(CUsuario.usuarioPorId(rs.getInt(5)));
                deposito.setMetodo(rs.getString(6));
                depositos.add(deposito);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return depositos;
    }

    public static ArrayList<Deposito> getHistorialDepositos(Integer idSocio, Integer idUsuario, Double montoMenor,
            Double montoMayor, Date fechaInicial, Date fechaFinal) {

        String procedimiento = "{call sp_historialDeposito(?, ?, ?, ?, ?, ?)}";
        ArrayList<Deposito> abonos = new ArrayList<>();

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
                Deposito deposito = depositoPorId(rs.getInt("idDeposito"));
                abonos.add(deposito);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return abonos;
    }

    public static boolean guardarRegistro(Deposito deposito) {
        int registrado = 0;

        String query = "INSERT INTO Deposito (" + Deposito.CAMPOS + ") VALUES(";

        Object[] valores = {deposito.getAhorro().getId(), deposito.getMonto(),
            Utileria.getFechaFormateada(deposito.getFecha(), Utileria.ANIO_MES_DIA),
            deposito.getMetodo(), deposito.getUsuario().getId()};

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

    public static Deposito depositoPorId(int id) {
        String consulta = "SELECT * FROM Deposito WHERE id = " + id;
        Deposito deposito = new Deposito();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                deposito.setId(rs.getInt(1));
                deposito.setAhorro(CAhorro.ahorroPorId(rs.getInt(2)));
                deposito.setMonto(rs.getDouble(3));
                deposito.setFecha(rs.getDate(4));
                deposito.setMetodo(rs.getString(5));
                deposito.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return deposito;
    }
}
