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
public class Ornek2 {
    public static void main(String[] args) {
        String aranacak="Fatih3165165 Sultan# 16232Mehmet???";
       // String desen="[[A-Z][a-z][0-9]]";
        String desen="[\\w]";
        Pattern p=Pattern.compile(desen);
        Matcher m=p.matcher(aranacak);
        while(m.find()){
            System.out.println(m.group()+" "+m.start()+" "+m.end());
        }
        
        
    }
}
