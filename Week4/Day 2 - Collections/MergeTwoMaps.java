import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // Step 1: Create both maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Step 2: Create result map (start with map1's entries)
        Map<String, Integer> merged = new HashMap<>(map1);

        // Step 3: Merge values from map2
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            // If key already exists, add the values
            merged.put(key, merged.getOrDefault(key, 0) + value);
        }

        // Step 4: Print merged result
        System.out.println("Merged Map: " + merged);
    }
}
