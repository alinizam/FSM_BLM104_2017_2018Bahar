/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        System.out.println("program çal??t?");
        a();
        System.out.println("program normal bitti");
    }

    public static void a() {
        System.out.println("a çal??t?");
        b();
        System.out.println("a normal bitti");
    }

    public static void b() throws NullPointerException,ArithmeticException {
        System.out.println("b çal??t?");
        
            Object nesneler[] = new Object[3];
            System.out.println(nesneler[0].getClass());
            System.out.println("b normal bitti");
        
            
    }
}
