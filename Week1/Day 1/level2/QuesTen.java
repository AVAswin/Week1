import java.util.Scanner;

public class QuesTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chidren: ");
        int noOfChildren = scanner.nextInt();
        System.out.print("Enter number of chocolates: ");
        int noOfChocolates = scanner.nextInt();

        int distributed =  noOfChocolates / noOfChildren;
        int remaining = noOfChocolates % noOfChildren;

        System.out.println("The number of chocolates each child gets is " + distributed +" and the number of remaining chocolates are " + remaining + "\r\n");

        scanner.close();
    }
}



