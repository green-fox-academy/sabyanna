package Creating.Pirates;

public class Main {

    public static void main(String[] args) {
        Ship myCrew = new Ship();

        myCrew.fillShip();

        myCrew.returnCrew();

        for (int i = 0; i < 5; i++) {
            myCrew.drinkSomeRum("Captain");
        }


        for (int i = 0; i < 5; i++) {
            myCrew.drinkSomeRum("Pirate1");
        }

        System.out.println(myCrew.whosOnBoard());

        myCrew.howsItGoingMate("Captain");
        myCrew.howsItGoingMate("Pirate2");

        myCrew.returnCrew();

        myCrew.brawl("Captain", "Pirate1");
        myCrew.returnCrew();

        System.out.println(myCrew.whosOnBoard());


    }

}

/*

 */
