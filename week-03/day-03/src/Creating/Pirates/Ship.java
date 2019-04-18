package Creating.Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> ship = new ArrayList<>();

    int randomWithRange(int min, int max)
    {
        int range = Math.abs(max - min) + 1;
        return (int)(Math.random() * range) + (min <= max ? min : max);
    }

    void fillShip() {
        ship.add(new Pirate("Captain", true));
        for (int i = 1; i < randomWithRange(1, 20); i++) {
            StringBuilder sb = new StringBuilder("Pirate");
            ship.add(new Pirate(sb.append(i).toString(), false));
        }
    }

    int alivePirates() {
        int counter = 0;
        for (int i = 0; i < ship.size(); i++ ) {
            if ((ship.get(i).isAlive.equals("alive")) || (ship.get(i).isAlive.equals("out"))) {
                counter++;
            }
        }
        return counter;
    }

    List<Pirate> whosOnBoard() {
        return ship;
    }


    void returnCrew() {
        if (ship.get(0).isAlive.equals("alive"))  {
            System.out.println("The Captain is well.");
        } else if (ship.get(0).isAlive.equals("out")) {
            System.out.println("The captain passed out.");
        } else {
            System.out.println("the captain is dead");
        }
        System.out.println(alivePirates() + " pirates are alive.");
    }




    int getIndex (String name) {
        int index = 0;
        for (int i = 0; i < ship.size(); i++ ) {
            if ((ship.get(i).name).equals(name)) {
                index = i;
            }
        }

        return index;

    }

    int score() {

        int score = 0;
        score = alivePirates() - ship.get(0).drunkness;
        return score;
    }

    boolean battle(Ship othership) {
        boolean winOrLose;
        if (this.score() > othership.score()) {
            for (int i = 0; i < this.ship.size(); i++) {
                this.ship.get(i).drunkness += randomWithRange(0, 20);
            }
            for (int i = 0; i < othership.ship.size(); i++) {
                int isdead = randomWithRange(0, 2);
                if (isdead == 1) {
                    othership.ship.get(i).isAlive = "dead";
                }
            }
            winOrLose = true;
        } else {
            for (int i = 0; i < othership.ship.size(); i++) {
                othership.ship.get(i).drunkness += randomWithRange(0, 20);
            }
            for (int i = 0; i < ship.size(); i++) {
                int isdead = randomWithRange(0, 2);
                if (isdead == 1) {
                    ship.get(i).isAlive = "dead";
                }
            }
            winOrLose = false;
        }
        return winOrLose;

    }







}
