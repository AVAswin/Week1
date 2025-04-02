import java.util.Scanner;

public class QuesFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) { 
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                break; // Stop taking input if 0 or negative number is entered
            }

            if (index == 10) {
                break; // Stop if the array reaches its maximum size
            }

            numbers[index] = num;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nTotal sum: " + total);

        scanner.close();
    }
}


