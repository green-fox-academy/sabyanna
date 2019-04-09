import java.util.HashMap;

public class MapIntro {
    public static void main(String[] args) {
        HashMap<Integer, String>  intro = new HashMap<Integer, String>();

        if(intro.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        intro.put(97, "a");
        intro.put(98, "b");
        intro.put(99, "c");
        intro.put(65, "A");
        intro.put(66, "B");
        intro.put(67, "C");

        System.out.println(intro.keySet());

        for (Integer key : intro.keySet()) {
            System.out.print(intro.get(key) + " ");
        }

        intro.put(68, "D");

        System.out.println("");

        System.out.println(intro.size());

        System.out.println(intro.get(99));

        intro.remove(97);

        System.out.println(intro.keySet());

        if (intro.containsKey(100)) {
            System.out.println("there is a value");
        } else {
            System.out.println("there is not");
        }

        intro.clear();

        System.out.println(intro.size());









    }
}
