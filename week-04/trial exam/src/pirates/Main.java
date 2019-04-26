package pirates;

public class Main {
  public static void main(String[] args) {
    Ship myShip = new Ship();
    BasicPirate brian = new BasicPirate("Brian", 20, true);
    BasicPirate lucy = new BasicPirate("Lucy", 50, false);
    BasicPirate kate = new BasicPirate("Kate", 40, true);
    Captain kirk = new Captain("Kirk", 300, true);
    Captain emily = new Captain("Emily", 450, false);

    myShip.setShip();
  }
}
