import java.util.Scanner;

public class QuesNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("No valid greatest factor.");
            return;
        }

        int greatestFactor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
        scanner.close();
    }
}
