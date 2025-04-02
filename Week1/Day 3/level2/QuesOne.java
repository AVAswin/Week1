import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] oldSalary = new double[10]; 
	double[] yearsExp = new double[10];
	for(int i=0;i<10;i++) {
	    System.out.println("Enter Old Salary of employee " + (i+1) + ": ");
	    oldSalary[i] = scanner.nextDouble();
            System.out.println("Enter years of Experience " + (i+1) + ": ");
	    yearsExp[i] = scanner.nextDouble();
	}
	
        double[] newSalary = new double[10];
	double[] bonus = new double[10];
	for(int i=0;i<10;i++) {
	    if(yearsExp[i] > 5) {
		bonus[i] = 0.05 * oldSalary[i];
	        newSalary[i] = oldSalary[i] + bonus[i];
            }
	    else {
	        bonus[i] = 0.02 * oldSalary[i];
	        newSalary[i] = oldSalary[i] + bonus[i];
	    }
	}
	
        double totalBonus = 0;
	for(int i=0;i<10;i++) {
	    totalBonus += bonus[i];
	}
        
        for(int i=0;i<10;i++) {
	    System.out.println("Old Salary of employee " + (i+1) + ": "+ oldSalary[i]);
	    System.out.println("New Salary of employee " + (i+1) + ": "+ newSalary[i]);
	}
	System.out.println("Total Bonus: " + totalBonus);
        scanner.close();
    }
}
