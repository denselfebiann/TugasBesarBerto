/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ATMCard;
import Model.ATMMachine;
import javax.swing.JOptionPane;

/**
 *
 * @author dense
 */
public class MenuTransfer {
    public MenuTransfer(ATMCard card, ATMMachine mesin){
        String cardNumber = JOptionPane.showInputDialog("Masukkan cardNumber:");
        int nominal = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nominal: "));
        mesin.transfer(card, mesin, cardNumber, nominal);
    }
}
