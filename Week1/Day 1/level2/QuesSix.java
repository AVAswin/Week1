import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary and bonus: ");
        double salary = scanner.nextDouble();
        double bonus = scanner.nextDouble();

        double total = salary + bonus;

        System.out.println("The salary is INR " + salary +" and bonus is INR " + bonus + ". Hence Total Income is INR " + total);

        scanner.close();
    }
} 