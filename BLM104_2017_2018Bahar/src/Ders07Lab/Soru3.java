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
public class Soru3 {
    public static void main(String[] args) {
        String metin = "Fatih Sultan Mehmet ";
        char dizi[]=new char[metin.length()];
        for (int i = 0; i < metin.length(); i++) {
            dizi[i] = metin.charAt(i);
        }
        
        for (char e : dizi) {
            System.out.println(e);
        }
    }
}
