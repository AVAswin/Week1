import java.util.*;

class QuesFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = "abcdefghijklmnopqrstuvwxyz";
        
        char[] vowels = new char [5];
        char[] cons = new char [21];
        int ind1 = 0;
        int ind2 = 0;

        for(int i=0;i<str.length();i++) {
            char s = str.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
                vowels[ind1++] = s;
            }
            else {
                cons[ind2++] = s;
            }
        }

        System.out.println(vowels);
        System.out.println(vowels.length);
        System.out.println(cons);
        System.out.println(cons.length);
    }
}