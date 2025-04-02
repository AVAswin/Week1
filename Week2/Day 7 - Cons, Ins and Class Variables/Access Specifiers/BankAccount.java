class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private int balance;

    BankAccount(String s1, String s2, int b) {
        accountNumber = s1;
        accountHolder = s2;
        balance = b;
    }

    public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    public void setBalance(int b) {
        balance = b;
        System.out.println("Balance set to " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String s1, String s2, int b) {
        super(s1, s2, b);
    }
}
