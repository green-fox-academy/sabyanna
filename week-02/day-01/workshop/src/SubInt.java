import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {


        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'
    }




    public static int[] subInt(int b, int[] num2) {
        int text[] = new int[num2.length];
        String ba = Integer.toString(b);
        int j = 0;
        for (int i = 0; i < num2.length; i++) {
            if (Integer.toString(num2[i]).contains(ba)) {
                text[j] = i;
                j++;
            }


        }
        return Arrays.copyOf(text, j);


    }
}


