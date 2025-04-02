import java.util.*;

class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] splits = str.split(" ");

        for(String word : splits) {
            System.out.println(word + " " + word.length());
        }

        scanner.close();
    }
}
