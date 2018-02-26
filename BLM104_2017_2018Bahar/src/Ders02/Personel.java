/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

/**
 *
 * @author anizam
 */
public class Personel {

    public Personel(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;
    }
    String adi,soyadi;

    @Override
    public String toString() {
        return adi+" "+soyadi; //To change body of generated methods, choose Tools | Templates.
    }
    
}
