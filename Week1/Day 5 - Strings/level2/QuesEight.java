import java.util.*;

class QuesEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ages = new int [10];
        for(int i=0;i<ages.length;i++) {
            ages[i] = scanner.nextInt();
        }

        for(int i=0;i<ages.length;i++) {
            if(ages[i] >= 18) {
                System.out.println("Student" + " " + (i+1) + " is eligible to vote");
            }
            else {
                System.out.println("Student" + " " + (i+1) + " is not eligible to vote");
            }
        }

        scanner.close();
    }
}
