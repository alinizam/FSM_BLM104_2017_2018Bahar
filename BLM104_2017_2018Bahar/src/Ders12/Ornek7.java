/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader file=new BufferedReader(new FileReader("c:\\dosyalar\\kisiler.txt"));
        String line;
        while ((line=file.readLine())!=null){
            System.out.println(line);
        }
    }
}
