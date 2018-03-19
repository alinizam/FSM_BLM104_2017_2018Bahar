/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class ToplamTutarException extends Exception {
    static int sayac = 0;
    void printHataMesaji(int toplamMaas){
        System.out.println( sayac +" defa geçme denendi ve bu deneme tutar? "+toplamMaas);
    }
}
