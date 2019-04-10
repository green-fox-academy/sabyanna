import java.util.*;

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


        // average

        int sum = 0;
        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i);
        }

        double average = (double)sum / prices.size();

        //below 300


        int[] below = new int[prices.size()];
        int p = 0;

        for (int i = 0; i < prices.size(); i ++) {

            if (prices.get(i) < 300) {
                below[p] = prices.get(i);
                p += 1;
            }

        }

        int[] newBelow = new int[p];

        for (int i = 0; i < p;  i++) {
            newBelow[i] = below[i];
        }

        System.out.println(Arrays.toString(newBelow));

        //cheapest

        Integer cheapest = sortedPrices.get(0);


        //print

        System.out.println(sortedPrices);

        System.out.println("The fish costs: " + shopList.get("Fish"));

        for (String key : shopList.keySet()) {
            if (shopList.get(key) == expensive) {
                System.out.println("The most expensive product is: " + key);

            }
        }

        System.out.println("The average price is: " + average);

        System.out.println(newBelow.length + " prices are under 300.");

        if (shopList.containsValue(125)) {
            for (String key : shopList.keySet()) {
                if (shopList.get(key) == 125) {
                    System.out.println("For 125 you can buy " + key);

                }
            }
        } else {
            System.out.println("You cannot buy anything for 125.");
        }

        for (String key : shopList.keySet()) {
            if (shopList.get(key) == cheapest) {
                System.out.println("the cheapest product is: "+  key);

            }
        }






    }
}
