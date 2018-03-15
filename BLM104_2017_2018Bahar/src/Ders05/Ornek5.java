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
public class Ornek5 {

    public static void main(String[] args) {
        try {
            int maas = 500;
            if (maas < 1600) {
                throw new IllegalArgumentException();
            }
            
            //
             if (maas > 16600) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Maa? yanl?? atam??");
        } catch (Exception e) {
        }

    }
}
