package org.example;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private List<String> transactions;
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



}
