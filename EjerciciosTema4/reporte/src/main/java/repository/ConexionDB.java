package repository; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/personas";
    private static final String USUARIO = "manu";
    private static final String PASSWORD = "manu";

    public static Connection conectar() {
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("   -> Intentando conectar a la base de datos...");
        } catch (SQLException e) {
            System.err.println("   -> Error interno en ConexionDB: " + e.getMessage());
        }
        
        return conexion;
    }
}