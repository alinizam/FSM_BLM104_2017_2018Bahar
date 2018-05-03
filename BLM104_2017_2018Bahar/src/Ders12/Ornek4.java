/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
          try (FileInputStream fileIn = new FileInputStream("c:\\dosyalar\\merhaba.txt");
               FileOutputStream fileOut = new FileOutputStream("c:\\dosyalar\\merhaba_hedef.txt")) {
            int c;
            while ((c = fileIn.read()) != -1) {
                System.out.print((char) c);
                fileOut.write(c);
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
