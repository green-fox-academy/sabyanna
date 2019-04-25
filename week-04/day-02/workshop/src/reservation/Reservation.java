package reservation;

import main.java.music.StringedInstrument;

import java.lang.reflect.Array;
import java.util.Random;

public class Reservation implements Reservationy{









  @Override
  public String getDowBooking() {
    String[] days = new String[10];
    days[0] = "MON";
    days[1] = "TUE";
    days[2] = "WEN";
    days[3] = "THU";
    days[4] = "FRI";
    days[5] = "SAT";
    days[6] = "SUN";

    int max = 0;
    int min = 7;
    int range = max - min;

    int randomInt = (int) ((Math.random() * (range+1) + min));
    return days[randomInt];
  }


  @Override
  public String getCodeBooking() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      Random r = new Random();
      char c = (char)(r.nextInt(26) + 'a');
      sb.append(c);
    }
    return sb.toString().toUpperCase();
  }
}
