/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import Tools.AdminLogin;
import Tools.CustomerLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class LoginFunction {

    public static boolean validate(CustomerLogin cust) {
        boolean status = false;
        try {
            DataBaseConnection conn = new DataBaseConnection();
            Connection connect = conn.getConnection();

            PreparedStatement ps = connect.prepareStatement("select * from customer where username = ? and password = ?");
            ps.setString(1, cust.getUsername());
            ps.setString(2, cust.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }
    
    public static boolean validateAdmin(AdminLogin adm){
        boolean status = false;
        try {
            DataBaseConnection conn = new DataBaseConnection();
            Connection connect = conn.getConnection();

            PreparedStatement ps = connect.prepareStatement("select * from admin where username = ? and password = ?");
            ps.setString(1, adm.getUsername());
            ps.setString(2, adm.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }
}
