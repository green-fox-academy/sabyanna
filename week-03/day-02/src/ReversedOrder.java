import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decrypt("reversed-order.txt");


    }

    public static void decrypt (String fileName) {
        Path file = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(file);
            List<String> newLines = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                newLines.add(lines.get(lines.size()-i-1));
            }
            Files.write(file, newLines);

        } catch (IOException e) {
            System.out.println("nope");
        }
    }

}