/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.util.Locale;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        
        System.out.printf("Para %+-,10.2f %n",-10.0);
        System.out.format("Para %+-,10.2f %n",100000.23);
        System.out.format("Para %+-,10.2f %n",104555.1);
        
        System.out.format(Locale.ENGLISH,"Para %+-,10.2f %n",104555.1);
    }
}
