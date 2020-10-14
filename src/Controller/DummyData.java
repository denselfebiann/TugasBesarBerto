/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ATMCard;
import Model.ATMMachine;
import Model.Transaction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dense
 */
public class DummyData {
    private ArrayList<ATMCard> card = new ArrayList<ATMCard>();
    private ArrayList<ATMMachine> machine = new ArrayList<ATMMachine>();
    public DummyData(){
        ATMCard a = new ATMCard("3432243", "David", "Jl. Dipatiukur No. 42", 2000000, "3782791239", "111111");
        card.add(a);
        a = new ATMCard("4783734", "Peter", "Jl. Dipatiukur No. 12", 1000000, "12893892", "123123");
        card.add(a);
        DateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        Date now = new Date();
        Transaction transaksi = new Transaction("1", now);
        ArrayList<Transaction> tr = new ArrayList<>();
        tr.add(transaksi);
        ATMMachine b = new ATMMachine(1, 1000000000, tr);
        machine.add(b);
        b = new ATMMachine(2, 1000000000, tr);
        machine.add(b);
        b = new ATMMachine(3, 2000000, tr);
        machine.add(b);
    }

    public ArrayList<ATMCard> getCard() {
        return card;
    }
    public ArrayList<ATMMachine> getMachine() {
        return machine;
    }
}
