import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // Create Bank objects
        Bank bank1 = new Bank("ABC Bank");
        Bank bank2 = new Bank("XYZ Bank");

        // Create Customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts in different banks
        bank1.openAccount(customer1, "Savings", 5000.0);
        bank1.openAccount(customer2, "Checking", 3000.0);
        bank2.openAccount(customer1, "Business", 10000.0);

        // Display customer details
        customer1.viewBalance();
        customer2.viewBalance();

        // Display bank details
        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}
