import java.io.*;

public class Problem4 {

    private static final String FILE_PATH = "largefile.txt"; // Ensure this is a ~500MB file

    public static void main(String[] args) throws IOException {
        System.out.println("Reading large file (~500MB): " + FILE_PATH);

        // 1. Using FileReader
        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(FILE_PATH)) {
            while (fileReader.read() != -1) {} // Reading char by char
        }
        long timeTaken = System.nanoTime() - startTime;
        System.out.println("FileReader time: " + timeTaken / 1_000_000.0 + " ms");

        // 2. Using InputStreamReader
        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(FILE_PATH))) {
            while (inputStreamReader.read() != -1) {} // Reading byte-to-char
        }
        timeTaken = System.nanoTime() - startTime;
        System.out.println("InputStreamReader time: " + timeTaken / 1_000_000.0 + " ms");
    }
}
