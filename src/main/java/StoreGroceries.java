import java.util.HashMap;
import java.util.Map;

public class StoreGroceries implements DisplayableProducts {

    //Product and Integer = quantity
    private Map<Product, Integer> allProducts = new HashMap<>();

    @Override
    public StoreGroceries addProductWithAmount(Product product, int amount) {
        allProducts.put(product, amount);
        System.out.println("[INFO][SHOP] Product '" + product.getName() + "' (" + amount + " pcs) was ADDED to Shop Warehouse");
        return this;
    }

    @Override
    public StoreGroceries deleteProduct(Product product) {
        if (allProducts.containsKey(product)) {
            allProducts.remove(product);
            System.out.println("[INFO][SHOP] Product '" + product.getName() + "' was REMOVED from Shop Warehouse");
        } else {
            System.out.println("[INFO][SHOP] Product '" + product.getName() + "' was NOT REMOVED because it was not found in Shop Warehouse");
        }
        return this;
    }

    @Override
    public boolean sellProducts(Product product, int amount) {
        if (amount <= 0) {
            System.out.println("[INFO][SHOP] Amount for '" + product.getName() + "' can't be negative or 0");
            return false;
        }
        if (allProducts.containsKey(product)) {
            int availableAmount = allProducts.get(product);
            if (availableAmount >= amount) {
                int updatedAmount = availableAmount - amount;
                allProducts.put(product, updatedAmount);
                System.out.println("[INFO][SHOP] Product '" + product.getName() + "' left the Shop. Available amount: " + updatedAmount);
                return true;
            } else {
                System.out.println("[INFO][SHOP] Amount of '" + product.getName() + "' is too big. Available amount: " + availableAmount + " pcs. Try to buy less.");
                return false;
            }
        } else {
            System.out.println("[INFO][SHOP] Product '" + product.getName() + "' is not in the Shop");
            return false;
        }
    }

    @Override
    public void cancelPurchase(Product product, int amount) {
        int availableAmount = allProducts.get(product);
        allProducts.put(product, availableAmount + amount);
        System.out.println("[INFO][SHOP] Purchase of '" + product.getName() + "' (" + amount + " pcs) was CANCELLED. Now Available amount in the shop: " + (availableAmount + amount) + " pcs");
    }

    @Override
    public void showProductsWithAmounts() {
        System.out.println("Shop has following items:");
        allProducts.forEach((key, value) -> System.out.println("* " + key.getName() + ": " + value + " pcs"));
    }

    @Override
    public void showFullProductsInfo() {
        System.out.println("Full Info about available Products in the Shop:");
        allProducts.forEach((key, value) -> System.out.printf("%s (available %d pcs)\n- Price: %.2f,\n- Rating: %d,\n- Category: %s\n",
                key.getName(), value, key.getPrice(), key.getRating(), key.getCategory()));
    }
}
