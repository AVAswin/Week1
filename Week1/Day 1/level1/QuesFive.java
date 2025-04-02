import java.util.Scanner;

public class QuesFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter number of pens ");
        int noOfPens = sc.nextInt();
        System.out.print("Enter number of students ");
        int noOfStudents = sc.nextInt();
        
        int penPerStudent = noOfPens / noOfStudents;
        int notDistributedPens = noOfPens % noOfStudents;

        System.out.println("Pen per student: " + penPerStudent);
        System.out.println("Not Distributed Pens: " + notDistributedPens);
    }
}
