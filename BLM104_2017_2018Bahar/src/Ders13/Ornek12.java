/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek12 {
    public static void main(String[] args) {
        try {
            Files.delete(Paths.get("c:","dosyalar","Maas.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Ornek12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
