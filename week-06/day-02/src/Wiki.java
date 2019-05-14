import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Wiki {
  public static void main(String[] args) {
    String fileName = "text.txt";
    Map<String, Integer> wordCount = new HashMap<>();

    try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
      lines
              .collect(Collectors.joining())
              .split("\\s");
      //.forEach(x -> System.out.println(x));

              /*
              .collect(Collectors.groupingBy(x -> x.))
              .

              .map(l -> l.split("\\s"))
              // .flatMap(l -> Arrays.stream(l.split("\\s")))
              //.flatMap(f -> f.)
              .forEach(x -> System.out.println(x));

               */


    } catch (IOException e) {
      System.out.println("no such file");
    }
  }
}
