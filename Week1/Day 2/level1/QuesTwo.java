import java.util.Scanner;

public class QuesTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
	System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

	System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();


        if(number1 < number2 && number1 < number3) {
	    System.out.println("Yes");
	}
	else {
	    System.out.println("No");
	}

        scanner.close();
    }
}
