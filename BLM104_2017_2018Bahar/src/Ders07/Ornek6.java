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
public class Ornek6 {
    public static void main(String[] args) {
         String aranacak = "Sultzandddddan Sultzan2ddd Fatih 32Mehmet???";
        // String desen="([A-z]+[0-9])";  //sonunda numara olan kelimeler
        String desen = "(\\ban?\\w*an\\b?)";
        Ornek3.arama(aranacak, desen);
    }
}
