/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.text.DecimalFormat;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        DecimalFormat bicim=new DecimalFormat("### ## ##");
        int sayi=5555555;
        String bicimliSayi=bicim.format(sayi);
        System.out.println(bicimliSayi);
        
    }
}
