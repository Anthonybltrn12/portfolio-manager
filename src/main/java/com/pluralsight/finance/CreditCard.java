package com.pluralsight;

public class CreditCard implements IValuable{

    protected String name;
    protected String accountNumber;
    protected double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }

    public double charge(){
        return 0;
    }

    public double pay(){
        return 0;
    }
}
