import java.util.Random;

public class QuesOne { 
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }
    
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }
    
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];
        
        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Random number between 150 and 250
        }
        
        // Display generated heights
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        // Calculate and display results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }
}
