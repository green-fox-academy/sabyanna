import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Concatenate {
  public static void main(String[] args) {
    List<Character> myChars = Arrays.asList('k', 'e', 'c', 's', 'k', 'e');

    String myWord = myChars.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining());

    System.out.println(myWord);
  }
}
