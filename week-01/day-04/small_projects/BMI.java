public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        int b = 2;

        System.out.println("Your BMI is: " + massInKg * heightInM * heightInM);


        for (int i = 1; i <= b -1; i++) {
            heightInM *= heightInM;
        }
        System.out.println("Your BMI is: " + massInKg * heightInM);

        // Print the Body mass index (BMI) based on these values
    }
}