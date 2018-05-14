/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek11 {
    public static void main(String[] args) {
          Path p1 = Paths.get("c:\\dosyalar");
          System.out.println(Files.exists(p1));
          System.out.println(Files.isRegularFile(p1));
          System.out.println(Files.isWritable(p1));
    }
}
