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
public class Ornek1 {

    public static void main(String[] args) {

        try {
            Personel[] calisanlar = new Personel[3];
            int indis = 6;
            Integer.parseInt(" ");
           // int i=5/0;
            int maas = calisanlar[indis].maas / 0;
        }
        catch (ArithmeticException|NumberFormatException e) {
            System.out.println("Say?dal bir hata oldu"); 
            System.out.println(e.getClass()+" "+e.getMessage()); 
        }
        catch (NullPointerException e) {
            System.out.println("Nesne yok"); 
            System.out.println(e.getClass()+" "+e.getMessage()); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Yanl?? indis"); 
            System.out.println(e.getClass()+" "+e.getMessage()); 
        }
       

    }
}
