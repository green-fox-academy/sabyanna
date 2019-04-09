import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> shopList = new HashMap<>();
        shopList.put("Eggs", 200);
        shopList.put("Milk", 200);
        shopList.put("Fish", 400);
        shopList.put("Apples", 150);
        shopList.put("Bread", 50);
        shopList.put("Chicken", 550);

        List <Integer> prices = new ArrayList<>();

        for (String key : shopList.keySet()) {
            prices.add(shopList.get(key));
        }

        //most expensive
        List <Integer> sortedPrices = new ArrayList<>();
        sortedPrices.addAll(prices);
        sortedPrices.sort(Comparator.naturalOrder());

        Integer expensive = sortedPrices.get(sortedPrices.size()-1);








        System.out.println(sortedPrices);



        System.out.println("The fish costs: " + shopList.get("Fish"));

        for (String key : shopList.keySet()) {
            if (shopList.get(key) == expensive) {
                System.out.println("The most expensive product is: " + key);

            }
        }


    }
}
