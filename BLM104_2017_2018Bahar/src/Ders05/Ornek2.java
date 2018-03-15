/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        FileWriter yazici=null;
        try {
            yazici = new FileWriter("c:\\dosyalar\\ilkDosya.txt");
            yazici.write(65);
            System.out.println("Bitti");
            yazici.close();
        } catch (IOException ex) {
            try {
                yazici.close();
            } catch (IOException ex1) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
