import java.util.Scanner;

public class QuesFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter cost price ");
        int costPrice = sc.nextInt();
        System.out.print("Enter sell price ");
        int sellPrice = sc.nextInt();
        
        int profit = sellPrice - costPrice;
        float percentage = (float)profit /(float) costPrice * 100;

        System.out.println("Profit: " + profit);
        System.out.format("Percentage: %.2f%n", percentage);
    }
}
