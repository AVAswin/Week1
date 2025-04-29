import java.util.*;

public class Problem1 {

    // Linear Search implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search implementation (array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {10_000, 100_000, 1_000_000}; // Dataset sizes

        for (int size : sizes) {
            System.out.println("----- Dataset Size: " + size + " -----");

            // Generate random array
            int[] arr = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(size * 10); // Unique range
            }
            int target = arr[rand.nextInt(size)];

            // Linear Search
            long startTime = System.nanoTime();
            int linearResult = linearSearch(arr, target);
            long linearTime = System.nanoTime() - startTime;
            System.out.println("Linear Search took: " + linearTime / 1_000_000.0 + " ms");

            // Binary Search (with sorting)
            int[] arrForBinary = arr.clone();
            startTime = System.nanoTime();
            Arrays.sort(arrForBinary); // Sorting step
            int binaryResult = binarySearch(arrForBinary, target);
            long binaryTime = System.nanoTime() - startTime;
            System.out.println("Binary Search (with sort) took: " + binaryTime / 1_000_000.0 + " ms");

            System.out.println();
        }
    }
}
