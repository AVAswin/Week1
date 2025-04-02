import java.util.Scanner;

public class QuesTen {
    
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.9) return "Normal weight";
        else if (bmi >= 25 && bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 members, 3 columns (weight, height, BMI)
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        
        calculateBMI(data);
        
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI | Status");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(data[i][2]);
            System.out.printf("  %2d   |    %.1f    |    %.1f    | %.2f | %s\n", 
                (i + 1), data[i][0], data[i][1], data[i][2], status);
        }
        
        scanner.close();
    }
}

