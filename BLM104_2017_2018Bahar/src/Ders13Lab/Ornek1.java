/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        try {
            String filePath="c:\\dosyalar\\sayilar.txt";
            FileReader file=new FileReader(filePath);
            BufferedReader bFile= new BufferedReader(file);
            Scanner s=new Scanner(bFile);
            int i=0;
            int sayilar[]=new int[10];
            while(s.hasNextInt()){
                sayilar[i++]=s.nextInt();
            }
            int toplam=0;
            for (int t : sayilar) {
                toplam+=t;
            }
            System.out.println("Toplam = "+toplam);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
