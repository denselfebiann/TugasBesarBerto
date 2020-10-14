/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DummyData;
import javax.swing.JOptionPane;

/**
 *
 * @author dense
 */
public class PilihMenu {
    public PilihMenu(DummyData data){
        boolean cek = true;
        
        while(cek){
            int isi = Integer.parseInt(JOptionPane.showInputDialog("Pilih:\n"
                    + "1. Gunakan Mesin"
                    + "2. Lihat Transaksi Mesin"));
            switch(isi){
                case 1:
                    cek = false;
                    new PilihMesin(data);
                    break;
                case 2:
                    cek = false;
                    new LihatTransaksi(data);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
