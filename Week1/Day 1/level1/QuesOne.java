import java.util.Scanner;

public class QuesOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int presentYear = 2024;
    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.println(presentYear - age);
  }
}