package Creating.FleetOfThings;

import Creating.FleetOfThings.Fleet;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacle = new Thing("Remove the obstacle");
        Thing stand = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        stand.complete();
        eat.complete();

        fleet.add(milk);
        fleet.add(obstacle);
        fleet.add(stand);
        fleet.add(eat);


        System.out.println(fleet);
    }
}