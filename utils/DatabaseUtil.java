package utils;

import src.*;

import java.util.HashMap;
import java.util.Map;

public class DatabaseUtil {
    public static Map<String, User> users = new HashMap<>();
    public static Map<String, Product> products = new HashMap<>();

    public static void initData() {
        users.put("U1", new User("U1", "Alice", "alice@example.com", 1000.0, "USER"));
        users.put("U2", new User("U2", "Bob", "bob@example.com", 500.0, "ADMIN"));
        
        products.put("P1", new Product("P1", "Laptop", 800.0, 10));
        products.put("P2", new Product("P2", "Mouse", 20.0, 50));
    }

    public static void saveOrderToDB(String orderId) {
        System.out.println("Opening DB Connection...");
        // Simulating a connection that is never closed in a finally block
        // Connection conn = DriverManager.getConnection(...);
        System.out.println("Saving order: " + orderId);
        // conn.close() is missing
    }
}
