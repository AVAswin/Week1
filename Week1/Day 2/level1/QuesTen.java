import java.util.Scanner;

public class QuesTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = -1;
	int sum = 0;

	while(number != 0) {
	    System.out.print("Enter number: ");
	    number = scanner.nextInt();
	    sum += number;
	}
	System.out.println("Sum: " + sum);

        scanner.close();
    }
}