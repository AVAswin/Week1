import java.util.Scanner;

class QuesTwo {
    public static int calculateSum(int n) {
        if(n == 0) return 0;
	return n + calculateSum(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number n: ");
        int n = scanner.nextInt();

	int sum = calculateSum(n);
	
	int sum2 = n * (n + 1) / 2;

	System.out.println("Sum: " + sum);
        System.out.println("Sum using formula: " + sum2);
	
    }
}