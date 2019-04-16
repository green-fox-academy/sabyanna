import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        uniques("log.txt");
        ratio("log.txt");

    }

    public static void uniques(String fileName) {
        Path file = Paths.get(fileName);

        try {
            List<String> originalData = Files.readAllLines(file);
            List<String> IPs = new ArrayList<>();
            for (String s : originalData) {
                String[] lines = s.split("\\s+");
                IPs.add(lines[5]);
            }
            List<String> IPsUnique = new ArrayList<>();
            for (String s : IPs) {
                if (!IPsUnique.contains(s)) {
                    IPsUnique.add(s);
                }
            }
            System.out.println(IPsUnique.toString());
        } catch (IOException e) {
            System.out.println("nope");
        }
    }

    public static void ratio(String fileName) {
        Path file = Paths.get(fileName);

        try {
            List<String> originalData = Files.readAllLines(file);
            List<String> POST = new ArrayList<>();
            for (String s : originalData) {
                if (s.contains("POST")) {
                    POST.add(s);
                }
            }
            List<String> GET = new ArrayList<>();
            for (String s : originalData) {
                if (s.contains("GET")) {
                    GET.add(s);
                }
            }
            double GPratio = (double)GET.size() / (double)POST.size();
            double PGratio = (double)POST.size() / (double)GET.size();
            System.out.println(GPratio);
            System.out.println(PGratio);
        } catch (IOException e) {
            System.out.println("nope");
        }
    }




}
