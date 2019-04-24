package flyable;

public class Helicopter implements Flyable{

  @Override
  public void land() {
    System.out.println("landed on the leszállópálya");
  }

  @Override
  public void fly() {
    System.out.println("My propellers are rotating real fast");

  }

  @Override
  public void takeOff() {
    System.out.println("risky takeoff with this pilot");

  }
}
