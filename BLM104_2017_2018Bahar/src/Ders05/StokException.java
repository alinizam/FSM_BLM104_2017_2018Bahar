/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import javax.swing.JOptionPane;

/**
 *
 * @author anizam
 */
public class StokException extends ArithmeticException {
    int cikisMiktar, kalanMiktar;
    int ambardakiMiktar;

    public StokException(int ambardakiMiktar,int cikisMiktar) {
        this.cikisMiktar = cikisMiktar;
        this.ambardakiMiktar = ambardakiMiktar;
        kalanMiktar=Math.abs(ambardakiMiktar-cikisMiktar); 
        JOptionPane.showMessageDialog(null, "Stokta eksik malzeme var : "+kalanMiktar);
    }

 
    
}
