import java.util.Scanner;

public class QuesFour {
    public static int computeRounds(double a, double b, double c) {
        double perimeter = a + b + c; 
        
        if (perimeter == 0) {
            System.out.println("Invalid triangle sides!");
            return 0;
        }
        
        return (int)(5000 / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the three sides of the triangular park (in meters): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        if (a + b > c && a + c > b && b + c > a) {
            int rounds = computeRounds(a, b, c);
            System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
        } else {
            System.out.println("The given sides do not form a valid triangle!");
        }
        
        scanner.close();
    }
}

