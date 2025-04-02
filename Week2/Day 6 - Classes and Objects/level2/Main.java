import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student class
        int[] marks = {56, 94, 56};
        Student s1 = new Student("Aswin", "RA2111033010093", marks.length, marks);
        s1.displayDetails();

        // BankAccount class
        System.out.println("-----------------------------");
        BankAccount ba1 = new BankAccount("Austin", "123456", 55000);
        ba1.withdraw(5000);
        ba1.deposit(10000);
        ba1.getBalance();
        ba1.withdraw(100000);

        // Palindrome Checker class
        System.out.println("-----------------------------");
        PalindromeChecker p1 = new PalindromeChecker("racecar");
        p1.isPalindrome();
        PalindromeChecker p2 = new PalindromeChecker("racer");
        p2.isPalindrome();

        // MovieTicket class
        System.out.println("-----------------------------");
        MovieTicket m1 = new MovieTicket("Anjaan", "25", 150);
        m1.displayDetails();

        // CartItem class
        System.out.println("-----------------------------");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 1.5, 3);
        cart.addItem("Banana", 0.5, 5);
        cart.displayCart();
        
        cart.removeItem("Apple");
        cart.displayCart();

        cart.addItem("Banana", 0.5, 5); // adding item that already exists in the cart
        cart.displayCart();



        scanner.close();
    }
}
