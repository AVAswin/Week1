import java.util.Scanner;

public class QuesEight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter KiloMetres ");
    float distacnceInKilometres = sc.nextFloat();

    System.out.format("%.2f%n", distacnceInKilometres * 1.6);
  }
}

