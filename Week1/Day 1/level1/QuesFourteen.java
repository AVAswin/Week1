import java.util.Scanner;

public class QuesFourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for distance in feet
        System.out.print("Enter distance in feet: ");
        int distanceInFeet = sc.nextInt();

        // Converting feet to yards and miles
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;

        // Taking input for height in cm
        System.out.print("Enter your height in cm: ");
        double heightInCm = sc.nextDouble();

        // Converting height to feet and inches
        double heightInInches = heightInCm / 2.54;
        int heightFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        // Printing results
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);
        System.out.println("Your Height in cm is " + heightInCm +
                           " while in feet is " + heightFeet +
                           " and inches is " + String.format("%.2f", remainingInches));

        sc.close(); // Closing scanner
    }
}


