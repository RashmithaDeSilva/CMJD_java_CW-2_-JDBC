/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseConnection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lahiru (PK) 
 */
public class DBConnection {
    private static DBConnection DBC;
    private Connection connection;
    
    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/thogakade",
                    "root",
                    "1234"
       );
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (DBC == null) {
            DBC = new DBConnection();
        }
        return DBC;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
}
