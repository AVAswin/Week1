import java.util.Scanner;

public class QuesSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        int noOfHandshakes = (number * (number - 1)) / 2;

        System.out.println("Total handshakes: " + noOfHandshakes);

        sc.close(); // Closing scanner
    }
}

