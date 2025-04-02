import java.util.Scanner;

public class QuesEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter counter: ");
        int counter = scanner.nextInt();
	
	while(counter >= 1) {
	    System.out.println(counter);
	    counter--;
	}
	System.out.println("Launch!!!");

        scanner.close();
    }
}