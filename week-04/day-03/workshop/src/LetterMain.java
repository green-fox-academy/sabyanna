import java.util.HashMap;

public class LetterMain {
  public static void main(String[] args) {

    Letters letter = new Letters();
    HashMap<String, Integer> testDict = testDict = letter.dictionary("Annakak");
    for (String key : testDict.keySet()) {
      System.out.println(key + " - " + testDict.get(key));
    }
  }
}
