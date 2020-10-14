/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DummyData;
import View.MainMenu;
import View.MasukkanKartu;
import View.PilihMenu;
import View.ValidasiPIN;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dense
 */
public class ATMMachine {
    //Attribute kodeATM diganti dari String ke Int
    private int kodeATM;
    private double cash;
    private ArrayList<Transaction> transaction;
    private DummyData data = new DummyData();

    public ATMMachine(int kodeATM, double cash, ArrayList<Transaction> transaction) {
        this.kodeATM = kodeATM;
        this.cash = cash;
        this.transaction = transaction;
    }
    
    public int getKodeATM(){
        return kodeATM;
    }
    public void setKodeATM(int kodeATM){
        this.kodeATM = kodeATM;
    }
    public double getCash(){
        return cash;
    }
    public void setCash(double cash){
        this.cash = cash;
    }
    public ArrayList<Transaction> getTransaction(){
        return transaction;
    }
    public void setTransaction(ArrayList<Transaction> transaction){
        this.transaction = transaction;
    }
    public void insertCard(ATMMachine mesin, String cardNumber){
        boolean cek = false;
        for(int i = 0; i < data.getCard().size(); i++){
            if(data.getCard().get(i).getCardNumber() == cardNumber){
                cek = true;
            }
        }
        if(cek){
            new ValidasiPIN(mesin, cardNumber);
        }else{
            JOptionPane.showMessageDialog(null, "Card Number Tidak Terdaftar!!", "Error", JOptionPane.ERROR_MESSAGE);
            new MasukkanKartu(mesin);
        }
    }
    public void validatePIN(String pin, String cardNumber, ATMMachine mesin){
        boolean cek = false;
        int card = 0;
        for(int i = 0; i < data.getCard().size(); i++){
            if((data.getCard().get(i).getCardNumber() == cardNumber) && (data.getCard().get(i).getPIN() == pin)){
                cek = true;
                card = i;
            }
        }
        if(cek){
            new MainMenu(data.getCard().get(card), mesin);
        }
    }
    public void cekSaldo(ATMCard card, ATMMachine mesin){
        double saldo = card.getBalance();
        JOptionPane.showMessageDialog(null, "Saldo Anda Saat Ini Adalah: Rp." + saldo, "Balance", JOptionPane.INFORMATION_MESSAGE);
        new MainMenu(card, mesin);
    }
    public void withdrawal(ATMCard card, ATMMachine mesin, int nominal){
        if(nominal < card.getBalance()){
            if(mesin.getCash() > nominal){
                card.setBalance((card.getBalance()-nominal));
                mesin.setCash(mesin.getCash()-nominal);
                Date now = new Date();
                Transaction tr = new Transaction(card.getCardNumber(), now);
                ArrayList<Transaction> arr = mesin.getTransaction();
                arr.add(tr);
                mesin.setTransaction(arr);
                JOptionPane.showMessageDialog(null, "Silahkan Ambil Uang Anda, Terima Kasih", "WithDrawal", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Maaf, Saldo Anda Tidak Cukup!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        new MainMenu(card, mesin);
    }
    public void transfer(ATMCard card, ATMMachine mesin, String cardNumber, int nominal){
        boolean cek = false;
        int atm = 0;
        for(int i = 0; i < data.getCard().size(); i++){
            if((data.getCard().get(i).getCardNumber() == cardNumber) && (data.getCard().get(i).getCardNumber() != card.getCardNumber())){
                cek = true;
                atm = i;
            }
        }
        if(cek){
            if(card.getBalance() > nominal){
                card.setBalance(card.getBalance()-nominal);
                data.getCard().get(atm).setBalance(data.getCard().get(atm).getBalance()+nominal);
                Date now = new Date();
                Transaction tr = new Transaction(cardNumber, now);
                ArrayList<Transaction> arr = mesin.getTransaction();
                arr.add(tr);
                mesin.setTransaction(arr);
                JOptionPane.showMessageDialog(null, "Sukses Transfer!!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Maaf, Saldo Anda Tidak Cukup!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Maaf, Card Number Tidak Ditemukan!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        new MainMenu(card, mesin);
    }
    public void ejectCard(ATMCard card, ATMMachine mesin){
        for(int i = 0; i < data.getCard().size(); i++){
            if(data.getCard().get(i).getCardNumber() == card.getCardNumber()){
                data.getCard().set(i, card);
            }
        }
        for(int i = 0; i < data.getMachine().size(); i++){
            if(data.getMachine().get(i).getKodeATM() == mesin.getKodeATM()){
                data.getMachine().set(i, mesin);
            }
        }
        JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Menggunakan ATM ini!!", "Thank You", JOptionPane.INFORMATION_MESSAGE);
        new PilihMenu(data);
    }
}
