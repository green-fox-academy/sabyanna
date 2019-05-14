import java.util.Arrays;
import java.util.List;

public class StartsWith {
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

    cities.stream()
            .filter(word -> word.toLowerCase().startsWith("r"))
            .forEach(System.out::println);
  }
}
