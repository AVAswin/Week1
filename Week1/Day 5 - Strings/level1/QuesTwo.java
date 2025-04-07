import java.util.*;

class QuesTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int pos = scanner.nextInt();

        String substr1 = str.substring(pos, 5); //usti
        String substr2 = str.substring(pos + 1, 5); // sti

        if(substr1 == substr2) {
            System.out.println("True");
        } else {
            System.out.println(substr1);
            System.out.println(substr2);
            System.out.println("False");
        }
    }
}
