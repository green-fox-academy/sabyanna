package Creating.Pirates;

public class Main {

    public static void main(String[] args) {
        Ship myCrew = new Ship();

        myCrew.fillShip();

        myCrew.returnCrew();

        for (int i = 0; i < 5; i++) {
            myCrew.ship.get(myCrew.getIndex("Captain")).drinkSomeRum();
        }


        for (int i = 0; i < 5; i++) {
            myCrew.ship.get(myCrew.getIndex("Pirate1")).drinkSomeRum();
        }

        System.out.println(myCrew.whosOnBoard());

        myCrew.ship.get(myCrew.getIndex("Captain")).howsItGoingMate();
        myCrew.ship.get(myCrew.getIndex("Pirate2")).howsItGoingMate();

        myCrew.returnCrew();

        myCrew.ship.get(myCrew.getIndex("Captain")).brawl(myCrew.ship.get(myCrew.getIndex("Pirate1")));


        System.out.println(myCrew.whosOnBoard());


    }

}

/*

 */
