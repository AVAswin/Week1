class Product {
    private String productName;
    private int price;
    static int totalProducts = 0;

    Product(String n, int p) {
        productName = n;
        price = p;
        totalProducts++;
    }

    Product(Product p) {
        productName = p.productName;
        price = p.price;
        totalProducts++;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void calculateTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}