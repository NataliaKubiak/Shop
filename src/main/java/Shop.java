import java.util.HashMap;
import java.util.Map;

public class Shop implements Showable, Filterable{

    //Product and Integer = quantity
    private Map<Product, Integer> allProducts = new HashMap<>();

    public Shop addProductWithAmount(Product product, int amount) {
        allProducts.put(product, amount);
        System.out.println("[INFO] Product '" + product.getName() + "' (" + amount + " pcs) was ADDED to Shop Warehouse");
        return this;
    }

    public Shop addOneProduct(Product product) {
        addProductWithAmount(product, 1);
        return this;
    }

    public Shop deleteProduct(Product product) {
        if (allProducts.containsKey(product)) {
            allProducts.remove(product);
            System.out.println("[INFO] Product '" + product.getName() + "' was REMOVED from Shop Warehouse");
        } else {
            System.out.println("[INFO] Product '" + product.getName() + "' was NOT REMOVED because it was not found in Shop Warehouse");
        }
        return this;
    }

    @Override
    public void showProductsWithAmounts() {
        System.out.println("Shop has following items:");
        allProducts.forEach((key, value) -> System.out.println(key.getName() + ": " + value + " pcs"));
    }

    @Override
    public void showFullProductsInfo() {
        System.out.println("Full Info about available Products in the Shop:");
        allProducts.forEach((key, value) -> System.out.printf("%s (available %d psc)\n- Price: %.2f,\n- Rating: %d,\n- Category: %s\n",
                key.getName(), value, key.getPrice(), key.getRating(), key.getCategory()));
    }

    @Override
    public void filterByPrice() {

    }

    @Override
    public void filterByRating() {

    }
}
