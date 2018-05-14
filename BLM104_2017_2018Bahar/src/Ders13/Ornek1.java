/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=new Scanner(new FileReader("c:\\dosyalar\\sayilar.txt"));
        
        System.out.println(s.nextInt());
    }
}
