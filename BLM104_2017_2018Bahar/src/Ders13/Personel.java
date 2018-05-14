/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.Serializable;

/**
 *
 * @author anizam
 */
public class Personel implements Serializable{
    String adi, soyadi;
    int maas;

    public Personel(String adi, String soyadi, int maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
    }
    
}
