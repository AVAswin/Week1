import java.util.Scanner;

public class QuesSeven {
    
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        }
        return age >= 18;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            boolean canVote = canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age! Cannot vote.");
            } else {
                System.out.println("Student " + (i + 1) + (canVote ? " can vote." : " cannot vote."));
            }
        }
        
        scanner.close();
    }
}

