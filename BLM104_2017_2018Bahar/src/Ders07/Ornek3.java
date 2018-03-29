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
public class Ornek3 {
    public static void main(String[] args) {
        String aranacak="F65 Sultan# ###162 32Mehmet???";
       // String desen="[A-z0-9]{3,}";
        String desen="[\\w]{3,}";  
        arama(aranacak,desen);
    }
    static void arama(String aranacak,String desen ){
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(aranacak);
        while(m.find()){
            System.out.println(m.group()+" "+m.start()+" "+m.end());
        }
    
    }
    
}
