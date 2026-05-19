package com.pluralsight.finance;

import com.pluralsight.IValuable;

public class BankAccount implements IValuable {
    protected String name;
    protected String accountNumber;
    protected double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }

    public double deposit(){
        return 0;
    }

    public double withdraw(){
        return 0;
    }
}
