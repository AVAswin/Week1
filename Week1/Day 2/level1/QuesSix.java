import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if(number < 0) {
	    System.out.println("Negative");
	}
	else if(number > 0) {
	    System.out.println("Positive");
	}
	else {
	    System.out.println("Zero");
	}

        scanner.close();
    }
}
