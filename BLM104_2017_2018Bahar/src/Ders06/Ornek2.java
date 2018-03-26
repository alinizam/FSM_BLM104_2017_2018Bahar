/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        Personel p=new Personel();
        p.adi="Mehmet";
        ahmetYap(p);
        System.out.println(p.adi);
        
        int x=6;
        arttir(x);
        System.out.println(x);
        
        String metin="Ahmet ";
        metniDegistir(metin);
        System.out.println(metin);
    }
    static void ahmetYap(Personel p){
        p.adi="Ahmet";
    }
    static void arttir(int i){
        i++;
    }
    static void metniDegistir(String s){
        s+=" Ak";
        System.out.println(s);
    }
}
