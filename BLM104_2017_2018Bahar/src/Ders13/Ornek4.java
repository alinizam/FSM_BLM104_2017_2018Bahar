/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        //Nesne yazma
        ObjectOutputStream file = null;
        try {
            String filePath = "c:\\dosyalar\\nesneler.dat";
            file = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(filePath)));
            Personel personeller[] = new Personel[3];
            personeller[0] = new Personel("Ahmet", "Ak", 10000);
            personeller[1] = new Personel("Mehmet", "Beyaz", 10000);
            personeller[2] = new Personel("Ay?e", "Ak", 10000);
            file.writeObject(personeller);
            System.out.println("yazd?");
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
