
import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {

        //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *

    }

    /*

    public static String replace(String a, int i) {
        char[] atodo = a.toCharArray();
        char[] b = Arrays.copyOfRange(atodo, 0, (atodo.length));

        if (i == b.length) {
            return new String(b);
        } else {
            char[] c = new char[b.length];
            c[i] = b[i];
            c[i+1] = '*';

            //char[] d = Arrays.copyOfRange;


            //char[] c = Arrays.copyOfRange(atodo, 0, (atodo.length-1));
            //return replace()
        }
        //char[] result = a.toCharArray();








/*
        if (i == atodo.length) {
            return new String(atodo);
        } else {
            if (atodo[i] == 'x') {
                for (int m = i; m < atodo.length-1; m++) {
                    atodo[m] = atodo[m+1];
                }

                char[] b = Arrays.copyOfRange(atodo, 0, (atodo.length-1));

                String c = new String(b);
                return replace(c, i + 1, j + 1);

            }

            String b = new String(atodo);
            return replace(b, i+1, j);
        }

    }



 */

}
