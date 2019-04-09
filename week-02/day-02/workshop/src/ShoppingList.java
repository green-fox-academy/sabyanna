import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {

        List<String> shopList = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        List<String> downList = new ArrayList<>();

        for(int i = 0; i < shopList.size(); i++) {
            downList.add((shopList.get(i)).toLowerCase());
        }

        System.out.println(downList);

        if (downList.contains(("milk").toLowerCase())) {
            System.out.println("Yes, we do have milk.");
        } else {
            System.out.println("No, we do not have milk.");
        }

        if (downList.contains(("bananas").toLowerCase())) {
            System.out.println("Yes, we do have bananas.");
        } else {
            System.out.println("No, we do not have bananas.");
        }




    }


}
