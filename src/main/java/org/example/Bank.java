package org.example;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class Bank
{
    private HashMap<String,User>users;

    public Bank(){
        this.users = new HashMap<>();
    }
    //create user
    public void createUser(String userId, String name){
        Account new_account = new Account();
        User user = new User(userId,name,new_account);
        users.put(userId, user);
        System.out.println("user created successfully");
    }
    // deposit
    // withdraw
    // display balnce
    // display transactions


    public static void main(String[] args )
    {
        Bank bank = new Bank();
        bank.createUser("1","ww");

    }
}
