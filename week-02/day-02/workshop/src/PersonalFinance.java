import java.text.DecimalFormat;
import java.util.*;

public class PersonalFinance {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));

        Integer spent = 0;

        for (int i = 0; i < myList.size(); i++) {
            spent += myList.get(i);

        }

        List<Integer> listB = new ArrayList<>();
        listB.addAll(myList);
        listB.sort(Comparator.naturalOrder());
        Integer biggest = listB.get(listB.size()-1);
        Integer smallest = listB.get(0);

        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
        }
        double average = (double)sum/myList.size();

        DecimalFormat numberFormat = new DecimalFormat("#.00");





        System.out.println("I spent: " + spent);
        System.out.println("My biggest purchase cost: " + biggest);
        System.out.println("My cheapest spending cost: " + smallest);
        System.out.println("My average spending was: " + numberFormat.format(average));



    }

}
