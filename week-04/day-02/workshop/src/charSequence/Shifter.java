package charSequence;

public class Shifter implements CharSequence{
  public String string;

  public Shifter(String string, int shift) {
    this.string = string;

  }


  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    StringBuilder sb = new StringBuilder();
    for (int i = index; i < string.length() - index ; i++ ){
      sb.append(string.charAt(i));
    }
    for (int i = 0; i < index ; i++ ){
      sb.append(string.charAt(i));
    }

    return sb.toString().charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
