package reservation;

public class Main {
  public static void main(String[] args) {

    Reservation myRes = new Reservation();

    for (int i = 0; i <= 10; i++) {
      System.out.println("Booking" + i + " " + myRes.getCodeBooking() + " for "  + myRes.getDowBooking());
    }
  }
}
