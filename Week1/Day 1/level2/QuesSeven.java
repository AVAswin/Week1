import java.util.Scanner;

public class QuesSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Before Swapping: " + num1 + " " + num2);
        
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: " + num1 + " " + num2);

        scanner.close();
    }
} 