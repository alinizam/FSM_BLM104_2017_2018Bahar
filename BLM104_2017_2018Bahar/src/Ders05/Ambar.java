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
public class Ambar {

    int ambardakiMiktar = 50;

    void cikisYap(int cikisMiktari) {

        if (ambardakiMiktar < cikisMiktari) {
            throw new StokException(ambardakiMiktar,cikisMiktari);
        }

    }
}
