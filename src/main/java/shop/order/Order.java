package shop.order;

import product.BaseProduct;
import shop.Showable;

import java.util.HashMap;
import java.util.Map;

public class Order implements Showable {

    private Map<BaseProduct, Integer> orderProducts = new HashMap<>();
    private double totalPrice;
    private static int ID = 0;
    private Status status;

    public Order(Map<BaseProduct, Integer> orderProducts, double totalPrice) {
        this.orderProducts = orderProducts;
        this.totalPrice = totalPrice;
        status = Status.DELIVERING;
    }

    public static int getID() {
        return ID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void showProductsWithAmounts() {

    }

    @Override
    public void showFullProductsInfo() {

    }
}
