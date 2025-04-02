import java.util.ArrayList;
import java.util.List;

// Bank class (Associates with Customers)
class Bank {
    private String bankName;
    private List<Customer> customers; // Association: A Bank has multiple Customers

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Open a new account for a customer
    public void openAccount(Customer customer, String accountType, double balance) {
        Account newAccount = new Account(this, accountType, balance); // Association
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("New account opened for " + customer.getName() + " in " + bankName);
    }

    // Display all customers
    public void displayCustomers() {
        System.out.println("\nBank: " + bankName + " - Customers:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}
