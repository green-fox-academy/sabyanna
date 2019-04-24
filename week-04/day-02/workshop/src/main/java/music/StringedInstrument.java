package main.java.music;

public abstract class StringedInstrument extends Instrument{
  private int numberOfStrings;

  public StringedInstrument(){

  }

  public abstract String sound();



  @Override
  public void play() {
    System.out.println(name + ", a " + getNumberOfStrings() + "-stringedd instrument that goes " + sound());
  }

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
}
