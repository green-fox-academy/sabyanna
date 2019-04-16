public class Cuboid2 {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        int sideA = 20;
        int sideB = 30;
        int sideC = 12;

        int area = 2*sideA*sideB + 2*sideB*sideC + 2*sideA*sideC;
        int volume = sideA * sideC * sideB;

        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);

    }
}
