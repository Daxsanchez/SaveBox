package bd;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daxsa
 */
public class CBaseDatos {
    
    public static ResultSet getUltimoRegistro(String tabla, String columna) {
        String query = "SELECT TOP 1 * FROM " + tabla + " ORDER BY " + columna + " DESC";
        ResultSet rs = null;
        try {
            rs = BaseConexion.getConexion().createStatement().executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return rs;
    }
    
    public static String formatearValores(int num) {
        String cad = "";
        if (num > 0) {
            cad = "";
            for (int i = 0; i < num; i++) {
                cad += (i == 0 ? " " : ", ") + "?";
            }
        }
        return cad;
    }
    
    public static void setValores(PreparedStatement ps, Object[] valores) {
        try {
            for (int i = 0; i < valores.length; i++) {
                if (getInt(valores[i]) != null) {
                    ps.setInt(i + 1, getInt(valores[i]));
                } else if (getDouble(valores[i]) != null) {
                    ps.setDouble(i + 1, getDouble(valores[i]));
                } else {
                    if (valores[i] != null) {
                        ps.setString(i + 1, valores[i].toString());
                    } else {
                        ps.setString(i + 1, null);
                    }
                    
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
    
    private static Integer getInt(Object valor) {
        Integer vl = null;
        if (valor instanceof Integer) {
            vl = (Integer) valor;
        }
        return vl;
    }
    
    private static Double getDouble(Object valor) {
        Double vl = null;
        if (valor instanceof Double) {
            vl = (Double) valor;
        }
        return vl;
    }
}
