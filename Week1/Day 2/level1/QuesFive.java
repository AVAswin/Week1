import java.util.Scanner;

public class QuesFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if(age < 18) {
	    System.out.println("Not Eligible to Vote: " + age);
	}
	else {
	    System.out.println("Eligible to Vote: " + age);
	}

        scanner.close();
    }
}

