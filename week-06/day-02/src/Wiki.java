import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wiki {
  public static void main(String[] args) {

    try  {
      Stream<String> stream = Files.lines(Paths.get("./assets/page.txt"), StandardCharsets.UTF_8);
      stream.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }

    File folder = new File(".\\assets\\page.txt");
    File[] list = folder.listFiles();

    List<String> wiki = readFile(".\\assets\\page.txt");

    Map<String, Integer> mostCommonWords = wiki.stream()
            .flatMap(str -> Arrays.stream(str.split(" ")))
            .filter(word -> !word.equals(""))
            .map(word -> word.replace(".", ""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(str -> 1)))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(100)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    System.out.println(mostCommonWords.toString());
  }


  public static List<String> readFile(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(filePath);
      System.out.println("File read.");
    } catch (IOException e) {
      System.out.println("No file found.");
    }
    return lines;
  }
}