import java.util.Scanner;

public class QuesTwo {
    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length; // Stop when out of bounds
        }
    }

    // Method to split a string into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);

        // Count words based on spaces
        int wordCount = 1; // At least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1]; // Array to store space positions
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' && spaceIndex < spaceIndexes.length) {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start, length); // Last word

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Built-in split method
        String[] builtInSplit = text.split(" ");

        // Custom split method
        String[] customSplit = customSplit(text);

        // Displaying both results
        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.print("[" + word + "] ");
        }

        System.out.println("\n\nCustom split result:");
        for (String word : customSplit) {
            System.out.print("[" + word + "] ");
        }

        // Comparing results
        boolean areEqual = compareArrays(builtInSplit, customSplit);
        System.out.println("\n\nComparison result: " + (areEqual ? "Match!" : "Mismatch!"));

        scanner.close();
    }
}

