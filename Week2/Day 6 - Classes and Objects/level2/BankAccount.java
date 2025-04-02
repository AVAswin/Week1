class BankAccount {
    String accHolder;
    String accNo;
    int balance;

    BankAccount(String h, String a, int b) {
        accHolder = h;
        accNo = a;
        balance = b;
    }

    void getBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(int money) {
        balance += money;
        System.out.println(money + " deposited");
    }

    void withdraw(int money) {
        if(money > balance) {
            System.out.println("Insufficient Balance...");
        }
        else {
            balance -= money;
            System.out.println(money + " withdrawed");
        }
    }
}
