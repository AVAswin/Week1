import java.util.Scanner;

public class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter three decimal numbers (a, b, c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Performing double operations
        double result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;  // Multiplication (*) is evaluated before addition (+)
        double result3 = c + a / b;  // Division (/) is evaluated before addition (+)
        double result4 = a % b + c;  // Modulus (%) is evaluated before addition (+)

        // Printing results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4 + ".");

        scanner.close();
    }
}

