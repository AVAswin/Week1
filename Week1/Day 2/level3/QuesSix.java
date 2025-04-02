import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int cnt = 0;
        int temp = number;

        while (temp != 0) {
	    cnt++;
            temp /= 10;
        }
        
        System.out.println(cnt + " digits");
    } 
}
