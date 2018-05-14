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
public class Ornek10 {
    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\hedef\\kaynak");
        Path p2 = Paths.get("d:\\hedef\\alt");
        System.out.println(p1.relativize(p2));

    }
}
