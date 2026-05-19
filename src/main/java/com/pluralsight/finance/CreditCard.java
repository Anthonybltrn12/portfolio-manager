package com.pluralsight.finance;

import com.pluralsight.IValuable;

public class CreditCard implements IValuable {

    protected String name;
    protected String accountNumber;
    protected double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //overriding the method from the interface to return the balance on the credit card
    @Override
    public double getValue() {
        return -this.balance;
    }
    //creating a method and a variable to alter the balcne when the card is charged
    public void charge(double amount){
        balance -= amount;
    }
    //creating a method to alter the balance when the card makes payment
    public void pay(double amount){
        balance += amount;

    }
}
