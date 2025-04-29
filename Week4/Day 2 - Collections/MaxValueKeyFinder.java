import java.util.*;

public class MaxValueKeyFinder {
    public static void main(String[] args) {
        // Step 1: Create the map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Step 2: Track max value and corresponding key
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        // Step 3: Print result
        System.out.println("Key with highest value: " + maxKey);
    }
}
