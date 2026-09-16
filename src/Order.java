package src;

import utils.*;

public class Order {
    private String id;
    private String userId;
    private String productId;
    private int quantity;
    private double totalAmount;

    public Order(String id, String userId, String productId, int quantity, double totalAmount) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }

    public String getId() { return id; }
    public double getTotalAmount() { return totalAmount; }
}
