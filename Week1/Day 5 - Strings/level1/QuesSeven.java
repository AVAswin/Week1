import java.util.Scanner;

public class QuesSeven {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Exception Caught: Invalid number format! " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input as a String
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        
        // Calling the method that generates an exception
        System.out.println("\nCalling generateException()...");
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
        
        // Calling the method that handles the exception
        System.out.println("\nCalling handleException()...");
        handleException(userInput);
        
        scanner.close();
    }
}


