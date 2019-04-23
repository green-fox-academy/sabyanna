package aircraftCarrier;

public class Main {
  public static void main(String[] args) {
    F16 myF16 = new F16();
    F35 myF35 = new F35();

    Carrier myCarrier = new Carrier(20, 100);
    myCarrier.add(myF16);
    myCarrier.add(myF35);

    myCarrier.fill();

    myCarrier.getStatus();

    System.out.println("");

    F16 otherF16 = new F16();
    F35 otherF35 = new F35();
    F35 otherF352 = new F35();

    Carrier otherCarrier = new Carrier(50, 100);
    otherCarrier.add(otherF16);
    otherCarrier.add(otherF35);
    otherCarrier.add(otherF352);

    otherCarrier.fill();
    otherCarrier.getStatus();

    System.out.println("");
    System.out.println("FIGHT!!");

    myCarrier.fight(otherCarrier);
    System.out.println("");
    System.out.println("My ship:");
    myCarrier.getStatus();

    System.out.println("");
    System.out.println("Other ship:");
    otherCarrier.getStatus();

    myCarrier.fill();
  }
}
