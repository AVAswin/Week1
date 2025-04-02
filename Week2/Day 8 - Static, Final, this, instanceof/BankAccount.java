class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "XYZ Bank";
    private static int totalAccounts = 0;
    
    // Final variable to ensure it cannot be changed once assigned
    private final int accountNumber;
    private String accountHolderName;
    private double balance;
    
    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; // Increment total accounts when a new account is created
    }
    
    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // Using instanceof to verify the object type
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid Account Object");
        }
    }
    
    // Getter for bank name (optional, if needed externally)
    public static String getBankName() {
        return bankName;
    }
}
