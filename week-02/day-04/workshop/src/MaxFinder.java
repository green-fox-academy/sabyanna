import java.util.Arrays;

public class MaxFinder {
    public static void main(String[] args) {
        //Write a function that finds the largest element of an array using recursion

        int[] array1 = {3,1,3643,25,252,25232,3534,25,25235,2523,2426548,765836,7475,35,547,636,367,364,355,2,5,5,5,535};
        System.out.println(array1.length);
        System.out.println(Arrays.toString(largest(array1, 0)));


    }

    public static int[] largest(int[] arr, int i) {
        if (i == 23) {
            return arr;
        } else {
            arr[1] = Math.max(arr[0], arr[1]);
            int[] newArr = Arrays.copyOfRange(arr,1, arr.length);
            return largest(newArr, i+1);
        }

    }

}
