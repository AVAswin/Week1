import java.util.Scanner;

public class QuesSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter year of service: ");
	int yearOfService = scanner.nextInt();
	System.out.print("Enter salary: ");
	int  salary = scanner.nextInt();

	double bonusAmt = 0;
	if(yearOfService > 5) {
	    bonusAmt = 0.05 * (double)salary;
	}	
	System.out.println("Bonus: " + bonusAmt);

        scanner.close();
    }
}