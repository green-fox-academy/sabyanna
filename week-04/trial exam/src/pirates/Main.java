package pirates;

public class Main {
  public static void main(String[] args) {
    Ship myShip = new Ship();
    BasicPirate brian = new BasicPirate("Brian", 10, true);
    BasicPirate lucy = new BasicPirate("Lucy", 50, false);
    BasicPirate kate = new BasicPirate("Kate", 12, true);
    Captain kirk = new Captain("Kirk", 300, true);
    Captain emily = new Captain("Emily", 450, false);

    myShip.add(brian);
    myShip.add(lucy);
    myShip.add(kate);
    myShip.add(emily);
    myShip.add(kirk);

    for (Pirate pirate: myShip.ship) {
      System.out.println(pirate.getName());
    }

    System.out.println("");

    System.out.println(myShip.getPoorPirates());


    for (int i = 0; i < 7; i++) {
      myShip.lastDayOnTheShip();
    }


    System.out.println(" ");

    for (Pirate pirate: myShip.ship) {
      System.out.println(pirate.getName() + " - " + pirate.getHP());
    }

    myShip.prepareForBattle();

    System.out.println(" ");

    for (Pirate pirate: myShip.ship) {
      System.out.println(pirate.getName() + " - " + pirate.getHP() + " - " + pirate.getGold());
    }

  }
}
