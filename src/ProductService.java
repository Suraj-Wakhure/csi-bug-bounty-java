package src;

import utils.*;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public static Product getLastProduct() {
        List<Product> productList = new ArrayList<>(DatabaseUtil.products.values());
        return productList.get(productList.size()); 
    }

    public static void removeOutOfStockProducts() {
        List<Product> productList = new ArrayList<>(DatabaseUtil.products.values());
        for (Product p : productList) {
            if (p.getStock() == 0) {
                productList.remove(p); // Modifying list while iterating
            }
        }
    }
}
