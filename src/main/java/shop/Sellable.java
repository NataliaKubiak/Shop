package shop;

import product.BaseProduct;

public interface Sellable {
    Sellable addProductWithAmount(BaseProduct product, int amount);
    Sellable deleteProduct(BaseProduct product);
    boolean sellProducts(BaseProduct product, int amount);
    void cancelPurchase(BaseProduct product, int amount);
}
