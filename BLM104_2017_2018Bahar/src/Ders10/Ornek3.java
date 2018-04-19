/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
         try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app")) {
            //database metadata
             DatabaseMetaData dbMetada=con.getMetaData();
             System.out.print(dbMetada.getDatabaseProductName()+":");
             System.out.print(dbMetada.getDatabaseMajorVersion()+":");
             System.out.println(dbMetada.getDatabaseMinorVersion()+":");
            //result set mata 
            String sqlSorgu="SELECT * FROM personel";     
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery(sqlSorgu);
            ResultSetMetaData rsMetaData=rs.getMetaData();
             for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                 System.out.println(rsMetaData.getColumnName(i)+" "+rsMetaData.getColumnTypeName(i));
             }
            
       
        } catch (SQLException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
