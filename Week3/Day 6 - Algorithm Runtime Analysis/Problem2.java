import java.util.*;

public class Problem2 {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000}; // Avoid Bubble Sort on very large inputs

        for (int size : sizes) {
            System.out.println("----- Dataset Size: " + size + " -----");

            int[] original = new Random().ints(size, 0, size * 10).toArray();

            // Bubble Sort
            if (size <= 5000) { // Limiting bubble sort for time concerns
                int[] bubble = original.clone();
                long start = System.nanoTime();
                bubbleSort(bubble);
                long time = System.nanoTime() - start;
                System.out.println("Bubble Sort took: " + time / 1_000_000.0 + " ms");
            } else {
                System.out.println("Bubble Sort skipped due to large size.");
            }

            // Merge Sort
            int[] merge = original.clone();
            long start = System.nanoTime();
            mergeSort(merge, 0, merge.length - 1);
            long time = System.nanoTime() - start;
            System.out.println("Merge Sort took: " + time / 1_000_000.0 + " ms");

            // Quick Sort
            int[] quick = original.clone();
            start = System.nanoTime();
            quickSort(quick, 0, quick.length - 1);
            time = System.nanoTime() - start;
            System.out.println("Quick Sort took: " + time / 1_000_000.0 + " ms");

            System.out.println();
        }
    }
}
