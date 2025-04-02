import java.util.Random;
import java.util.Scanner;

public class QuesTwelve {

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics (50-100)
            scores[i][1] = 50 + random.nextInt(51); // Chemistry (50-100)
            scores[i][2] = 50 + random.nextInt(51); // Math (50-100)
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s\n", "ID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-5d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f\n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents); 
        double[][] results = calculateResults(scores); 

        displayScoreCard(scores, results); 

        scanner.close();
    }
}

