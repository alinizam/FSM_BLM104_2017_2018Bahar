/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(50));
        }
        System.out.println("------------------");
        int altSinir=50;
        int buyukluk=30;
        for (int i = 0; i < 10; i++) {
            int rasgeleSayi=r.nextInt(buyukluk)+altSinir;
            System.out.println(rasgeleSayi);
            
        }
        
    }
}
