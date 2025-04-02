import java.util.Scanner;

public class QuesFiveeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = scanner.nextInt();

	if(n <= 0) {
	    System.out.println("Not a natural number");
	    return;
	}
	
	
	int product = 1;
	int i = 1;
	while(i <= n) {
	    product *= i;
	    i++;
	}
	System.out.println("Product: " + product);


        scanner.close();
    }
}