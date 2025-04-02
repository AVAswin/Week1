
import java.util.Scanner;

public class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        for(int i=1;i<=10;i++) {
            System.out.println(i + " X " + number + " = " + (i * number));
        }

            scanner.close();
        }
    }

