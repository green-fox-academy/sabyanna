import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String string1, String string2) {
    if (compareLength(string1, string2)) {
      char[] arr1 = string1.toCharArray();
      char[] arr2 = string2.toCharArray();

      Arrays.sort(arr1);
      Arrays.sort(arr2);

      if (Arrays.equals(arr1, arr2)) {
        return true;
      }
    }
    return false;
  }

  public boolean compareLength(String string1, String string2) {
    if (string1.length() == string2.length()) {
      return true;
    }
    return false;
  }

}
