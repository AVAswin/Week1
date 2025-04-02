package EcommerceManagementSystem;

public class Main {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Product laptop = new Product("Laptop", 1200.0);
        Product phone = new Product("Smartphone", 800.0);
        Product headphones = new Product("Headphones", 150.0);

        Order order1 = new Order(alice);
        order1.addProduct(laptop);
        order1.addProduct(headphones);
        alice.placeOrder(order1);

        Order order2 = new Order(bob);
        order2.addProduct(phone);
        bob.placeOrder(order2);

        order1.displayOrder();
        order2.displayOrder();
    }
}
