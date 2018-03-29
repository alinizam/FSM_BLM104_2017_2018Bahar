/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek7 {

    public static void main(String[] args) {
        ArrayList<Integer> sayilar;
        int i = 5;
        Integer nesneI;
        nesneI = i;

        int j = nesneI;
        int a=nesneI*2;
        a=nesneI+i;
        
        kare(i);
        
        Object o=i;
        System.out.println(o);
    }
    
    static void kare(Object i){
        //System.out.println(i*i);
    }
}
