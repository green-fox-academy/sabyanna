package comparable;

import printable.Printable;

import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable{
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }


  public int compareTo(Domino o){
    int result = Integer.compare(this.left, o.left);
    if (result == 0){
      result = Integer.compare(this.right, o.right);
    }
    return result;
  }


  @Override
  public void printAllFields() {
    System.out.println(toString());
  }
}