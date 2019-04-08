import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};

        int[] result = new int[5];

        for(int i = 0; i < aj.length; i++) {
            result[aj.length-1-i] = aj[i];
        }

        System.out.println(Arrays.toString(result));





        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
    }
}
