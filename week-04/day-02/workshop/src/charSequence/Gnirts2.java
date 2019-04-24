package charSequence;

import java.util.stream.IntStream;

public class Gnirts2 implements CharSequence {
  public String string;

  public Gnirts2(String string) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < string.length(); i ++) {
      sb.append(string.charAt(string.length()-1-i));
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

 /*

 @Override
 public char charAt(int index) {
   return string.charAt(length() - index - 1);
 }

 @Override
 public CharSequence subSequence(int start, int end) {
   return (string.subSequence(length() - end - 1, length() - start - 1));
 }

  */




}
