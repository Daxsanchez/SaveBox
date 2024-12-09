package bd;

/**
 *
 * @author Código Lite - https://codigolite.com
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseConexion {

    private static String servidor = "127.0.0.1"; // nombre servidor
    private static String baseDatos = "SaveBox"; //nombre base de datos
    private static String usuario = "sa"; // usuario de la base de datos
    private static String pass = "12345"; // contraseña de la base de datos
    public static Connection conexion = null;

    public static void conectar() {

        String url = "jdbc:sqlserver://" + servidor + ":1434;databaseName=" + baseDatos + ";encrypt=true;trustServerCertificate=true";

        try {
            conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        }
    }

    public static Connection getConexion() {
        if (conexion == null) {
            conectar();
        }
        return conexion;
    }

}
