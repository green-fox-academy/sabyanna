package main.java.music;

public class Violin extends StringedInstrument{

  public Violin() {
    setName("Violin");
    setNumberOfStrings(5);
  }

  public Violin(int i) {
    setName("Violin");
    setNumberOfStrings(i);
  }

  @Override
  public String sound() {
    return "Screech";
  }
}
