package PCKDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    // Método que crea y devuelve una conexión a la base de datos
    public Connection conectarbd() {
        Connection con = null;
        try {
            // Cargar el driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Establecer la conexión
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=WEBCHEFGRANDE;encrypt=false;trustServerCertificate=true;", "sa", "12345");
            // Mostrar un mensaje de éxito
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException e) {
            // Mostrar un mensaje de error si no se encuentra el driver
            System.out.println("No se encontró el driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            // Mostrar un mensaje de error si hay problemas con la conexión
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
