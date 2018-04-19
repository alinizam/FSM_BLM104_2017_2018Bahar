/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
            con.setAutoCommit(false);
            String adi="FATMA", soyadi="AK";
            int pId=20;
            String sqlEkleme="INSERT INTO PERSONEL "
                        + "(personel_id,adi,soyadi)"
                       + " VALUES "
                       + "(?,?,?)" ;
            PreparedStatement stInsert = con.prepareStatement(sqlEkleme);
            stInsert.setInt(1, pId);
            stInsert.setString(2, adi);
            stInsert.setString(3, soyadi);
            int kayitSayisi=stInsert.executeUpdate();
            
            String sqldegistirme="UPDATE PERSONEL "
                        + " SET maas=?"
                        + " WHERE personel_id=?";
              
            PreparedStatement stUpdate = con.prepareStatement(sqldegistirme);
            stUpdate.setInt(1, 3000);
            stUpdate.setInt(2, pId); 
            
            stUpdate.executeUpdate();
            
            System.out.println(kayitSayisi);
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
