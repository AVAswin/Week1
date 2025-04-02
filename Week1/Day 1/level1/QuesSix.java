import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter fees ");
        int initialFees = sc.nextInt();
        System.out.print("Enter discount percentage ");
        int discountPercentage = sc.nextInt();

        int discountedAmount = discountPercentage * initialFees / 100;
        int finalFees = initialFees - discountedAmount;

        System.out.println("Discounted Fees " + discountedAmount);
        System.out.println("Final Fees " + finalFees);
    }
}

