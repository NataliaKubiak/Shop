import shop.DisplayableProducts;
import shop.store.StoreGroceries;
import product.BaseProduct;
import product.Category;
import shop.cart.Cart;

public class MainTest {
    public static void main(String[] args) {
        BaseProduct cucumber = new BaseProduct("Cucumber", 2.50, Category.VEGETABLES);
        cucumber.setRating(3);
        BaseProduct milk = new BaseProduct("Milk", 3.79, Category.DAIRY);
        BaseProduct apple = new BaseProduct("Apple", 1.59, Category.FRUITS);
        BaseProduct beefSteak = new BaseProduct("Beef Steak", 13.70, Category.MEAT);
        BaseProduct floorCleaner = new BaseProduct("Universal Floor Cleaner", 8.29, Category.WASHING_POWDER);
        BaseProduct chips = new BaseProduct("Chips", 5.99, Category.SNACKS);
        BaseProduct pepsi = new BaseProduct("Pepsi", 3.99, Category.SODA);

        DisplayableProducts shop = new StoreGroceries();
        shop.addProductWithAmount(cucumber, 5)
                .addProductWithAmount(apple, 15)
                .addProductWithAmount(beefSteak, 7)
                .addProductWithAmount(floorCleaner, 10)
                .addProductWithAmount(chips, 20)
                .addProductWithAmount(pepsi, 8);
        shop.showFullProductsInfo();
        shop.showProductsWithAmounts();

        Cart cart1 = new Cart();
        int chipsAmount = 1;
        boolean chipsStatus = shop.sellProducts(chips, chipsAmount);
        if (chipsStatus) {
            cart1.addProductWithAmount(chips, chipsAmount)
                    .showFullProductsInfo();
        }

        cart1.addProductWithAmount(milk, 1);
        cart1.showFullProductsInfo();

        cart1.returnProduct(chips, 1);
        cart1.showProductsWithAmounts();


        cart1.makeOrder();

        System.out.println("HERE!");
        cart1.showTotalPrice();
    }
}
