/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        try {
            Ambar a=new Ambar();
            a.cikisYap(60);
        } catch (StokException e) {
          //Eksik malzeme kadar malzeme sipari? et
           System.out.println("Sipari? edilecek miktar = "+ e.kalanMiktar);
          //Siparis.baslat(e.kalanMiktar)
        }
    }
}
