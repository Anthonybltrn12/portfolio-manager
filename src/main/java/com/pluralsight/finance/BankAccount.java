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
        return this.balance;
    }
    // adding money to the account when a deposit is made and returning the new balance
    public double deposit(double amount){
        return amount += this.balance;
    }
    // subtracting the withdraw amount from the balnce and returning the new balance
    public double withdraw(double amount){
        return amount -= this.balance;
    }
}
