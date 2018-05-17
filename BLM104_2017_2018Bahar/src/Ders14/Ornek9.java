/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

/**
 *
 * @author anizam
 */
public class Ornek9 {

    public static void main(String[] args) {
        //RAndom Access File ile dosyan?n bir noktas?an yaz?labilir.
        //Bu API araya yazma de?il üzerine yazma esasl? çal???yor. 
        //Bu yüzden araya yazmak için manuel kayd?rma yap?lmal?d?r.
        //A?a??daki örnek üzerine yazma esasl? basit bir i?lemi içerir.
        String s = "ho?geldin \n";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);
        ByteBuffer copy = ByteBuffer.allocate(12);
        Path file=Paths.get("c:\\dosyalar\\Merhaba.txt");
        try (FileChannel fc = (FileChannel.open(file,WRITE))) {
            fc.position(18);
            while (out.hasRemaining()) {
                fc.write(out);
            }
            out.rewind(); 
          
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }

    }
}
