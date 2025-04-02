import java.util.Scanner;

public class QuesThirteen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter perimeter ");
    double perimeter = sc.nextDouble();
    
    double side = perimeter / 4.0;
    System.out.println("Side: " + side);
  }
}


