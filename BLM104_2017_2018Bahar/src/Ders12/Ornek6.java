/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek6 {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        FileWriter file=new FileWriter("c:\\dosyalar\\merhaba.txt");
        file.write("Ahmet Ak");
        file.close();
        System.out.println("");
    }
}
