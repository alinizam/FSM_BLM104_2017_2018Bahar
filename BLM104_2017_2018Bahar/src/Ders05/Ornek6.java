/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException ex) {
            Logger.getLogger(Ornek6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
