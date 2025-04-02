import java.util.Scanner;

public class QuesFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if(n < 1) {
	    System.out.println("Not a natural number");
	}
	else {
	    int sum = 0;
	    for(int i=1;i<=n;i++) {
	        sum += i;
	    }
	    System.out.println("The sum of given n natural numbers is " + sum);
	}

        scanner.close();
    }
}
