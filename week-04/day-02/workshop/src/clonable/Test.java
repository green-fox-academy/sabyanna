package clonable;

public class Test implements Cloneable{

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
