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
public class Ornek7 {
    public static void main(String[] args) {
        Path yol=Paths.get("C:\\dosyalar\\b\\c\\Merhabaddd.txt");
        System.out.println(yol.getFileName());
        System.out.println(yol.getRoot());
        System.out.println("-------------");
        for (int i = 0; i < yol.getNameCount(); i++) {
            System.out.println(yol.getName(i));
        }
        System.out.println(yol.getParent() );
    }
    
}
