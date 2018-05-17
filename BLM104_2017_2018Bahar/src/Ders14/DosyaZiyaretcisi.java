/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 *
 * @author anizam
 */
public class DosyaZiyaretcisi implements FileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path t, BasicFileAttributes bfa) throws IOException {
        System.out.println(t);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path t, BasicFileAttributes bfa) throws IOException {
    //    if (Files.isDirectory(t)) {
    //        System.out.println(t);
    //    }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path t, IOException ioe) throws IOException {
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path t, IOException ioe) throws IOException {
        return FileVisitResult.CONTINUE;
    }

}
