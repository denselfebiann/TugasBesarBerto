/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ATMCard;
import Model.ATMMachine;

/**
 *
 * @author dense
 */
public class MenuKeluar {
    public MenuKeluar(ATMCard card, ATMMachine mesin){
        mesin.ejectCard(card, mesin);
    }
}
