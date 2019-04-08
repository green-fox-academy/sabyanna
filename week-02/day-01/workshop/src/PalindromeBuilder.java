public class PalindromeBuilder {
    public static void main(String[] args) {

        //Create a function named create palindrome following your current language's style guide.
        // It should take a string, create a palindrome from it and then return it.

        System.out.println(palindrome("123"));



    }

    public static String palindrome(String s) {

        char[] stringToArray = s.toCharArray();
        char[] reversed = new char[stringToArray.length];
        String result;

        for(int i = 0; i < stringToArray.length; i++) {

            reversed[stringToArray.length - 1 - i] = stringToArray[i];

        }

        String word1 = new String(stringToArray);
        String word2 = new String(reversed);

        result = word1.concat(word2);

        return result;


    }

}
