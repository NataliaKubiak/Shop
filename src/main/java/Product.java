import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private int rating;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be negative or 0");
        } else {
            this.price = price;
        }
        this.category = category;
    }

    public void setRating(int rating) {
        if (rating <= 0 || rating > 5) {
            System.out.println("Rating was not applied. Rating can be from 1 to 5. Please try again");
        } else {
            this.rating = rating;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return Double.compare(getPrice(), product.getPrice()) == 0 && getRating() == product.getRating() && Objects.equals(getName(), product.getName()) && getCategory() == product.getCategory();
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + Double.hashCode(getPrice());
        result = 31 * result + getRating();
        result = 31 * result + Objects.hashCode(getCategory());
        return result;
    }
}
