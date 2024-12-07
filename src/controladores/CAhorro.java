package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.Ahorro;

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
                ahorro.setEstatus(rs.getString(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
                ahorros.add(ahorro);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
                ahorro.setEstatus(rs.getString(5));
                ahorro.setUsuario(CUsuario.usuarioPorId(rs.getInt(6)));
                ahorro.setAhorrado(rs.getDouble(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ahorro;
    }
}
