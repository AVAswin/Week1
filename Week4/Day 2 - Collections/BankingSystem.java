import java.util.*;

// Class to represent a withdrawal request
class WithdrawalRequest {
    int accountNumber;
    double amount;

    public WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}

public class BankingSystem {
    // Map to store AccountNumber -> Balance
    private Map<Integer, Double> accounts;

    // TreeMap to sort balances -> Set of AccountNumbers (to handle duplicate balances)
    private TreeMap<Double, Set<Integer>> balanceTree;

    // Queue to process withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        balanceTree = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(int accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
        balanceTree.computeIfAbsent(initialBalance, k -> new HashSet<>()).add(accountNumber);
    }

    // Enqueue a withdrawal request
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }

    // Process all withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request = withdrawalQueue.poll();
            int accNo = request.accountNumber;
            double amount = request.amount;

            if (accounts.containsKey(accNo)) {
                double currentBalance = accounts.get(accNo);

                if (currentBalance >= amount) {
                    // Remove old balance from balanceTree
                    removeFromBalanceTree(accNo, currentBalance);

                    // Update balance
                    double newBalance = currentBalance - amount;
                    accounts.put(accNo, newBalance);

                    // Insert new balance into balanceTree
                    balanceTree.computeIfAbsent(newBalance, k -> new HashSet<>()).add(accNo);

                    System.out.println("Withdrawal of $" + amount + " from account " + accNo + " successful. New balance: $" + newBalance);
                } else {
                    System.out.println("Withdrawal of $" + amount + " from account " + accNo + " failed. Insufficient funds.");
                }
            } else {
                System.out.println("Account " + accNo + " does not exist.");
            }
        }
    }

    // Helper function to remove an account number from balanceTree
    private void removeFromBalanceTree(int accountNumber, double balance) {
        Set<Integer> accountsAtBalance = balanceTree.get(balance);
        if (accountsAtBalance != null) {
            accountsAtBalance.remove(accountNumber);
            if (accountsAtBalance.isEmpty()) {
                balanceTree.remove(balance);
            }
        }
    }

    // Display accounts sorted by balance
    public void displayAccountsSortedByBalance() {
        System.out.println("\nAccounts sorted by balance:");
        for (Map.Entry<Double, Set<Integer>> entry : balanceTree.entrySet()) {
            double balance = entry.getKey();
            Set<Integer> accNumbers = entry.getValue();
            for (int accNo : accNumbers) {
                System.out.println("Account " + accNo + " -> Balance $" + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Adding accounts
        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);

        // Making withdrawal requests
        bank.requestWithdrawal(101, 1000);
        bank.requestWithdrawal(102, 4000); // Should fail
        bank.requestWithdrawal(103, 2000);

        // Processing withdrawals
        bank.processWithdrawals();

        // Displaying sorted accounts
        bank.displayAccountsSortedByBalance();
    }
}
