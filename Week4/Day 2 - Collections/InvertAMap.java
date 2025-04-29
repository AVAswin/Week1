import java.util.*;

class InvertAMap {
    public static void main(String[] args) {
        // Step 1: Original map
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        // Step 2: Inverted map
        Map<Integer, List<String>> inverted = new HashMap<>();

        // Step 3: Loop through original and build inverted
        for (Map.Entry<String, Integer> entry : original.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // If the value is not already in the inverted map, add a new list
            inverted.putIfAbsent(value, new ArrayList<>());

            // Add the key to the corresponding list
            inverted.get(value).add(key);
        }

        // Step 4: Print the inverted map
        System.out.println("Inverted Map: " + inverted);
    }
}
