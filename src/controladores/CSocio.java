package controladores;

import static bd.BaseConexion.getConexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelos.Socios;

/**
 *
 * @author daxsa
 */
public class CSocio {
    
    public static ArrayList<Socios> getRegistros() {
        String consulta = "SELECT * FROM Heroe";
        ArrayList<Socios> socios = new ArrayList<>();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);
            
            while (rs.next()) {
                Socios socio = new Socios();
                socio.setNombre(rs.getString(3));
                socio.setEdad(rs.getInt(4));
                socios.add(socio);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return socios;
    }
}
