import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane", "Anna"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));

    }

    public static ArrayList makingMatches(ArrayList listA, ArrayList listB) {
        ArrayList<String> doneList = new ArrayList<String>(Arrays.asList());

        for (int j = 0; j < (Math.max(listA.size(),listB.size())); j++) {
            if ((listA.size()>j) && (listB.size()>j)){
                doneList.add(j*2, listA.get(j).toString());
                doneList.add(j*2+1, listB.get(j).toString());
            } else if ((listA.size()>j) && (listB.size()<=j)) {
                doneList.add(j*2, listA.get(j).toString());
            } else {
                doneList.add(j*2, listB.get(j).toString());
            }

        }
        return doneList;
    }

}