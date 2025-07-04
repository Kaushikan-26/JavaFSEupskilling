import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead{
    public static void main(String[] args) {
        // Open output.txt for reading
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;

            // Read each line and display it on the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
