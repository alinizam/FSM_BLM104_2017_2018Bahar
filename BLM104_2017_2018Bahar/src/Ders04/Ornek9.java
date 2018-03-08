/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek9.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void dosyaOku() throws FileNotFoundException, IOException{
        FileReader f=new FileReader("c:\\dosyalar\\Merhaba.txt");
        System.out.println((char)f.read()+""+(char)f.read()+""+(char)f.read()+""+(char)f.read()+""+(char)f.read()+""+(char)f.read()+""+(char)f.read());
    }
}
