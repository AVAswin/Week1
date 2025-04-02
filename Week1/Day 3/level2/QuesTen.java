import java.util.Scanner;

public class QuesTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        // Handle negative numbers by taking absolute value
        number = Math.abs(number);

        // Step 2: Create a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // Step 3: Extract digits and count their frequency
        while (number > 0) {
            int digit = (int) (number % 10); // Get the last digit
            frequency[digit]++; // Increment the frequency of this digit
            number /= 10; // Remove the last digit
        }

        // Step 4: Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        scanner.close();
    }
}
