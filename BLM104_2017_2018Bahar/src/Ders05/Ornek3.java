/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args){
        
        try(FileWriter yazici=new FileWriter("c:\\dosyalar\\ilkDosya.txt");
            FileWriter yazici1=new FileWriter("c:\\dosyalar\\ilkDosya.txt")    ){
            yazici.write(65);
            System.out.println("Bitti");
          
        } catch (IOException ex) {
             
        } 
    }
}
