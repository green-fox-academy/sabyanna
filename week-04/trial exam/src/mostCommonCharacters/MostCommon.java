package mostCommonCharacters;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MostCommon {
  public static int whatTheMostCommon(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < lines.size(); i++){
        sb.append(lines.get(i));
      }
      String myString = sb.toString();




    } catch (Exception e) {
      return 0;
    }

  }
}
