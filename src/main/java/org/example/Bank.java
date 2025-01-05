package org.example;

import java.util.HashMap;
import java.util.Scanner;

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
    public void deposit(String userId, double amount) {
        User user = users.get(userId);
        if (user != null) {
            user.getAccount().deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("User not found.");
        }
    }

    public void withdraw(String userId, double amount) {
        User user = users.get(userId);
        if (user != null) {
            user.getAccount().withdraw(amount);
        } else {
            System.out.println("User not found.");
        }
    }

    public void displayBalance(String userId) {
        User user = users.get(userId);
        if (user != null) {
            System.out.println("Balance: $" + user.getAccount().getBalance());
        } else {
            System.out.println("User not found.");
        }
    }

    public void displayTransactions(String userId) {
        User user = users.get(userId);
        if (user != null) {
            System.out.println("Transaction History:");
            for (String transaction : user.getAccount().getTransactions()) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("User not found.");
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create User");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter user ID: ");
                    String userId = scanner.next();
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    bank.createUser(userId, name);
                }
                case 2 -> {
                    System.out.print("Enter user ID: ");
                    String userId = scanner.next();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    bank.deposit(userId, amount);
                }
                case 3 -> {
                    System.out.print("Enter user ID: ");
                    String userId = scanner.next();
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    bank.withdraw(userId, amount);
                }
                case 4 -> {
                    System.out.print("Enter user ID: ");
                    String userId = scanner.next();
                    bank.displayBalance(userId);
                }
                case 5 -> {
                    System.out.print("Enter user ID: ");
                    String userId = scanner.next();
                    bank.displayTransactions(userId);
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

}
