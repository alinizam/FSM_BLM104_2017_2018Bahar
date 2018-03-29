/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Lab;

/**
 *
 * @author anizam
 */
public class Soru2 {
    public static void main(String[] args) {
        String dizi[] = {"Fatih","Sultan","Mehmet"};
        String yeniOlusan = "";
        for (String dizi1 : dizi) {
            yeniOlusan+=dizi1+" ";
        }
        System.out.println(yeniOlusan);
    }
    
}
