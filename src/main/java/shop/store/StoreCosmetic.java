package shop.store;

import product.BaseProduct;
import shop.DisplayableProducts;

//тут могла бы быть имплементация продажи косметических товаров
public class StoreCosmetic implements DisplayableProducts {

    @Override
    public StoreCosmetic addProductWithAmount(BaseProduct product, int amount) {
        return null;
    }

    @Override
    public StoreCosmetic deleteProduct(BaseProduct product) {
        return null;
    }

    @Override
    public boolean sellProducts(BaseProduct product, int amount) {
        return false;
    }

    @Override
    public void cancelPurchase(BaseProduct product, int amount) {

    }

    @Override
    public void showProductsWithAmounts() {

    }

    @Override
    public void showFullProductsInfo() {

    }
}
