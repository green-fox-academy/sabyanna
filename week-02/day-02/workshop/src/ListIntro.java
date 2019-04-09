import java.util.ArrayList;
import java.util.List;

public class ListIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");

        System.out.println(names);

        if(names.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());

        System.out.println(names.get(2));

        System.out.println("");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("");

        for (int i = 0; i < names.size(); i++) {
            System.out.println((i + 1) + ". " +names.get(i));
        }

        names.remove(1);

        System.out.println("");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size()-i -1));
        }

        names.clear();

        System.out.println(names.size());






    }
}
