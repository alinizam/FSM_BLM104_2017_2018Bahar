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
public class Ornek8 {
    public static void main(String[] args) {
        String isim="Ahmet Ak";
        int boslukYeri=isim.indexOf(" ");
        System.out.println(isim.substring(0, boslukYeri));
        System.out.println(isim.substring(boslukYeri+1));
    }
}
