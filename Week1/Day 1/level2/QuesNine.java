import java.util.Scanner;

public class QuesNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides of triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        int perimeter = side1 + side2 + side3;

        System.out.println("No of Rounds: " +(5000 / perimeter));

        scanner.close();
    }
}


