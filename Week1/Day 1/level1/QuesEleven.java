import java.util.Scanner;

public class QuesEleven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Num1 ");
    float num1 = sc.nextFloat();
    System.out.print("Enter Num2 ");
    float num2 = sc.nextFloat();
    
   
    System.out.format("Addition: %.2f%n", num1 + num2);
    System.out.format("Subtraction: %.2f%n", num1 - num2);
    System.out.format("Multiplication: %.2f%n", num1 * num2);
    System.out.format("Division: %.2f%n", num1 / num2);
  }
}
