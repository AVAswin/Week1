import java.util.Scanner;

public class QuesSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = scanner.nextInt();

	if(n <= 0) {
	    System.out.println("Not a natural number");
	    return;
	}
	
	
	for(int i=1;i<=n;i++) {
	    if(i % 2 != 0) {
	        System.out.println("Odd: " + i);
	    }
	    else {
	        System.out.println("Even: " + i);
	    }
	}
	


        scanner.close();
    }
}