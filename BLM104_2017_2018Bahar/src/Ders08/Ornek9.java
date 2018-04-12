/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) throws SQLException {
        String adres="jdbc:derby://localhost:1527/sample";
        Connection con=DriverManager.getConnection(adres,"app","app");
        Statement st=con.createStatement();
        int maas=14000;
        ResultSet rs=st.executeQuery("select * from personel where maas>"+maas);
        while (rs.next()){
            System.out.print(rs.getInt("personel_id")+" - ");
            System.out.print(rs.getString("adi")+" - ");
            System.out.print(rs.getString("soyadi")+" - \n ");
        }
    
    }
}
