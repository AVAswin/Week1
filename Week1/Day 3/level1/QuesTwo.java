import java.util.Scanner;

public class QuesTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is Positive");
                // Check even or odd for positive numbers
                if (numbers[i] % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        System.out.println("\nComparison of First and Last Elements:");
        if (numbers[0] > numbers[4]) {
            System.out.println(numbers[0] + " (First) is greater than " + numbers[4] + " (Last)");
        } else if (numbers[0] < numbers[4]) {
            System.out.println(numbers[0] + " (First) is less than " + numbers[4] + " (Last)");
        } else {
            System.out.println(numbers[0] + " (First) is equal to " + numbers[4] + " (Last)");
        }

        scanner.close();
    }
}
