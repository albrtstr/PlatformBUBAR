/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import Fungsi.DataBaseConnection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ROG
 */
public class Test {
    public static void main(String[] args) {
        try {
            DataBaseConnection conn = new DataBaseConnection();
            Statement statement = conn.getConnection().createStatement();
            String query = "INSERT INTO `customer`(`idCustomer`, `nama`, `username`, `password`, `alamat`, `noTelp`) "
                    + "VALUES ('12345','Anjing Lu Ga','anjingajnig','aswlahh','kepollu','085251487785')";
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
