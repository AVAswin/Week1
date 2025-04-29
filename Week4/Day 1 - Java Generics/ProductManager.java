import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public abstract String getCategory();
}

class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Books";
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Clothing";
    }
}

class Gadget extends Product {
    public Gadget(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Gadget";
    }
}

class Catalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    public void showCatalog() {
        for (T product : products) {
            System.out.println(product.getName() + " - ₹" + product.getPrice() + " [" + product.getCategory() + "]");
        }
    }
}

class DiscountUtil {
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double oldPrice = product.getPrice();
        double newPrice = oldPrice - (oldPrice * percentage / 100.0);
        product.setPrice(newPrice);
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Catalog<Book> bookCatalog = new Catalog<>();
        Catalog<Gadget> gadgetCatalog = new Catalog<>();

        Book b1 = new Book("The Alchemist", 500);
        Book b2 = new Book("DSA Made Easy", 300);

        Gadget g1 = new Gadget("Smartphone", 15000);
        Gadget g2 = new Gadget("Bluetooth Speaker", 2500);

        bookCatalog.addProduct(b1);
        bookCatalog.addProduct(b2);

        gadgetCatalog.addProduct(g1);
        gadgetCatalog.addProduct(g2);

        // Apply discount
        DiscountUtil.applyDiscount(b1, 10);
        DiscountUtil.applyDiscount(g2, 15);

        System.out.println(" Book Catalog:");
        bookCatalog.showCatalog();

        System.out.println("\n Gadget Catalog:");
        gadgetCatalog.showCatalog();
    }
}
