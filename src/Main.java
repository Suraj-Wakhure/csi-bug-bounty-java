package src;

import utils.*;


public class Main {
    public static void main(String[] args) {
        // Initialize mock data
        DatabaseUtil.initData();

        System.out.println("--- Starting E-Commerce System ---");
        
        User user = DatabaseUtil.users.get("U1");
        System.out.println("User: " + user);

        try {
            Order order = OrderService.placeOrder("U1", "P1", 2);
            System.out.println("Order placed successfully: " + order.getId());
        } catch (Exception e) {
            System.out.println("Failed to place order: " + e.getMessage());
        }
    }
}
