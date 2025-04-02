import java.util.Scanner;

public class QuesSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = scanner.nextLine();
	System.out.print("Enter day: ");
        int day = scanner.nextInt();

        if(month == "March" && day >= 20) {
	    System.out.println("It's a spring season");
	}
	else if(month == "April" || month == "May") {
	    System.out.println("It's a spring season");
	}
	else if(month == "June" && day <= 20) {
	    System.out.println("It's a spring season");
	}
	else {
	    System.out.println("It's not a spring season");
	}

        scanner.close();
    }
}