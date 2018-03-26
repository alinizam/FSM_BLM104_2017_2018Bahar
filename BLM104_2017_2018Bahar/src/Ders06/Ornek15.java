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
public class Ornek15 {
    public static void main(String[] args) {
        double d=15.632;
        String s=Double.toString(d);
        System.out.println(s.substring(0,s.indexOf(".")).length());
        System.out.println(s.substring(s.indexOf(".")+1).length());
        
        System.out.println(s.indexOf("."));
        System.out.println(s.length()-(s.indexOf(".")+1));
    }
}
