
//тут могла бы быть имплементация продажи штук для дома типо Икеи
public class StoreHomeStuff implements DisplayableProducts {
    @Override
    public StoreHomeStuff addProductWithAmount(Product product, int amount) {
        return null;
    }

    @Override
    public StoreHomeStuff deleteProduct(Product product) {
        return null;
    }

    @Override
    public boolean sellProducts(Product product, int amount) {
        return false;
    }

    @Override
    public void cancelPurchase(Product product, int amount) {

    }

    @Override
    public void showProductsWithAmounts() {

    }

    @Override
    public void showFullProductsInfo() {

    }
}
