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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
          try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
            String adi="AY?E", soyadi="AK";
            int pId=11;
            String sqlEkleme="INSERT INTO PERSONEL "
                        + "(personel_id,adi,soyadi)"
                       + " VALUES "
                       + "(?,?,?)" ;
            PreparedStatement st = con.prepareStatement(sqlEkleme);
            st.setInt(1, pId);
            st.setString(2, adi);
            st.setString(3, soyadi);
            
            System.out.println(sqlEkleme);
            int kayitSayisi=st.executeUpdate();
            System.out.println(kayitSayisi);
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
