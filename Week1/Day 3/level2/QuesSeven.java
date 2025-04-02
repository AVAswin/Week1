import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number]; // Array to store weight status

        // Input height and weight for each person
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            
            // Ensure height is positive
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            
            // Ensure weight is positive
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                              personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
