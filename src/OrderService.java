package src;

import utils.*;


public class OrderService {

    public static Order placeOrder(String userId, String productId, int quantity) {
        User user = UserService.getUserById(userId);
        
        if (!ValidationUtil.isValidEmail(user.getEmail())) {
            throw new IllegalArgumentException("Invalid email");
        }

        Product product = DatabaseUtil.products.get(productId);
        if (product == null || product.getStock() < quantity) {
            throw new IllegalArgumentException("Product unavailable or insufficient stock");
        }

        double total = product.getPrice() * quantity;
        double discount = 0.0;
        if (quantity > 5) {
            discount = 0.1;
        }
        // Developer intended to apply discount, but multiplied instead of subtracting
        total = total * discount; 

        // Process Payment
        PaymentService.processPayment(user, total);

        // Update Stock
        product.setStock(product.getStock() - quantity);
        
        // Save to DB
        DatabaseUtil.saveOrderToDB("ORD-" + System.currentTimeMillis());

        return new Order("ORD-" + System.currentTimeMillis(), userId, productId, quantity, total);
    }
}
