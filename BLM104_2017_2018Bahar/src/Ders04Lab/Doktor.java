/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Doktor {
    int id;
    String isim;
    int ucret;

    public Doktor(int id, String isim,int ucret) {
        this.id = id;
        this.isim = isim;
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return id+" "+isim+" "+ucret;
    }
    
}
