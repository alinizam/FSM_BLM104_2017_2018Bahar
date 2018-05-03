/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        FileOutputStream file=null;
        try {
            file=new FileOutputStream("c:\\Dosyalar\\MerhabaDe.txt",true);
            file.write(' ');
            file.write('G');
            file.write('E');
            file.write('L');
            file.write('D');
            file.write('?');
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
