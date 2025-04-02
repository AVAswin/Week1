import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] age = new int[10]; // Fixed-size array

        System.out.println("Enter 10 ages: ");
        for (int i = 0; i < age.length; i++) {
            age[i] = scanner.nextInt(); // Storing values in the array
        }

        System.out.println("Voting eligibility results:");
        for (int i = 0; i < age.length; i++) {
            if (age[i] > 18) {
                System.out.println(age[i] + " - Eligible to vote");
            } else {
                System.out.println(age[i] + " - Not Eligible to vote");
            }
        }

        scanner.close();
    }
}
