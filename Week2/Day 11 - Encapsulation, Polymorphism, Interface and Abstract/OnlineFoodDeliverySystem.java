// Interface for applying discounts
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

// Abstract class for common food item logic
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discount = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method 
    public abstract double calculateTotalPrice();

    // Concrete method 
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price: ₹" + calculateTotalPrice());
        System.out.println();
    }

    // Encapsulation: Getter methods
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getDiscount() { return discount; }

    // Interface methods
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            this.discount = percent;
        }
    }

    public String getDiscountDetails() {
        return "Applied Discount: " + discount + "%";
    }

    // Protected method for subclasses to access base total
    protected double getBaseTotal() {
        return price * quantity * (1 - discount / 100);
    }
}

// Veg item class
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // No extra charge
        return getBaseTotal();
    }
}

// Non-veg item class
class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Add 5% non-veg charge
        return getBaseTotal() * 1.05;
    }
}

// Driver class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Polymorphic handling
        FoodItem[] order = new FoodItem[] {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1),
            new VegItem("Veg Burger", 80, 3),
            new NonVegItem("Mutton Curry", 300, 1)
        };

        // Apply discount and print details
        for (FoodItem item : order) {
            item.applyDiscount(10); // Apply 10% discount
            item.getItemDetails();
        }
    }
}

