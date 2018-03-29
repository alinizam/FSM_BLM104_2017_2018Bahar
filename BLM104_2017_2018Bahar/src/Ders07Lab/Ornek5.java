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
public class Ornek5 {
    public static void main(String[] args) {
        String cumle = "fatih1 sultan11 mehmet6 üniversitesi1";
        int toplam=0;
        for (int i = 0; i < cumle.length(); i++) {
            int sayi;
            try{
                sayi= Integer.parseInt(String.valueOf(cumle.charAt(i)));
                toplam+=sayi;
            }catch (NumberFormatException e){
                //System.out.println("Hata");  
            }
            //Character.isDigit(cumle.charAt(i))
        }
        System.out.println("Toplam = " + toplam);
    }
}
