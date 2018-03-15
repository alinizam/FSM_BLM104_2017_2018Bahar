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
public class BirimSilException extends RuntimeException{
    int personelAdet;

    public BirimSilException(int personelAdet) {
        this.personelAdet = personelAdet;
        System.out.println("Bu birimde "+personelAdet+" personel var.");
    }
    
}
