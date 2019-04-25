import java.util.ArrayList;
import java.util.List;

public class Sum {

  public Integer sum(ArrayList<Integer> myList) {
    Integer sum = 0;
    for (Integer i : myList) {
      sum+= i;
    }
    return sum;
  }

}
