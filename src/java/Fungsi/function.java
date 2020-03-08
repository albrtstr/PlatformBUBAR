/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import Tools.AdminID;
import Tools.AdminLogin;
import Tools.CostumerID;
import Tools.CustomerLogin;
import Tools.booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebParam;

/**
 *
 * @author ROG
 */
public class function {

    private DataBaseConnection conn;
//    Connection con = conn.getConnection();

    public CostumerID profilCostumer(String username) {

        try {
            conn = new DataBaseConnection();
            String query = "SELECT * FROM CUSTOMER WHERE username LIKE '" + username + "'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            if (result.first()) {
                CostumerID p = new CostumerID();
                p.setIdCustomer(result.getString("idCustomer"));
                p.setUsername(result.getString("username"));
                p.setPassword(result.getString("password"));
                p.setNama(result.getString("nama"));
                p.setNoTelp(result.getString("noTelp"));
                p.setAlamat(result.getString("alamat"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public AdminID profilAdmin(String username) {
        try {
            conn = new DataBaseConnection();
            String query = "SELECT * FROM ADMIN WHERE username LIKE '" + username + "'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            if (result.first()) {
                AdminID p = new AdminID();
                p.setIdAdmin(result.getString("idAdmin"));
                p.setUsername(result.getString("username"));
                p.setPassword(result.getString("password"));
                p.setNama(result.getString("nama"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean cekCostumer(String username, String password) {
        try {
            conn = new DataBaseConnection();
            String query = "SELECT * FROM `customer` WHERE username like '" + username + "' AND password like '" + password + "'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            return result.isFirst();
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void booking(booking booking) {

        try {
            conn = new DataBaseConnection();
            String query = "INSERT INTO `booking`(`idBooking`, `idCustomer`, `nama`, `telepon`, `tanggalMasuk`, `tanggalKeluar`, `jumlahTamu`, `virtualAcc`, `cabang`, `tipeKamar`) "
                    + "VALUES ('" + booking.getIdBooking() + "','" + booking.getIdCustomer() + "','" + booking.getNama() + "','" + booking.getTelepon() + "','" + booking.getTanggalMasuk()
                    + "','" + booking.getTanggalKeluar() + "','" + booking.getJumlahTamu() + "','" + booking.getVirtualAcc() + "','" + booking.getCabang() + "','" + booking.getTipeKamar() + "')";

            java.sql.Statement statement = conn.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public int cekJumlahKamar(String tipe) {
        System.out.println(tipe);
        try {
            conn = new DataBaseConnection();
            String query = "SELECT jumlahKamar FROM `kamar` WHERE tipeKamar LIKE '"+tipe+"'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            System.out.println(result.getInt(1));
            return result.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
    
    public void ubahJumlahKamar(int cekCostumer, String tipe) {
        try {
            conn = new DataBaseConnection();
            String sql = "UPDATE `kamar` SET `jumlahKamar`= '"+(cekCostumer-1)+"' WHERE tipeKamar LIKE '"+tipe+"'";
            java.sql.Statement stat = conn.getConnection().createStatement();
            stat.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validateCustomer(CustomerLogin loginCust) {
        boolean status = false;
        try {
            conn = new DataBaseConnection();
            Connection connect = conn.getConnection();

            PreparedStatement ps = connect.prepareStatement("select * from customer where username = ? and password = ?");
            ps.setString(1, loginCust.getUsername());
            ps.setString(2, loginCust.getPassword());

            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }

    public boolean validateAdmin(AdminLogin loginAdm){
        boolean status = false;
        try {
            conn = new DataBaseConnection();
            Connection connect = conn.getConnection();

            PreparedStatement ps = connect.prepareStatement("select * from admin where username = ? and password = ?");
            ps.setString(1, loginAdm.getUsername());
            ps.setString(2, loginAdm.getPassword());
            
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }

}
