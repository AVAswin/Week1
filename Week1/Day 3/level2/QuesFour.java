import java.util.*;

public class QuesFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	long number = scanner.nextLong();
	int[] digits = new int[10];
	int index = 0;
	while(number != 0) {
	    digits[index++] = (int)number % 10;
	    number /= 10;
	    if(index >= digits.length) {
	        int[] temp = new int[digits.length * 2];
		System.arraycopy(digits, 0, temp, 0, digits.length);
		digits = temp;
	    }
	}
	
	int largest = -1;
	int secondLargest = -1;
	for(int i=0;i<index;i++) {
	    if(digits[i] > largest) {
	        secondLargest = largest;
		largest = digits[i];
	    }
	    else if(digits[i] > secondLargest) {
	        secondLargest = digits[i];
	    }
	}
	
	System.out.println("Largest: " + largest);
	System.out.println("Second Largest: " + secondLargest);

        scanner.close();
    }
}
