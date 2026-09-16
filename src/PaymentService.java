package src;

import utils.*;


public class PaymentService {

    public static void processPayment(User user, double amount) {
        // Using double for currency leads to precision loss
        if (user.getBalance() >= amount) {
            // Missing synchronization. Two threads can pass the check simultaneously
            // and both deduct the amount, leading to negative balance.
            try { Thread.sleep(100); } catch (InterruptedException e) {} // Simulate network delay
            user.setBalance(user.getBalance() - amount);
            System.out.println("Payment successful. New balance: " + user.getBalance());
        } else {
            throw new RuntimeException("Insufficient funds");
        }
    }
}
