/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        Path yol=Paths.get("c:\\dosyalar");
          PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.{txt,mat}");
        try(DirectoryStream<Path> dosyalar=Files.newDirectoryStream(yol)){
            for (Path dosya : dosyalar) {
                if (matcher.matches(dosya))
                    System.out.println(dosya);
            }
        }catch(IOException e){
            System.out.println("Yol bulunamad?.");
        }
    }
}
