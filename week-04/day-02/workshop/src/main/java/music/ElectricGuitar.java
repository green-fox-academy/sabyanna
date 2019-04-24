package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(String name) {
    super("Electric Guitar");
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }
}
