/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame =new JFrame();
        JTextField t1=new JTextField("Merhaba");
        JButton b1=new JButton("Dünya");
       // frame.add(t1);
       // frame.add(b1);
        frame.getContentPane().add(t1);
        frame.getContentPane().add(b1);
        
        for (int i = 0; i < 10; i++) {
           frame.add(new JButton(i+""));
        }
        frame.setLayout(new FlowLayout());
        frame.pack();
        
        frame.setVisible(true);
        
    }

}
