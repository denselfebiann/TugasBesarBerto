/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import Controller.*;
import Model.ATMMachine;
/**
 *
 * @author dense
 */
public class ValidasiPIN {
    public ValidasiPIN(ATMMachine mesin, String cardNumber){
        String pin = JOptionPane.showInputDialog("Silahkan Masukkan PIN Anda");
        mesin.validatePIN(pin, cardNumber, mesin);
    }
}
