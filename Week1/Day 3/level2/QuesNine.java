import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[n][3];

        // 2D array to store percentage and grade (as String)
        double[][] resultData = new double[n][1];  // Stores percentage
        String[] grades = new String[n];           // Stores grades

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                // Ensure marks are non-negative and within 0-100
                do {
                    System.out.print(subject + " Marks (out of 100): ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid input! Enter marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            resultData[i][0] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade based on percentage
            if (resultData[i][0] >= 90) {
                grades[i] = "A+";
            } else if (resultData[i][0] >= 80) {
                grades[i] = "A";
            } else if (resultData[i][0] >= 70) {
                grades[i] = "B";
            } else if (resultData[i][0] >= 60) {
                grades[i] = "C";
            } else if (resultData[i][0] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "Fail";
            }
        }

        // Display results
        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10s\n", 
                              marks[i][0], marks[i][1], marks[i][2], resultData[i][0], grades[i]);
        }

        scanner.close();
    }
}
