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
public class Ornek9BirimTest {
    public static void main(String[] args) {
        Birim b=new Birim();
        try {
             b.calisanlar.add(new Personel());
             b.calisanlar.add(new Personel());
             b.birimSil(0); 
        } catch (Exception e) {
            System.out.println(  e.getClass());
        }
       
        Birim b1=new Birim();
        b.birimSil(1);
    }
}
