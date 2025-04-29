import java.io.*;

public class FileCopyComparison {
    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {
        String sourceFile = "largefile.txt"; // Make sure this exists (e.g., 100MB)
        String unbufferedTarget = "unbuffered_copy.txt";
        String bufferedTarget = "buffered_copy.txt";

        System.out.println("Copying with unbuffered streams...");
        long timeUnbuffered = copyUnbuffered(sourceFile, unbufferedTarget);
        System.out.println("Time taken (unbuffered): " + timeUnbuffered + " ns\n");

        System.out.println("Copying with buffered streams...");
        long timeBuffered = copyBuffered(sourceFile, bufferedTarget);
        System.out.println("Time taken (buffered): " + timeBuffered + " ns\n");

        System.out.println("Buffered is faster by: " + (timeUnbuffered - timeBuffered) + " ns");
    }

    public static long copyUnbuffered(String src, String dest) {
        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error in unbuffered copy:");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long copyBuffered(String src, String dest) {
        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Error in buffered copy:");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
