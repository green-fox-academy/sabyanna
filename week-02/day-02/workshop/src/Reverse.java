import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";



        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(reverse(reversed));
    }

    public static String reverse (String a) {
        String result = "";
        for(int i = 0; i < a.length(); i++) {
            result = result+a.charAt(a.length()-i -1);
        }
        return result;
    }


}