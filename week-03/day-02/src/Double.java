import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Double {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        decrypt("duplicated-chars.txt");


    }

    public static void decrypt (String fileName) {
        Path file = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(file);
            List<String> newLines = new ArrayList<>();
            for (String s: lines) {
                StringBuilder sbf = new StringBuilder();
                for (int i = 0; i < s.length(); i+=2) {
                    sbf.append(s.charAt(i));
                }
                newLines.add(sbf.toString());
            }
            Files.write(file, newLines);

        } catch (IOException e) {
            System.out.println("nope");
        }
    }

}