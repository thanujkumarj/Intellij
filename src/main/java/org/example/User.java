package org.example;

public class User {
    private final String userId;
    private String name;
    private final Account account;

    public User(String userId, String name, Account account){
        this.name = name;
        this.userId = userId;
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }
}
