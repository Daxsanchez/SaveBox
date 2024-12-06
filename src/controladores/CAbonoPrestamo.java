package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.AbonoPrestamo;
import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CAbonoPrestamo {

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
}
