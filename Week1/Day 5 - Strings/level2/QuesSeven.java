import java.util.*;

public class QuesSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "    string    ";
        String ans = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                ans += str.charAt(i);
            }
        }
        str = ans;
        
        System.out.println(str);
        scanner.close();
    }  
}
