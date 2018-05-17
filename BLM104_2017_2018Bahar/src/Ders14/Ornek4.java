/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek4 {

    public static void main(String[] args) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.{txt,class}");

        Path file = Paths.get("c:\\dosyalar\\Merhaba.txt");
        if (matcher.matches(file)) {
            System.out.println(file);
        }
    }
}
