package com.pluralsight;
import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Portfolio;


public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        IValuable account2 = new BankAccount("Gary", "456", 1500);

        Portfolio myPortfolio = new Portfolio("Anthony","Ant");
// try to deposit money into both accounts
        account1.deposit(100);
        System.out.println(account1.getValue());

        myPortfolio.addAssets(new House("ant house",250000,2020,2500,4));
        myPortfolio.addAssets((new Gold("grillz",5000,1.3)));

        System.out.println(myPortfolio.getValue());
        System.out.println(myPortfolio.getMostValuable().getValue());
        System.out.println(myPortfolio.getLeastValuable().getValue());
    }
}
