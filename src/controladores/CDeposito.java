package controladores;

import java.util.ArrayList;
import java.util.Date;
import modelos.Deposito;
import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import utilerias.Utileria;

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
}
