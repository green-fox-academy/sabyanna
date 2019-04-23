package aircraftCarrier;

public class Main {
  public static void main(String[] args) {
    F16 myF16 = new F16();
    F35 myF35 = new F35();



    Carrier myCarrier = new Carrier(10, 100);
    myCarrier.add(myF16);
    myCarrier.add(myF35);
    myCarrier.getStatus();

    myCarrier.fill();

    System.out.println("");
    myCarrier.getStatus();





/*
    System.out.println(myF16.getStatus());
    System.out.println(myF35.getStatus());

    System.out.println("");

    System.out.println(myF16.refill(200));
    System.out.println(myF35.refill(200));

    System.out.println("");

    System.out.println(myF16.getStatus());
    System.out.println(myF35.getStatus());

 */


  }
}
