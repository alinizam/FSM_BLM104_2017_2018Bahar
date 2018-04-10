/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08Lab;

import java.util.Arrays;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        int dizi[]=new int[10];
        for (int i = 0; i < 1000000; i++) {
            int rasgeleSayi=(int)(10*Math.random());
            dizi[rasgeleSayi]++;
        }
        for (int e : dizi) {
             System.out.print(e+" ");
        }
       
    }
}
