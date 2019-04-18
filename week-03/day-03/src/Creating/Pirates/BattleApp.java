package Creating.Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.fillShip();

        Ship ship2 = new Ship();
        ship2.fillShip();

        System.out.println("Ship1: ");
        ship1.returnCrew();

        System.out.println("");

        System.out.println("Ship2: ");
        ship2.returnCrew();

        System.out.println("");
        System.out.println("BATLE!!!!");
        System.out.println("");


        if (ship1.battle(ship2)) {
            System.out.println("Ship1 won!");
        } else {
            System.out.println("Ship2 won!");
        }


        System.out.println("Ship1: ");
        ship1.returnCrew();
        System.out.println(ship1.whosOnBoard());

        System.out.println("");

        System.out.println("Ship2: ");
        ship2.returnCrew();
        System.out.println(ship2.whosOnBoard());

    }

}
