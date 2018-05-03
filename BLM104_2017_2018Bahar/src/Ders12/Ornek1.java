/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream file = new FileInputStream("c:\\dosyalar\\merhaba.txt");

        /*int c = file.read();

         while (c != -1) {
         System.out.print((char) c);
         c = file.read();
         }*/
        /*int c;
         do {
         c = file.read();
         System.out.print((char) c);
         } while (c != -1);*/
        int c;
        while ((c = file.read()) != -1) {
            System.out.print((char)c);    
        }
        System.out.println("");
        file.close();
    }
}
