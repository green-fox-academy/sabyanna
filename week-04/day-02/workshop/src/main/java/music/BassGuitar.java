package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar(String name) {
    super("Bass Guitar");
  }

  @Override
  public void sound() {
    System.out.println( "Duum-duum-duum");
  }
}
