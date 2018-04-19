/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
            
            Statement s = con.createStatement();
            String sqlEkleme="INSERT INTO PERSONEL "
                        + "(personel_id,adi,soyadi)"
                       + "VALUES"
                       + "(1512,'Ahmet','AK')" ;
            String sqlSilme="DELETE FROM PERSONEL "
                        + " WHERE personel_id>4";
                       
            System.out.println(sqlSilme);
            int kayitSayisi=s.executeUpdate(sqlSilme);
            System.out.println(kayitSayisi);
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
