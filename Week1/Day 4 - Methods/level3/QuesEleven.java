import java.util.Random;

public class QuesEleven {

    // Constants
    static final int EMPLOYEES = 10;

    // Method to generate salaries and years of service
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] employeeData = new int[EMPLOYEES][2];

        for (int i = 0; i < EMPLOYEES; i++) {
            // Generate random 5-digit salary (between 10000 and 99999)
            employeeData[i][0] = 10000 + random.nextInt(90000);
            // Generate random years of service (between 1 and 10)
            employeeData[i][1] = 1 + random.nextInt(10);
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] newSalaryBonus = new double[EMPLOYEES][2];

        for (int i = 0; i < EMPLOYEES; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            newSalaryBonus[i][0] = newSalary;
            newSalaryBonus[i][1] = bonus;
        }
        return newSalaryBonus;
    }

    // Method to display the results in tabular format
    public static void displayResults(int[][] employeeData, double[][] newSalaryBonus) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < EMPLOYEES; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = newSalaryBonus[i][1];
            double newSalary = newSalaryBonus[i][0];

            // Accumulate totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-5d %-10d %-10d %-10.2f %-10.2f\n", i + 1, oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-5s %-10.2f %-10s %-10.2f %-10.2f\n", "Total", totalOldSalary, "", totalBonus, totalNewSalary);
        System.out.println("--------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();  // Generate random salary and years of service
        double[][] newSalaryBonus = calculateBonus(employeeData); // Calculate bonus and new salary
        displayResults(employeeData, newSalaryBonus);  // Display the results in tabular format
    }
}

