/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author dense
 */
public class Transfer_Transaction extends Transaction{
    private String destinationNumber;
    private double amount;

    public Transfer_Transaction(String transactionID, Date dateTime) {
        super(transactionID, dateTime);
    }

    public String getDestinationNumber(){
        return destinationNumber;
    }
    public void setDestinationNumber(String destinationNumber){
        this.destinationNumber = destinationNumber;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
}
