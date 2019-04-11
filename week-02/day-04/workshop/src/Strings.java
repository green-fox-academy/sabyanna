import java.lang.reflect.Array;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {

        System.out.println(replace("xxxxx", 0));

    }
        //Given a string, compute recursively (no loops) a new string where all
        // the lowercase 'x' chars have been changed to 'y' chars.

    public static String replace(String a, int i) {
        char[] atodo = a.toCharArray();

        if (i == atodo.length) {

            return  new String(atodo);
        } else {
            if (atodo[i] == 'x') {
                atodo[i] = 'y';

                String b = new String(atodo);
                return replace(b, i+1);

            }
            String b = new String(atodo);
            return replace(b, i+1);
        }

    }

}
