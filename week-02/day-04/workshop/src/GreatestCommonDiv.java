public class GreatestCommonDiv {
    public static void main(String[] args) {
        //Find the greatest common divisor of two numbers using recursion.

        System.out.println(com(12, 6));

    }

    public static int com(int a, int b) {

        if (a == b) {
            return a;
        } else if (a < b) {
            int div = a;
            if((a % div == 0) && (b % div == 0)) {
                return div;
            } else {
                return com(a -1, b);
            }
        } else {
            int div = b;
            if((a % div == 0) && (b % div == 0)) {
                return div;
            } else {
                return com(a , b -1);
            }
        }

    }

}
