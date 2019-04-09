public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";



        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quoteFirst = quote.substring(0, 20);
        String plus = " always takes longer than ";
        String quoteLast = quote.substring(21);

        //System.out.println(quoteFirst);
        //System.out.println(plus);
        //System.out.println(quoteLast);

        String done = quoteFirst+plus+quoteLast;



        System.out.println(done);
    }
}