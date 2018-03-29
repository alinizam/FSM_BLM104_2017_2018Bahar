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
public class Soru4 {

    public static void main(String[] args) {
        int sayac;
        int k;
        boolean varmi = false;
        String aranan = "si";
        String cumle = "fatih sultan mehmet üniversitesi";
        int i = 0;
        while (i < cumle.length() && !varmi) {
            sayac = 0;
            while (i<cumle.length() && sayac < aranan.length()  && cumle.charAt(i) == aranan.charAt(sayac)) {
                sayac++;
                i++;
            }
            if (sayac == aranan.length()) {
                varmi = true;
            }
            i++;
        }
        if (varmi) {
            System.out.println("bulundu");
        } else {
            System.out.println("bulunamadi");
        }
    }
}
