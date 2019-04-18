package Creating.Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> ship = new ArrayList<>();

    void fillShip() {
        ship.add(new Pirate("Captain", true));
        for (int i = 1; i < Math.random()* 50; i++) {
            StringBuilder sb = new StringBuilder("Pirate");
            ship.add(new Pirate(sb.append(i).toString(), false));
        }
    }



    void drinkSomeRum(String Tname) {
        for (int i = 0; i < ship.size(); i++ ) {
            if ((ship.get(i).name).equals(Tname)) {
                ship.get(i).drunkness++;
                if (ship.get(i).drunkness > 4) {
                    ship.get(i).isDrunk = "drunk";
                }
            }
        }
    }

    int alivePirates() {
        int counter = 0;
        for (int i = 1; i < ship.size(); i++ ) {
            if (ship.get(i).isAlive) {
                counter++;
            }
        }
        return counter;
    }

    List<Pirate> whosOnBoard() {
        return ship;
    }


    void returnCrew() {
        if (ship.get(0).isAlive)  {
            System.out.println("The Captain is  " + ship.get(0).isDrunk + ".");
        } else {
            System.out.println("The captain is dead.");
        }

        System.out.println(alivePirates() + " pirates are alive.");
    }


    void howsItGoingMate(String Pname) {
        for (int i = 0; i < ship.size(); i++ ) {
            if ((ship.get(i).name).equals(Pname)) {
                if (ship.get(i).drunkness <= 4) {
                    System.out.println("Pour me anudder!");
                } else {
                    System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                }
            }
        }

    }






}
