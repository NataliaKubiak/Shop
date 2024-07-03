public class MainTest {
    public static void main(String[] args) {
        Product cucumber = new Product("Cucumber", 2.50, Category.VEGETABLES);
        cucumber.setRating(3);
        Product milk = new Product("Milk", 3.79, Category.DAIRY);
        Product apple = new Product("Apple", 1.59, Category.FRUITS);
        Product beefSteak = new Product("Beef Steak", 13.70, Category.MEAT);
        Product floorCleaner = new Product("Universal Floor Cleaner", 8.29, Category.CLEANINGPRODUCTS);
        Product chips = new Product("Chips", 5.99, Category.SNACKS);
        Product pepsi = new Product("Pepsi", 3.99, Category.BEVERAGES);

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
        cart1.showFullProductsInfo();

        cart1.returnProduct(milk, -2);
        cart1.showProductsWithAmounts();
        cart1.makeOrder();

        System.out.println("HERE!");
        cart1.showTotalPrice();
    }
}
