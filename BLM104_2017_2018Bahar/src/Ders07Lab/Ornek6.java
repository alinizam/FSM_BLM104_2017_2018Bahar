/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
         String cumle = "fatih1 sultan11 mehmet6 üniversitesa1";
         for (int i = 0; i < cumle.length()/2; i++) {
            if (cumle.charAt(i)==cumle.charAt(cumle.length()-i-1))
                 System.out.println(cumle.charAt(i));
        }
    }
}
