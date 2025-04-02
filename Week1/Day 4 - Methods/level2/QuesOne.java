import java.util.Scanner;

class QuesOne {
    public static int[] calculateSumOfSquares(int[] factors, int index) {
        int sum = 0;
	int sumOfSquareOfFactors = 0;
	int productOfFactors = 1;
	for(int i=0;i<index;i++) {
	    sum += factors[i];
	    sumOfSquareOfFactors += (factors[i] * factors[i]);
	    productOfFactors *= factors[i];
	}
	return new int[]{sum, sumOfSquareOfFactors, productOfFactors};
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int number = scanner.nextInt();
	int[] factors = new int[10];
	int index = 0;

	for(int i = 1;i<=number;i++) {
	    if(number % i == 0) {
	        factors[index++] = i;
	    }
	}
	int[] ans = new int[3];
	ans = calculateSumOfSquares(factors, index);

	int sumOfSquareOfFactors = ans[1];	
	int sumOfFactors = ans[0];	
	int productOfFactors = ans[2];

	System.out.println("Sum of square of factors: " + sumOfSquareOfFactors);
	System.out.println("Sum of factors: " + sumOfFactors);
	System.out.println("Product of factors: " + productOfFactors);
    }
}