package intermedio.base_de_datos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion() {
        Connection con = null;
        var baseDatos = "zona_fit_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var pw = "admin";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, pw);
        }catch (Exception e) {
            System.out.println("Error al conectar con la base de datos" + e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if (conexion != null) {
            System.out.println("Conexion establecida");
        }
        else {
            System.out.println("Conexion no establecida");
        }
    }
}
