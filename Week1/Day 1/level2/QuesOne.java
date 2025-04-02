import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Printing the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                           " of two numbers " + number1 + " and " + number2 + ".");

        scanner.close();
    }
}

