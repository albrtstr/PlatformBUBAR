/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author M S I
 */
public class DataBaseConnection {
    
    private Connection connection = null;
    
    public DataBaseConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/rpl2", "root", "");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Offline");
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public static void main (String[] args){
        DataBaseConnection database = new DataBaseConnection();
//        int randomIntegerRange = getRandomIntegerWithinRange(10, 20);
//        System.out.println();
    }
}
