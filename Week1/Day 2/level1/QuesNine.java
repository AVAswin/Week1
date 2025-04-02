import java.util.Scanner;

public class QuesNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter counter: ");
        int counter = scanner.nextInt();

	for(int i = counter;counter>0;counter--) {
	    System.out.println(counter);
	}
	System.out.println("Launch!!!");

        scanner.close();
    }
}