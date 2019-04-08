import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(anagram("dog", "gtd"));

    }

    public static boolean anagram(String a, String b) {
        char[] stringToArray = a.toCharArray();
        char[] reversed = new char[stringToArray.length];
        char[] bstringToArray = b.toCharArray();
        boolean bool = false;



        for(int i = 0; i < stringToArray.length; i++) {

            reversed[stringToArray.length - 1 - i] = stringToArray[i];

        }

        bool = Arrays.equals(reversed, bstringToArray);

        return bool;
    }
}
