package EcommerceManagementSystem;
import java.util.*;

public class Customer {
    String name;
    List<Order> orders;

    Customer(String n) {
        name = n;
        orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }
}
