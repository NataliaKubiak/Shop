public interface Sellable {
    Sellable addProductWithAmount(Product product, int amount);
    Sellable deleteProduct(Product product);
    boolean sellProducts(Product product, int amount);
    void cancelPurchase(Product product, int amount);
}
