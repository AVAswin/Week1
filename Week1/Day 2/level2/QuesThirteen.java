import java.util.Scanner;

public class QuesThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            return;
        }

        int counter = 99; // Start from the largest possible multiple below 100

        while (counter > 0) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }

        scanner.close();
    }
}
