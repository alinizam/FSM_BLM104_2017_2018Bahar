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
public class Soru4b {

    public static void main(String[] args) {
        String aranacak = "Fatih Sultan ababa";
        String aranan = "aba";
        boolean bulundu=false;
        for (int i = 0; i < aranacak.length(); i++) {
            boolean eslesti = true;
            for (int j = 0; j < aranan.length(); j++) {
                if (aranan.charAt(j) != aranacak.charAt(i + j)) {
                    eslesti = false;
                    break;
                }
            }
            if(eslesti) {
                bulundu=true;
                break;
            } 
        }
        System.out.println("bulundu mu  = "+bulundu);
    }
}
