import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if ((a > b) && (a > c)) {
      return a;
    } else if ((b > a) && (b > c)) {
      return b;
    } else {
      return c;
    }

  }

  int median(List<Integer> pool) {
    int med;
    if (pool.size() % 2 != 0) {
      med = pool.get((pool.size()-1)/2);
    } else {
      med = (pool.get((pool.size()-1) / 2) + (pool.get(pool.size() / 2))) / 2;
    }

    return med;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(Character.toLowerCase(c));
  }

  String translate(String hungarian) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < hungarian.length(); i++) {
      if (isVowel(hungarian.charAt(i))) {
        sb.append(hungarian.charAt(i) + "v" + hungarian.charAt(i) );
      } else {
        sb.append(hungarian.charAt(i));
      }
    }
    return sb.toString();



    /*
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;

     */
  }
}