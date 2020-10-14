/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DummyData;
import Model.ATMMachine;
import javax.swing.JOptionPane;

/**
 *
 * @author dense
 */
public class PilihMesin {
    public PilihMesin(DummyData data){
        boolean cek = true;
        String mesin = "";
        for(int i = 0; i < data.getMachine().size(); i++){
            mesin += "Mesin ATM Ke-" + (i+1) + "\n";
        }
        while(cek){
            int isi = Integer.parseInt(JOptionPane.showInputDialog("Silahkan Pilih Mesin\n" + mesin));
            boolean cek2 = false;
            for(int i = 0; i < data.getMachine().size(); i++){
                if(data.getMachine().get(i).getKodeATM() == isi){
                    cek2 = true;
                }
            }
            if(cek2){
                cek = false;
                new MasukkanKartu(data.getMachine().get(isi));
            }else{
                JOptionPane.showMessageDialog(null, "Pilihan Tidak Ada!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
