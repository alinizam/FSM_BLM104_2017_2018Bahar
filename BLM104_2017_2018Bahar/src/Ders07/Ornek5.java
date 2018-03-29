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
public class Ornek5 {

    public static void main(String[] args) {
        String aranacak = "A13213b Sultzan2ddd Fatih 32Mehmet???";
        // String desen="([A-z]+[0-9])";  //sonunda numara olan kelimeler
        String desen = "([A-z]+[0-9]+[A-z]+)";
        Ornek3.arama(aranacak, desen);

        //Klasik çözüm
        String[] kelimeler = aranacak.split(" ");
        for (String kelime : kelimeler) {
            boolean numaraVarMi = false;
            if (Character.isAlphabetic(kelime.charAt(0)) && Character.isAlphabetic(kelime.charAt(0))) {
                for (int i = 1; i < kelime.length() - 1; i++) {
                    if (Character.isDigit(kelime.charAt(i))) {
                        numaraVarMi = true;
                    }
                }
            }
            if (numaraVarMi) {
                System.out.println(kelime);
            }

        }

    }
}
