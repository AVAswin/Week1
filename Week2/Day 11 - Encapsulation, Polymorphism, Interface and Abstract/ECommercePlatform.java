// Taxable interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (Encapsulation)
    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for discount
    public abstract double calculateDiscount();
}

// Electronics class
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

// Clothing class
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "5% VAT on Clothing";
    }
}

// Groceries class (no tax)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

class PriceCalculator {
    public static void printFinalPrice(Product p) {
        double basePrice = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0;

        if (p instanceof Taxable) {
            tax = ((Taxable) p).calculateTax();
        }

        double finalPrice = basePrice + tax - discount;

        System.out.println("Product: " + p.getName());
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Discount: -$" + discount);
        System.out.println("Tax: +$" + tax);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("---------------------------");
    }
}

public class ECommercePlatform {    
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(101, "Laptop", 1000.0),
            new Clothing(102, "Jeans", 50.0),
            new Groceries(103, "Rice", 20.0)
        };

        for (Product p : products) {
            PriceCalculator.printFinalPrice(p);
        }
    }
}

