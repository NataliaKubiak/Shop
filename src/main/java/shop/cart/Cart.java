package shop.cart;

import product.BaseProduct;
import shop.Showable;

import java.util.HashMap;
import java.util.Map;

public class Cart implements Showable {
    private Map<BaseProduct, Integer> cartProducts = new HashMap<>();
    private double totalPrice;

    public Cart addProductWithAmount(BaseProduct product, int amount) {
        if (cartProducts.containsKey(product)) {
            int currentAmount = cartProducts.get(product);
            cartProducts.put(product, currentAmount + amount);
            System.out.println("[INFO][CART] Product '" + product.getName() + "' was ADDED to shop.purchase.Cart. Current amount: " + (currentAmount + amount) + " pcs");
        } else {
            cartProducts.put(product, amount);
            System.out.println("[INFO][CART] Product '" + product.getName() + "' was ADDED to shop.purchase.Cart. Current amount: " + amount + " pcs");
        }
        calculateTotalPrice();
        return this;
    }

    public boolean returnProduct(BaseProduct product, int amount) {
        if (amount <= 0) {
            System.out.println("[INFO][CART] '" + product.getName() + "' was NOT REMOVED from your shop.purchase.Cart. Amount can't be negative or 0");
            return false;
        }
        if (cartProducts.containsKey(product)) {
            int availableAmount = cartProducts.get(product);
            if (availableAmount >= amount) {
                int updatedAmount = availableAmount - amount;

                if (updatedAmount == 0) {
                    cartProducts.remove(product);
                    System.out.println("[INFO][CART] Product '" + product.getName() + "' was REMOVED from your shop.purchase.Cart.");
                } else {
                    cartProducts.put(product, updatedAmount);
                    System.out.println("[INFO][CART] Product '" + product.getName() + "' was partly REMOVED from your shop.purchase.Cart. Current amount: " + updatedAmount + " pcs");
                }
                calculateTotalPrice();
                return true;
            } else {
                System.out.println("[INFO][CART] Amount of '" + product.getName() + "' is too big. Available amount: " + availableAmount + " pcs. Try to remove less from the cart.");
                return false;
            }
        } else {
            System.out.println("[INFO][CART] Product '" + product.getName() + "' is not in the shop.purchase.Cart");
            return false;
        }
    }

    private void calculateTotalPrice() {
        totalPrice = 0;
        for (Map.Entry<BaseProduct, Integer> entry : cartProducts.entrySet()) {
            BaseProduct product = entry.getKey();
            int quantity = entry.getValue();
            double productPrice = product.getPrice();

            totalPrice += productPrice * quantity;
        }
    }

    //when we call this method shop.order.Order object creates
    public void makeOrder() {
        cartProducts.clear();
        totalPrice = 0;
        System.out.println("THANK YOU VERY MUCH FOR YOUR ORDER! We will miss you ^_^");
    }

    public void showTotalPrice() {
        calculateTotalPrice();
        System.out.printf("Total price: %.2f\n", totalPrice);
    }

    @Override
    public void showProductsWithAmounts() {
        if (cartProducts.isEmpty()) {
            System.out.println("shop.purchase.Cart is empty");
        } else {
            System.out.println("shop.purchase.Cart has following items:");
            cartProducts.forEach((key, value) -> System.out.println(key.getName() + ": " + value + " pcs"));
            showTotalPrice();
        }
    }

    @Override
    public void showFullProductsInfo() {
        if (cartProducts.isEmpty()) {
            System.out.println("shop.purchase.Cart is empty");
        } else {
            System.out.println("Full Info about your shop.purchase.Cart:");
            cartProducts.forEach((key, value) -> System.out.printf("%s (%d psc)\n- Price per one: %.2f,\n- Rating: %d,\n- product.Category: %s\n",
                    key.getName(), value, key.getPrice(), key.getRating(), key.getCategory()));
            showTotalPrice();
        }
    }
}
