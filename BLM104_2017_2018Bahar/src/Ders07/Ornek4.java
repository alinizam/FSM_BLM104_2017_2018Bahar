/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        String aranacak="F6564654564564564565 Sultzan# ###162 32Mehmet???";
        String desen="[a-z]+";  
        Ornek3.arama(aranacak,desen);
    }
     
}
