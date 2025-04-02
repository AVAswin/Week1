import java.util.Scanner;

public class QuesFivteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.println("Enter Price: ");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println("Total price: " + price * (double)quantity);

        sc.close(); // Closing scanner
    }
}
