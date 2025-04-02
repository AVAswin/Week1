import java.util.Scanner;

public class QuesEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        for (int i = 100; i > 0; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
