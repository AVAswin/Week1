import java.util.*;

class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        for(int i=0;i<str1.length();i++) {
            System.out.println(str1.charAt(i));
        }

        String[] str2 = new String[10];
        for(int i=0;i<Math.min(10, str1.length());i++) {
            str2[i] = scanner.nextLine();
        }
        
        for(int i=0;i<str2.length;i++) {
            System.out.println(str2[i]);
        }
        
        
        

    }
}
