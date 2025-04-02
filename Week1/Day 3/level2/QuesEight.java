import java.util.Scanner;

public class QuesEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                // Ensure marks are non-negative
                do {
                    System.out.print(subject + " Marks (out of 100): ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Enter marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade based on percentage
            if (percentage[i] >= 90) {
                grade[i] = "A+";
            } else if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else {
                grade[i] = "Fail";
            }
        }

        // Display results
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10s\n", 
                              marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        scanner.close();
    }
}
