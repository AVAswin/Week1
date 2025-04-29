import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Step 1: Create a map to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        try {
            // Step 2: Read the file
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                // Step 3: Convert to lowercase and remove punctuation
                line = line.toLowerCase();
                line = line.replaceAll("[^a-z0-9 ]", ""); // keep only letters, numbers, and space

                // Step 4: Split the line into words
                String[] words = line.split("\\s+");

                // Step 5: Count each word
                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Step 6: Print the result
        for (String word : wordCount.keySet()) {
            System.out.println(word + " = " + wordCount.get(word));
        }
    }
}
