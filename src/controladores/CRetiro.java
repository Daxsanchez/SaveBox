package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.Retiro;
import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import utilerias.Utileria;

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
}
