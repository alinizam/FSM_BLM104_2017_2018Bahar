/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        JFrame ekran=new JFrame("Merhaba Ekran?");
        JTextField t=new JTextField("Text Box");
        JButton b=new JButton("buton");
        JLabel l=new JLabel("Etiket");
        ekran.add(t);
        ekran.add(b);
        ekran.getContentPane().add(l);
        ekran.setLayout(new FlowLayout());
        ekran.setSize(300, 300);
        ekran.setVisible(true);
    }
}
