public class CodingHours {
    public static void main(String[] args) {
        int averageHours = 6;
        int weeks = 17;
        int days = weeks * 7 - weeks * 5;

        System.out.println("hours spent coding: " + averageHours * (weeks * 5));
        System.out.println("percentage: " + (int)((((float)averageHours * 5) / (52.f) * 100)) + "%");

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}