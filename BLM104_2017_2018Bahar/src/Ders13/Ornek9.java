/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        Path p=Paths.get("c:\\");
        p=p.resolve("dosyalar");
        p=p.resolve("Merhaba.txt");
        System.out.println(p);
        
        
    }
    
}
