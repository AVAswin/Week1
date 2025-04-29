import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Replace with your actual file paths
        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        File sourceFile = new File(sourcePath);

        // Check if the source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            int byteData;
            // Read and write one byte at a time
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O:");
            e.printStackTrace();
        }
    }
}
