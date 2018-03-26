/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek19 {
    public static void main(String[] args) {
       /* String s="a";
        for (int i = 0; i < 100000; i++) {
            s=s+"a";
        }
        System.out.println("Bitti");*/
        StringBuilder sb=new StringBuilder("a");
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        System.out.println("Bitti");   
    }
}
