// Base class
package BankAccountTypes;

class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accNum, double bal) {
        this.accountNumber = accNum;
        this.balance = bal;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass - SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accNum, double bal, double rate) {
        super(accNum, bal);
        this.interestRate = rate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass - CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(int accNum, double bal, double limit) {
        super(accNum, bal);
        this.withdrawalLimit = limit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass - FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    public FixedDepositAccount(int accNum, double bal, int period) {
        super(accNum, bal);
        this.maturityPeriod = period;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 1500.0, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 2000.0, 500.0);
        FixedDepositAccount fda = new FixedDepositAccount(103, 5000.0, 12);

        System.out.println("---- Savings Account ----");
        sa.displayDetails();
        sa.displayAccountType();

        System.out.println("\n---- Checking Account ----");
        ca.displayDetails();
        ca.displayAccountType();

        System.out.println("\n---- Fixed Deposit Account ----");
        fda.displayDetails();
        fda.displayAccountType();
    }
}
