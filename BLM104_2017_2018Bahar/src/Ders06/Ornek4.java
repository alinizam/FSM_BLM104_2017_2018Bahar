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
public class Ornek4 {

    public static void main(String[] args) {
        String adi = "Ahmet";
        String soyadi = " Ak";
        System.out.println(adi.concat(soyadi));
        adi = adi.concat(soyadi).concat(" o?lu").concat("nun o?lu");
        System.out.println(adi);
    }
}
