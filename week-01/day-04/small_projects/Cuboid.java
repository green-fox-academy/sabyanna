public class Cuboid {
    public static void main(String[] args) {

        double side1 = 23;
        double side2 = 10;
        double side3 = 50;

        System.out.println("Surface Area: " + (int)((2 * side1 * side2) + (2 * side2 * side3) + (2 * side1 * side3)));
        System.out.println("Volume: " + (int)(side1 * side2* side3));

    }
}
