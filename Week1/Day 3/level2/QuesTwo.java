import java.util.*;

public class QuesTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	int[] heights = new int[3];
	int[] ages = new int[3];
	int tallest=-1;
	int youngest=100000;

	System.out.println("Enter heights: ");
	for(int i=0;i<3;i++) {
	    heights[i] = scanner.nextInt();
	    tallest = Math.max(tallest, heights[i]);
	}
        
	System.out.println("Enter ages: ");
	for(int i=0;i<3;i++) {
	    ages[i] = scanner.nextInt();
	    youngest = Math.min(youngest, ages[i]);
	}
	
        
	System.out.println("Tallest: " + tallest);
	System.out.println("Youngest: " + youngest);

        scanner.close();
    }
}
