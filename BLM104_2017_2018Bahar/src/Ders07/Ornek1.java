/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Ahmet");
        StringBuilder sb1=new StringBuilder("Ak");
        sb.append(" ");
        sb.append(sb1);
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
        sb.insert(5, " Öz");
        System.out.println(sb);
        
    }
}
