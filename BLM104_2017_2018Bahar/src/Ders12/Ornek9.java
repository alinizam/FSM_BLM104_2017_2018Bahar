/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter file=new PrintWriter("c:\\dosyalar\\maas.txt");
        file.format("%30s  %8d %n", "Ahmet",20000);
        file.format("%30s  %8d %n", "Mehmet",3000);
        file.format("%30s  %8d %n", "Ay?e",60000);
        file.close();
    }
}
