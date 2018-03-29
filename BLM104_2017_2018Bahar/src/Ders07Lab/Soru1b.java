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
public class Soru1b {
    public static void main(String[] args) {
        String metin = "Fatih Sultan Mehmet Vak?f Universitesi";
        
        for (int i = 0; i < metin.length(); i++) {
            
            if (metin.charAt(i) == ' ') {
                System.out.println("");
            }else{
                System.out.print(metin.charAt(i));
            }
        }
    }
}
