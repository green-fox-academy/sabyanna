package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar(){
    setName("Electric Guitar");
    setNumberOfStrings(6);

  }

  public ElectricGuitar(int i) {
    setName("Electric Guitar");
    setNumberOfStrings(i);
  }

  @Override
  public String sound() {
    return "Twang";
  }
}
