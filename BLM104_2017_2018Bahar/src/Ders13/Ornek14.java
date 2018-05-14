/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek14 {
    public static void main(String[] args) {
        try {
            Path kaynak=Paths.get("c:\\dosyalar\\Merhaba.txt");
            System.out.println(Files.getLastModifiedTime(kaynak));
            System.out.println(Files.getOwner(kaynak));
        } catch (IOException ex) {
            Logger.getLogger(Ornek14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
