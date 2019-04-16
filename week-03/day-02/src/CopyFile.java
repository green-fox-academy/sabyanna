import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        System.out.println(copier("source.txt", "my-file.txt"));
    }

    public static boolean copier(String src, String dest) {
        Path srcPath = Paths.get(src);
        Path destPath = Paths.get(dest);

        try {
            List<String> write = Files.readAllLines(srcPath);
            Files.write(destPath, write);
            return true;
        } catch (Exception e) {
            return false;
        }



    }

}
