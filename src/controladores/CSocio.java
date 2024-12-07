package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.Socio;

/**
 *
 * @author daxsa
 */
public class CSocio {

    public static ArrayList<Socio> getRegistros() {
        String consulta = "SELECT * FROM Socio";
        ArrayList<Socio> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                Socio socio = new Socio();
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
                socios.add(socio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return socios;
    }

    public static Socio socioPorId(int id) {
        String consulta = "SELECT * FROM Socio WHERE id = " + id;
        Socio socio = new Socio();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);

            while (rs.next()) {
                socio.setId(rs.getInt(1));
                socio.setNombre(rs.getString(2));
                socio.setApellidos(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socio.setCorreo(rs.getString(5));
                socio.setDireccion(rs.getString(6));
                socio.setFechaCreacion(rs.getDate(7));
                socio.setEstatus(rs.getInt(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return socio;
    }
}
