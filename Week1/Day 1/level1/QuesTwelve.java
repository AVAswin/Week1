import java.util.Scanner;

public class QuesTwelve {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter base ");
    double base = sc.nextFloat();
    System.out.print("Enter height ");
    double height = sc.nextFloat();
    
    double area = 0.5 * base * height;
    System.out.format("Area: %.2f%n", area);
  }
}

