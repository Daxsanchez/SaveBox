package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import modelos.Prestamo;

/**
 *
 * @author daxsa
 */
public class CPrestamo {

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
}
