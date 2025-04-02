import java.util.Scanner;

public class QuesTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("No valid greatest factor.");
            return;
        }

        int greatestFactor = 1;
        int i = number - 1;

        while (i > 0) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
        scanner.close();
    }
}
