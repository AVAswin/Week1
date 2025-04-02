import java.util.Scanner;

public class QuesThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = scanner.nextInt();

	if(n <= 0) {
	    System.out.println("Not a natural number");
	    return;
	}
	
	int sum1 = n*(n+1)/2;
	
	int sum2 = 0;
	for(int i=1;i <= n;i++) {
	    sum2 += i;
	}
	System.out.println("Sum using formula: " + sum1);
	System.out.println("Sum using loop: " + sum2);


        scanner.close();
    }
}