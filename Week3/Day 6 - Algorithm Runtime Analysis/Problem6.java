import java.util.*;

public class Problem6 {

    private static final int SIZE = 1_000_000;
    private static final int TARGET = 999_999; // Last element

    public static void main(String[] args) {
        // Prepare Data
        Integer[] array = new Integer[SIZE];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < SIZE; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Search in Array
        long start = System.nanoTime();
        boolean foundArray = linearSearch(array, TARGET);
        long end = System.nanoTime();
        System.out.println("Array Search (O(N)) found: " + foundArray + " in " + (end - start) / 1_000_000.0 + " ms");

        // Search in HashSet
        start = System.nanoTime();
        boolean foundHashSet = hashSet.contains(TARGET);
        end = System.nanoTime();
        System.out.println("HashSet Search (O(1)) found: " + foundHashSet + " in " + (end - start) / 1_000_000.0 + " ms");

        // Search in TreeSet
        start = System.nanoTime();
        boolean foundTreeSet = treeSet.contains(TARGET);
        end = System.nanoTime();
        System.out.println("TreeSet Search (O(log N)) found: " + foundTreeSet + " in " + (end - start) / 1_000_000.0 + " ms");
    }

    // Linear search for array
    private static boolean linearSearch(Integer[] arr, int target) {
        for (int val : arr) {
            if (val == target) return true;
        }
        return false;
    }
}
