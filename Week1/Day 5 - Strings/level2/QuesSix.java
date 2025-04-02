import java.util.*;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = "abcd123efghijklmnopqrstuvwxyz";

        for(int i=0;i<str.length();i++) {
            char s = str.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                System.out.println("Vowel");
            } else if(Character.isLetter(s)) {
                System.out.println("Consonant");
            } else {
                System.out.println("Not a Letter");
            }
        }

        scanner.close();
    }
}
