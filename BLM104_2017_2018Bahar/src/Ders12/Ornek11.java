/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek11 {
    public static void main(String[] args) throws IOException {
        DataInputStream file=new DataInputStream(new FileInputStream("c:\\dosyalar\\isimler.dat"));
        System.out.println(file.readUTF());
        System.out.println(file.readInt());    
        System.out.println(file.readUTF());
        System.out.println(file.readInt());    
        file.close();
    }
}
