import java.util.*;

class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int pos1 = scanner.nextInt();
        int pos2 = scanner.nextInt();

        if(pos1 >= str1.length() || pos2 >= str2.length()) {
            System.out.println("Invalid index access");
            return;
        }

        if(str1.charAt(pos1) == str2.charAt(pos2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}