package product;

public class FoodProduct extends BaseProduct {
    private String expirationDate;
    private boolean isVegan;

    public FoodProduct(String name, double price, Category category, String expirationDate, boolean isVegan) {
        super(name, price, category);
        this.expirationDate = expirationDate;
        this.isVegan = isVegan;
    }
}
