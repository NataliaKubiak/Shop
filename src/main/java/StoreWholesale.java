
//тут могла бы быть имплементация продажи товаров оптом
public class StoreWholesale implements Sellable{

    @Override
    public StoreWholesale addProductWithAmount(Product product, int amount) {
        return null;
    }

    @Override
    public StoreWholesale deleteProduct(Product product) {
        return null;
    }

    @Override
    public boolean sellProducts(Product product, int amount) {
        return false;
    }

    @Override
    public void cancelPurchase(Product product, int amount) {

    }
}
