package controladores;

import modelos.Empresa;
import java.sql.ResultSet;
import static bd.BaseConexion.getConexion;

/**
 *
 * @author daxsa
 */
public class CEmpresa {
    
    public static Empresa getEmpresa() {
        String consulta = "SELECT * FROM Empresa";
        Empresa empresa = new Empresa();
        try {
            ResultSet rs = getConexion().createStatement().executeQuery(consulta);
            
            while (rs.next()) {
                empresa.setRazonSocial(rs.getString(1));
                empresa.setRfc(rs.getString(2));
                empresa.setContacto(rs.getString(3));
                empresa.setDireccion(rs.getString(4));
                empresa.setColonia(rs.getString(5));
                empresa.setEstado(rs.getString(6));
                empresa.setMunicipio(rs.getString(7));
                empresa.setCp(rs.getString(8));
                empresa.setTel(rs.getString(9));
                empresa.setCel(rs.getString(10));
                empresa.setId(rs.getInt(11));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return empresa;
    }
}
