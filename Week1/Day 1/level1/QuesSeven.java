import java.util.Scanner;

public class QuesSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter radius ");
        double radius = sc.nextDouble();

        double volume = ((float) 4 / (float) 3) * 3.14 * radius * radius * radius;


        System.out.println("Volume of sphere in kms " + volume);
        System.out.println("Volume of sphere in miles " + (volume * 1.6 * 3));
    }
}
