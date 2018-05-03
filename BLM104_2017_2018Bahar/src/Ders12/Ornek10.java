/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;
 
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream file=new DataOutputStream(new FileOutputStream("c:\\dosyalar\\isimler.dat"));
        file.writeUTF("Ahmet");
        file.writeInt(20000);
        file.writeUTF("Mehmet");
        file.writeInt(30000);
        file.close();
    }
}
