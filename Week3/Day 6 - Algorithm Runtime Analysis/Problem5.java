public class Problem5 {

    // Exponential time (Recursive)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Linear time (Iterative)
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int nSmall = 30;  // Recursive is okay for small n
        int nLarge = 1_000_000;  // Iterative can handle large n

        // Measure Recursive
        long start = System.nanoTime();
        int resultRec = fibonacciRecursive(nSmall);
        long end = System.nanoTime();
        System.out.println("Recursive result for n=" + nSmall + ": " + resultRec);
        System.out.println("Recursive time: " + (end - start) / 1_000_000.0 + " ms");

        // Measure Iterative (small)
        start = System.nanoTime();
        int resultIter = fibonacciIterative(nSmall);
        end = System.nanoTime();
        System.out.println("Iterative result for n=" + nSmall + ": " + resultIter);
        System.out.println("Iterative time (n=30): " + (end - start) / 1_000_000.0 + " ms");

        // Measure Iterative (large)
        start = System.nanoTime();
        fibonacciIterative(nLarge);
        end = System.nanoTime();
        System.out.println("Iterative time (n=1,000,000): " + (end - start) / 1_000_000.0 + " ms");
    }
}
