import java.util.Scanner;

public class QuesTen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Height in cm ");
    double height = sc.nextDouble();
    double inches = height / 2.54;
    double foot = inches / 12;
    // Not completed
    System.out.format("Height: %.2f%n", height);
    System.out.format("Inches: %.2f%n", inches);
    System.out.format("Foot: %.2f%n", foot);
  }
}


