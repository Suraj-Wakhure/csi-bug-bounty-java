package src;

import utils.*;

public class User {
    private String id;
    private String name;
    private String email;
    private double balance;
    private String role;

    public User(String id, String name, String email, double balance, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.role = role;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User: " + this.toString(); 
    }
}
