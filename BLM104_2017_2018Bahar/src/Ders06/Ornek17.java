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
public class Ornek17 {
    public static void main(String[] args) {
        System.out.println("Ahmet"=="Ahmet");
        
        String s="Ahmet";
        System.out.println(s=="Ahmet");
        
        String s1=new String("Ahmet");
        System.out.println(s1==s);
        
        System.out.println((new String("Ahmet"))==(new String("Ahmet")));
    
        System.out.println("Ahmet".equals(new String("Ahmet")));
    }
}
