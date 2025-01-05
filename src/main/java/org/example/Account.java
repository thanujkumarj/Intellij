package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private final List<String> transactions;
    public Account(){
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance+= amount;
            transactions.add("Deposited : $"+ amount);
        }
        else{
            System.out.println(" Invalid deposit amount ");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance-= amount;
            transactions.add("withdrawn : $"+ amount);
        }
        else{
            System.out.println("Invalid amount or Insufficient balance");
        }
    }

}
