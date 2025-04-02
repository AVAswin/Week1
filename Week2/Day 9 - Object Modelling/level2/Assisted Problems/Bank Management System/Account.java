// Account class (Each Account belongs to a Bank)
class Account {
    private Bank bank;
    private String accountType;
    private double balance;

    public Account(Bank bank, String accountType, double balance) {
        this.bank = bank;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}
