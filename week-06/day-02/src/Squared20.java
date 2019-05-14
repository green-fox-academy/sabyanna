import java.util.Arrays;
import java.util.List;

public class Squared20 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbers.stream()
            .filter(x -> x * x > 20)
            .forEach(x -> System.out.println(x));
  }
}
