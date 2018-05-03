/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) throws FileNotFoundException {
        //FileReader file=new FileReader("c:\\dosyalar\\sayilar.txt");
        //BufferedReader bFile=new BufferedReader(file);
        //Scanner s=new Scanner(bFile);
        
        
        Scanner s=new Scanner(new BufferedReader(new FileReader("c:\\dosyalar\\sayilar.txt")));
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.nextInt());
        
    
    }
}
