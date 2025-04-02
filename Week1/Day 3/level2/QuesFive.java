import java.util.*;

public class QuesFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int number = scanner.nextInt();
	int temp = number;
	int reversedNumber = 0;

	while(number != 0) {
	    reversedNumber += number % 10;
	    number /= 10;
	    if(number != 0) reversedNumber *= 10;
	}
	System.out.println("Number: " + temp);
	System.out.println("Reversed Number: " + reversedNumber);


        scanner.close();
    }
}
