package comparable.FleetOfThings;

import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch




        System.out.println(fleet);

        Collections.sort(fleet.things);
        System.out.println(fleet);
    }
}