package EcommerceManagementSystem;
import java.util.*;

class Order {
    int orderId;
    Customer customer;
    List<Product> products;
    static int orderCounter = 1;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId + " placed by " + customer.name);
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.name + " ($" + product.price + ")");
        }
    }
}
