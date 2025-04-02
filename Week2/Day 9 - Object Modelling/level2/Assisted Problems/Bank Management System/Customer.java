import java.util.ArrayList;
import java.util.List;

// Customer class (Has multiple accounts, Associated with a Bank)
class Customer {
    private String name;
    private List<Account> accounts; // Association: A Customer has multiple Accounts

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nCustomer: " + name + " - Account Details:");
        for (Account account : accounts) {
            System.out.println("- " + account.getAccountType() + " | Balance: $" + account.getBalance());
        }
    }
}
