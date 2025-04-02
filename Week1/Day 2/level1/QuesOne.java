import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if(number % 5 == 0) {
	    System.out.println("Yes");
	}
	else {
	    System.out.println("No");
	}

        scanner.close();
    }
}


