class Product {
    // Static variable shared by all products
    private static double discount = 10.0; // Default discount percentage

    // Final variable (Product ID cannot be changed after assignment)
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' keyword
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
        System.out.println("-------------------------------------");
    }

    // Method to calculate final price after discount
    public double calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }

    // Method to display product details (using instanceof)
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Original Price: $" + price);
            System.out.println("Discounted Price: $" + calculateDiscountedPrice());
            System.out.println("Quantity: " + quantity);
            System.out.println("-------------------------");
        }
    }

}

