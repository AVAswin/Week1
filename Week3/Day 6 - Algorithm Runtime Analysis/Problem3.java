public class Problem3 {

    private static final int ITERATIONS = 1_000_000;

    public static void main(String[] args) {
        System.out.println("Concatenating " + ITERATIONS + " strings:");

        // 1. Using String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "a";
        }
        long timeTaken = System.nanoTime() - startTime;
        System.out.println("String (Immutable) time: " + timeTaken / 1_000_000.0 + " ms");

        // 2. Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        timeTaken = System.nanoTime() - startTime;
        System.out.println("StringBuilder (Fast, Non-thread-safe) time: " + timeTaken / 1_000_000.0 + " ms");

        // 3. Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append("a");
        }
        timeTaken = System.nanoTime() - startTime;
        System.out.println("StringBuffer (Thread-safe) time: " + timeTaken / 1_000_000.0 + " ms");
    }
}
