package controladores;

import static bd.BaseConexion.getConexion;
import bd.CBaseDatos;
import modelos.Configuracion;
import java.sql.*;
import utilerias.Utileria;

/**
 *
 * @author daxsa
 */
public class CConfiguracion {

    public static Configuracion getConfiguracion() {
        Configuracion conf = new Configuracion();
        String query = "SELECT * FROM Configuracion";

        try {
            ResultSet rs = getConexion().createStatement().executeQuery(query);
            if (rs.next()) {
                conf.setId(rs.getInt(1));
                conf.setFechaCierre(rs.getDate(3));
                conf.setPrecioAccion(rs.getDouble(4));
                conf.setInteresSocio(rs.getDouble(5));
                conf.setInteresExterno(rs.getDouble(6));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return conf;
    }

    public static int actualizar(Configuracion configuracion) {
        int act = 0;
        String query = "UPDATE Configuracion SET ";
        String campos = Configuracion.CAMPOS_ACT;
        query = query + CBaseDatos.adjuntarSimbolo(campos, ",", "?") + " WHERE " + "idConfiguracion" + " = ? ";

        Object[] valores = {Utileria.getFechaFormateada(configuracion.getFechaCierre(), Utileria.ANIO_MES_DIA),
            configuracion.getPrecioAccion(), configuracion.getInteresSocio(),
            configuracion.getInteresExterno(), configuracion.getId()};

        try {
            PreparedStatement ps = getConexion().prepareStatement(query);
            CBaseDatos.setValores(ps, valores);
            act = ps.executeUpdate();
        } catch (SQLException | NullPointerException ex) {
            System.err.println(ex.getMessage());
        }
        return act;
    }
}
