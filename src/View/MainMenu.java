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
public class MainMenu {
    public MainMenu(ATMCard card, ATMMachine mesin){
        boolean cek = true;
        while(cek){
            int isi = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Pilih Menu\n"
                + "1. Cek Saldo\n"
                + "2. Tarik Tunai\n"
                + "3. Transfer\n"
                + "4. Keluar\n"));
            switch(isi){
                case 1:
                    new MenuSaldo(card, mesin);
                    break;
                case 2:
                    new MenuTarikTunai(card, mesin);
                    break;
                case 3:
                    new MenuTransfer(card, mesin);
                    break;
                case 4:
                    new MenuKeluar(card, mesin);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
