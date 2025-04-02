import java.util.Scanner;

public class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();
	System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

	System.out.print("Enter number3: ");
        int number3 = scanner.nextInt();


        if(number1 > number2 && number1 > number3) {
	    System.out.println("Yes");
	    System.out.println("No");
	    System.out.println("No");
		
	}
	else if(number2 > number3) {
	    System.out.println("No");
	    System.out.println("Yes");
	    System.out.println("No");
	}
	else {
	    System.out.println("No");
	    System.out.println("No");
	    System.out.println("Yes");
	}

        scanner.close();
    }
}
