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
public class MenuTarikTunai {
    public MenuTarikTunai(ATMCard card, ATMMachine mesin){
        int tarik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nominal: "));
        mesin.withdrawal(card, mesin, tarik);
    }
}
