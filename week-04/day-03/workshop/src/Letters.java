import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letters {
  //Write a function, that takes a string as an argument
  // and returns a dictionary with all letters in the
  // string as keys, and numbers as values that shows
  // how many occurrences there are.


  public HashMap dictionary(String string) {
    List stringList = new ArrayList();
    for (int i = 0; i < string.length(); i ++) {
      stringList.add(string.charAt(i));
    }

    HashMap<String, Integer> myDictionary = new HashMap<>();
    myDictionary.put(stringList.get(0).toString(), 1);
    for (int i = 1; i < stringList.size(); i++){
      if ((myDictionary.containsKey(stringList.get(i).toString()))) {
        myDictionary.put(stringList.get(i).toString(), myDictionary.get(stringList.get(i).toString()) + 1);
      } else {
        myDictionary.put(stringList.get(i).toString(), 1);
      }
    }
    return myDictionary;
  }

}
