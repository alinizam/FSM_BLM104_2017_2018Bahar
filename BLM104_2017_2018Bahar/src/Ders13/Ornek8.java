/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek8 {

    public static void main(String[] args) {
        Path yol = Paths.get("c:", "dosyalar", "b", "c", "Merhaba.txt");
        System.out.println(yol.toUri());    
        
        
        Path izafiYol = Paths.get("b", "c", "Merhaba.txt");
        System.out.println(izafiYol.toAbsolutePath());
        
        Path gercekYol = Paths.get("b", "c", "Merhaba.txt");
        try {
            System.out.println(gercekYol.toRealPath());
        } catch (IOException ex) {
            Logger.getLogger(Ornek8.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
