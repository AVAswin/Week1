import java.util.*;

class QuesThree {
    public static boolean isLeap(int year) {
        if((year % 4==0 && year % 100==1) || year % 400==0) {
	    	return true;
	}
		return false;
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();

		if(isLeap(year)) {   
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
    }
}