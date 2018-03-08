/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek5Exception {

    public static void main(String[] args) {
        
        try {
            System.out.println("Bir say? giriniz");
            Scanner s = new Scanner(System.in);
            int bolen = s.nextInt();
            try {
                System.out.println(10 / bolen);
            } catch (Exception e) {
            }

            System.out.println("Normal bir ?ekilde bitti");
        } catch (Exception e) {
            System.out.println("Bölen s?f?r olamaz.");
        }
        
        

    }
}
