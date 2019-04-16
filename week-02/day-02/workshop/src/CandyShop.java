import java.util.*;

public class CandyShop{
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

        System.out.println(candy(arrayList));
    }

    public static ArrayList candy(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "2") {
                list.set(i, "Croissant");

            } else if (list.get(i) == "false") {
                list.set(i, "Ice cream");
            }
        }

        return list;
    }

    public static ArrayList sweets(ArrayList list) {
        list.set(1, "Croissant");
        list.set(3, "Ice cream");
        return list;
    }

}