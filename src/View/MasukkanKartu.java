/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ATMMachine;
import javax.swing.JOptionPane;

/**
 *
 * @author dense
 */
public class MasukkanKartu {
    public MasukkanKartu(ATMMachine mesin){
        String cardNumber = JOptionPane.showInputDialog(null, "Silahkan Masukkan Kartu Anda (Masukkan Card Number)", "Insert Card", JOptionPane.INFORMATION_MESSAGE);
        mesin.insertCard(mesin, cardNumber);
    }
}
