/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) { 
        ObjectInputStream file=null;
        try {
            String filePath="c:\\dosyalar\\nesneler.dat";
            file = new ObjectInputStream(
                       new BufferedInputStream(
                           new FileInputStream(filePath)) );
            Personel calisanlar[]=(Personel[])file.readObject();
            //ArrayList calisanlar=(ArrayList<Personel>)file.readObject();
            for (Personel c : calisanlar) {
                 System.out.println(c.adi+" "+c.soyadi);
            }
            System.out.println("okudu");
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
}
