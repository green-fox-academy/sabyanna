import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Uppercase {
  public static void main(String[] args) {
    String myWord = "KeCsKe";

    //char[] myChars = myWord.toCharArray();

    myWord.chars()
            .filter(x -> Character.isUpperCase(x));


  }
}
