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
public class Account {
    private String accNumber;
    private String name;
    private String address;
    double balance;

    public Account(String accNumber, String name, String address, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public String getAccNumber(){
        return accNumber;
    }
    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
