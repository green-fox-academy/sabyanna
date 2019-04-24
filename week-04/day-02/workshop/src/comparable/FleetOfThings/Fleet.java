package comparable.FleetOfThings;

import java.util.ArrayList;

/**
 * Created by aze on 2017.03.29..
 */
public class Fleet {
    public ArrayList<Thing> things;

    public Fleet() {
        things = new ArrayList<>();
        Thing milk = new Thing("Get milk");
        Thing obstacle = new Thing("Remove the obstacle");
        Thing stand = new Thing("Stand up");
        Thing eat = new Thing("Eat lunch");

        stand.complete();
        eat.complete();


        things.add(obstacle);
        things.add(stand);
        things.add(milk);
        things.add(eat);
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}