package charSequence;

public class Shifter2 implements CharSequence{
  public String string;

  public Shifter2(String string, int shifter) {
    StringBuilder sb = new StringBuilder();
    for (int i = shifter; i < string.length() ; i++ ){
      sb.append(string.charAt(i));
    }
    for (int i = 0; i < shifter ; i++ ){
      sb.append(string.charAt(i));
    }
    this.string = sb.toString();

  }


  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return string.subSequence(start, end);
  }
}
