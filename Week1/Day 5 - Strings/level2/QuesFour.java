import java.util.*;

class QuesFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] splits = str.split(" ");

        String longestString = " ";
        int longestLength = Integer.MIN_VALUE;
        String shortestString = " ";
        int shortestLength = Integer.MAX_VALUE;

        for(int i=0;i<splits.length;i++) {
            int length = splits[i].length();
            if(length > longestLength) {
                longestLength = length;
                longestString = splits[i];
            }
            if(length < shortestLength) {
                shortestLength = length;
                shortestString = splits[i];
            }
        }

        System.out.println("Shortest String: " + shortestString);
        System.out.println("Length: " + shortestLength);
        System.out.println("Longest String: " + longestString);
        System.out.println("Length: " + longestLength);



        scanner.close();
    }
}
