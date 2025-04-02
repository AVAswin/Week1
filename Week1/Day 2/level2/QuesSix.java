import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age and height of Amar: ");
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter age and height of Akbar: ");
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter age and height of Anthony: ");
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();

        String youngest = (ageAmar <= ageAkbar && ageAmar <= ageAnthony) ? "Amar" :
                          (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) ? "Akbar" : "Anthony";

        String tallest = (heightAmar >= heightAkbar && heightAmar >= heightAnthony) ? "Amar" :
                         (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) ? "Akbar" : "Anthony";

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        scanner.close();
    }
}
