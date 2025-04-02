import java.util.Scanner;

public class QuesTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Mark1 ");
    int mark1 = sc.nextInt();
    System.out.print("Enter Mark2 ");
    int mark2 = sc.nextInt();
    System.out.print("Enter Mark3 ");
    int mark3 = sc.nextInt();
    
    int sum = mark1 + mark2 + mark3;
    float avg = ((float) sum / (float) 3);

    System.out.format("%.2f%n", avg);
  }
}
