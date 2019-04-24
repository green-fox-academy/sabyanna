package main.java.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    setName("Bass Guitar");
    setNumberOfStrings(4);
  }

  public BassGuitar(int i) {
    setName("Bass Guitar");
    setNumberOfStrings(i);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }
}
