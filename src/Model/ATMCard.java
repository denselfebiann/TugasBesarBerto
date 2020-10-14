/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author dense
 */
public class ATMCard extends Account{
    private String cardNumber;
    private String PIN;

    public ATMCard(String accNumber, String name, String address, double balance, String cardNumber, String PIN) {
        super(accNumber, name, address, balance);
        this.PIN = PIN;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getPIN(){
        return PIN;
    }
    public void setPIN(String PIN){
        this.PIN = PIN;
    }
    
}
