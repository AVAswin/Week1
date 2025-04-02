import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int power = scanner.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
            return;
        }

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(result);

        scanner.close();
    }
}
