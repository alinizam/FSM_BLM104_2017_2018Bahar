/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        for (Long i = 0l; i < 10000000; i++) {
           Long t=i;
           t=t+i;
        }
        System.out.println("bitti");
 
    }
}
