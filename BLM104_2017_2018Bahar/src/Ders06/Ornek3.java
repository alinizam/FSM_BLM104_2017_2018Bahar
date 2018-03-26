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
public class Ornek3 {
    public static void main(String[] args) {
        String s="kavak";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        boolean tersEsitMi=true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                tersEsitMi=false;
            }
        }
        System.out.println(tersEsitMi);
    }
}
