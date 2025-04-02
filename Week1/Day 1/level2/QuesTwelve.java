import java.util.Scanner;

public class QuesTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight (in pounds): ");
        double weight = scanner.nextDouble();

        double weightInKilos = weight / 2.2;


        System.out.println("Weight in Kilos: " + weightInKilos);

        scanner.close();
    }
}

