/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class MyArrayList extends ArrayList{

    @Override
    public String toString() {
        String s="";
        int i=1;
        for (Object t : this.toArray()) {
            s+=i+" "+t.toString()+",";
            i++;
        }
        return s; //To change body of generated methods, choose Tools | Templates.
    }

}
