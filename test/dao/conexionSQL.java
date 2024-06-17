
package dao;

import static dao.Conexion.con;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSQL {
    Connection conectar=null;
    
    public conexionSQL conexion(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             String urldb = "jdbc:mysql://localhost:3306/"+ "test2";
            
            String usr = "root";
            String psw = "";
            conectar = (Connection) DriverManager.getConnection(urldb, usr, psw);
            System.out.println("Conexión exitosa");
        }catch(SQLException e){
            System.out.println("Error >> de conexión con la BD");
            
        }
    }
}
