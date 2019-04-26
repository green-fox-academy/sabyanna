package mostCommonCharacters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommon {
  public HashMap whatTheMostCommon(String fileName) {
    HashMap<String, Integer> returnHash = new HashMap<>();
    try {
      //read the file

      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < lines.size(); i++){
        sb.append(lines.get(i));
      }
      String myString = sb.toString();

      List stringList = new ArrayList();
      for (int i = 0; i < myString.length(); i ++) {
        stringList.add(myString.charAt(i));
      }

      //occurrences

      HashMap<String, Integer> myDictionary = new HashMap<>();
      myDictionary.put(stringList.get(0).toString(), 1);
      for (int i = 1; i < stringList.size(); i++){
        if ((myDictionary.containsKey(stringList.get(i).toString()))) {
          myDictionary.put(stringList.get(i).toString(), myDictionary.get(stringList.get(i).toString()) + 1);
        } else if(!(stringList.get(i).toString().equals(" "))){
          myDictionary.put(stringList.get(i).toString(), 1);
        }
      }
      System.out.println(myDictionary.toString());

      //two biggest value

      Integer maxValue = 0;
      String maxKey = "";

      for (Map.Entry<String, Integer> entry: myDictionary.entrySet()) {
        if (entry.getValue() > maxValue) {
          maxValue = entry.getValue();
          maxKey = entry.getKey();
        }
      }

      myDictionary.remove(maxKey);

      Integer maxValue2 = 0;
      String maxKey2 = "";


      for (Map.Entry<String, Integer> entry: myDictionary.entrySet()) {
        if (entry.getValue() > maxValue2) {
          maxValue2 = entry.getValue();
          maxKey2 = entry.getKey();
        }

      }
      returnHash.put(maxKey, maxValue);
      returnHash.put(maxKey2, maxValue2);
      
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }
    return returnHash;

  }
}
