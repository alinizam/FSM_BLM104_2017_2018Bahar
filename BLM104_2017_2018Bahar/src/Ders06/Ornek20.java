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
public class Ornek20 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println("Uzunluk : " +sb.length());
        System.out.println("Kapasite : " +sb.capacity());
        
        sb.append("Ahmet");
        System.out.println("Uzunluk : " +sb.length());
        System.out.println("Kapasite : " +sb.capacity());
        
        sb.append(" Ak");
        System.out.println("Uzunluk : " +sb.length());
        System.out.println("Kapasite : " +sb.capacity());
        
        sb.append(" eve geldi");
        System.out.println(sb);
        System.out.println("Uzunluk : " +sb.length());
        System.out.println("Kapasite : " +sb.capacity());
        
        sb.insert(8, " bugün");
        System.out.println(sb);
    }
}
