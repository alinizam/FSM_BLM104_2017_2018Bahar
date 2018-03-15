/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Birim {
    String birimAdi;
    ArrayList<Personel> calisanlar = new ArrayList();
    static ArrayList<Birim> birimler = new ArrayList();

    public Birim() {
        birimler.add(this);
    }
    
    void birimSil(int birimNo) {
        if (birimler.get(birimNo).calisanlar.isEmpty()) {
            birimler.remove(birimNo);
        } else {
            throw new BirimSilException(birimler.get(birimNo).calisanlar.size());
        }

    }
}
