import java.util.Arrays;

public class PalindromeSearch {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(search("dad ded")));

    }

    public static String[] search(String a) {
        char[] chartxt = a.toCharArray();
        String[] result = new String[15];
        int l = 0;

        for(int i = 0; i < chartxt.length -2; i++) {


            for(int j = i + 3 ; j <= chartxt.length; j++) {


                char[] toCheck = java.util.Arrays.copyOfRange(chartxt, i, j);
                char[] reversed = new char[toCheck.length];
                boolean bool;



                for(int k = 0; k < toCheck.length; k++) {

                    reversed[toCheck.length -1 - k] = toCheck[k];

                }
                bool = Arrays.equals(reversed, toCheck);
                String word1 = new String(toCheck);


                if (bool) {
                    result[l] = word1;
                    l++;


                }






            }



        }
        return result;



    }
}

/*
    char[] stringToArray = a.toCharArray();
    char[] reversed = new char[stringToArray.length];
    char[] bstringToArray = b.toCharArray();




        for(int i = 0; i < stringToArray.length; i++) {

        reversed[stringToArray.length - 1 - i] = stringToArray[i];

        }

*/

//dog goat dad
//dad taog god