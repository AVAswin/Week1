// Interface for loan operations
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract class for common account properties and methods
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: Getters
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}

// SavingsAccount with 4% interest
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Savings Interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan() {
        System.out.println("SavingsAccount: Applying for personal loan...");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 5000;
    }
}

// CurrentAccount with 1% interest
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = getBalance() * 0.01;
        System.out.println("Current Interest: " + interest);
        return interest;
    }

    @Override
    public void applyForLoan() {
        System.out.println("CurrentAccount: Applying for business loan...");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

// Driver class
public class BankingSystem {
    public static void main(String[] args) {
        // Polymorphic references
        BankAccount acc1 = new SavingsAccount("S123", "Alice", 6000);
        BankAccount acc2 = new CurrentAccount("C456", "Bob", 12000);

        acc1.deposit(1000);
        acc1.calculateInterest();
        acc1.applyForLoan();
        System.out.println("Eligible for Loan? " + (acc1.calculateLoanEligibility() ? "Yes" : "No"));
        System.out.println();

        acc2.withdraw(2000);
        acc2.calculateInterest();
        acc2.applyForLoan();
        System.out.println("Eligible for Loan? " + (acc2.calculateLoanEligibility() ? "Yes" : "No"));
    }
}
