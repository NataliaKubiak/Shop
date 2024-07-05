package shop.store;

import product.BaseProduct;
import shop.DisplayableProducts;

//тут могла бы быть имплементация продажи штук для дома типо Икеи
public class StoreHomeStuff implements DisplayableProducts {
    @Override
    public StoreHomeStuff addProductWithAmount(BaseProduct product, int amount) {
        return null;
    }

    @Override
    public StoreHomeStuff deleteProduct(BaseProduct product) {
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
