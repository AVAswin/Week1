import java.util.*;

public class QuesOne {
	public static double calculateSimpleInterest(double principal, double noOfYears, double rateOfInterest) {
		double SI = (principal * noOfYears * rateOfInterest) / 100.0;
		return SI;
	}
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter principal amount: ");
		double principal = scanner.nextDouble();
		System.out.println("Enter no of years: ");
		double noOfYears = scanner.nextDouble();
		System.out.println("Enter rate of interest: ");
		double rateOfInterest = scanner.nextDouble();
		double SI = calculateSimpleInterest(principal, noOfYears, rateOfInterest);
			
		System.out.println("Simple Interest: " + SI);
		System.out.println("Total Amount: " + (principal + SI));
    }
}
