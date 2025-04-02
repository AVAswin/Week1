import java.util.Scanner;

public class QuesFourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = scanner.nextInt();

	if(n <= 0) {
	    System.out.println("Not a natural number");
	    return;
	}
	
	
	int product = 1;
	for(int i=1;i <= n;i++) {
	    product *= i;
	}
	System.out.println("Product: " + product);


        scanner.close();
    }
}