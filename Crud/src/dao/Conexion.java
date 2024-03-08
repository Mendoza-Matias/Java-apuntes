package dao;

import java.sql.*;

public class Conexion {
    
    //Declaro una variable de tipo conexion
    protected Connection conexion;
    //Declaro mis constantes
    final String url = "jdbc:mysql://localhost:3306/ejemplojdbc";
    final String user = "root";
    final String pass = "matute805729";

   
    public void conectar() throws Exception {
        try {
            //Registrar controlador jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Realizar la conexion
            conexion = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void cerrarConexion() throws Exception{
            if (conexion != null) {
                //Cierro la conexion
                if (!conexion.isClosed()) {
                    conexion.close();
                }
            }
    }

}
