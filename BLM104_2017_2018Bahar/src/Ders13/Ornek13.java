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
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek13 {
    public static void main(String[] args) {
        try {
            Path kaynak=Paths.get("c:\\dosyalar");
            Path hedef=Paths.get("c:\\dosyalar1");
            Files.copy(kaynak, hedef, REPLACE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(Ornek13.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
