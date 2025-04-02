import java.util.Scanner;

public class QuesSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        try {
            // Call the method to generate IllegalArgumentException
            String result = getSubstring(str, 5, 2);  // Invalid indices (start > end)
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        
        scanner.close();
    }

    // Method to generate IllegalArgumentException
    public static String getSubstring(String str, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        return str.substring(start, end); // This would normally throw StringIndexOutOfBoundsException
    }
}
