/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        String s="Fatih Sultan";
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int secilenNokta=r.nextInt(s.length());
            System.out.println(secilenNokta+" "+s.charAt(secilenNokta));
        }
        
    }
}
