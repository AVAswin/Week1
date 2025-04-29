import java.util.*;

public class WordCounter {
    public static int countWord(String filename, String target) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int count = 0;
        while ((line = reader.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equals(target)) count++;
            }
        }
        reader.close();
        return count;
    }
}