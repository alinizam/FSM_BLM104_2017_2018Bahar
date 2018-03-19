/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class FaturaTutarException extends RuntimeException {
    int faturaTutar;

    public FaturaTutarException(int faturaTutar) {
        this.faturaTutar = faturaTutar;
    }
    
}
