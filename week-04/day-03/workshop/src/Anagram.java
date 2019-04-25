public class Anagram {
  //Write a function, that takes two strings and returns a
  // boolean value based on if the two strings are Anagramms or not.

  public boolean isAnagram(String string1, String string2){
    boolean isTrue;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <string1.length(); i++){
      sb.append(string1.charAt(i));
    }
    if (sb.toString().equals(string2)){
      isTrue = true;
    } else {
      isTrue = false;
    }
    return isTrue;
  }
}
