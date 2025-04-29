import java.io.BufferedReader;
import java.io.BufferedWriter;

public class UserInputToFile {
    public static void writeInputToFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        String line;
        while (!(line = reader.readLine()).equals("exit")) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}