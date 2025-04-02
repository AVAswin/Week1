import java.util.Scanner;

public class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter for Physics: ");
        int physics = scanner.nextInt();

	System.out.print("Enter for chemistry: ");
        int chemistry = scanner.nextInt();

	System.out.print("Enter for maths: ");
        int maths = scanner.nextInt();


        double percentage = (float) (physics + chemistry + maths) / 3.0;
	if (percentage >= 80) {
            System.out.println("Level 4");
        } else if(percentage >= 70) {
            System.out.println("Level 3");
        } else if(percentage >= 60) {
            System.out.println("Level 2");
        } else if(percentage >= 50) {
            System.out.println("Level 1, well");
        } else if(percentage >= 40) {
            System.out.println("Level 1, below");
        } else {
	    System.out.println("Remedial");
	}




        scanner.close();
    }
}