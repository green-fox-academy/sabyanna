package main.java.music;

public abstract class StringedInstrument extends Instrument {
  private int numberOfStrings;

  public StringedInstrument(String name){
    super(name);
  }

  public abstract void sound();

  @Override
  public void play() {
    sound();
  }

}
