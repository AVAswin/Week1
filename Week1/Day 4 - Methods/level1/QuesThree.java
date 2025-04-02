import java.util.*;

public class QuesThree {
    public static int calculate(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int n = scanner.nextInt();

        int noOfHandshakes = calculate(n);
			
		System.out.println("No of Handshakes: " + noOfHandshakes);
    }
}


