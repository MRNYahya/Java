package toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static Connection MySQLConfig;
    
    public static Connection configDB() {
        try{
            final String url = "jdbc:mysql://localhost:3306/toko";
            final String user = "root";
            final String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            MySQLConfig = DriverManager.getConnection(url, user, password);
            
        }catch (SQLException e){
            System.out.println("Gagal Akses ke Database");
        }
        return MySQLConfig;
    }
}