public class Main {
    public static void main(String[] args) {
        Product cucumber = new Product("Cucumber", 2.50, Category.VEGETABLES);
        cucumber.setRating(3);
        Product milk = new Product("Milk", 3.79, Category.DAIRY);
        Product apple = new Product("Apple", 1.59, Category.FRUITS);
        Product beefSteak = new Product("Beef Steak", 13.70, Category.MEAT);
        Product floorCleaner = new Product("Universal Floor Cleaner", 8.29, Category.CLEANINGPRODUCTS);
        Product chips = new Product("Chips", 5.99, Category.SNACKS);
        Product pepsi = new Product("Pepsi", 3.99, Category.BEVERAGES);

        Shop walmart = new Shop();
        walmart.addProductWithAmount(cucumber, 5)
                .addOneProduct(milk)
                .addProductWithAmount(apple, 15)
                .addProductWithAmount(beefSteak, 7)
                .deleteProduct(milk)
                .deleteProduct(pepsi)
                .showFullProductsInfo();


    }
}
