import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }

    public static List appendA(List list){
        ArrayList<String> done = new ArrayList<String>(Arrays.asList());
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i).toString());
            sb.append("a");
            done.add(i, sb.toString());
        }
        return done;
    }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"