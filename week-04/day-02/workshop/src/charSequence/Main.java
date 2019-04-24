package charSequence;

public class Main {
  public static void main(String[] args) {
    Gnirts2 g = new Gnirts2("example");

    System.out.println(g.length());
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(0, 6));

    for (int i = 0; i < g.length(); i++) {
      System.out.print(g.charAt(i));
    }

    Gnirts1 k = new Gnirts1("example");


    System.out.println(k.length());
    System.out.println(k.charAt(1));
    System.out.println(k.subSequence(0, 6));

    for (int i = 0; i < k.length(); i++) {
      System.out.print(k.charAt(i));
    }

    System.out.println("");
    System.out.println("");

    Shifter2 s = new Shifter2("example", 3);
    for (int i = 0; i < s.length(); i++) {
      System.out.print(s.charAt(i));
    }
    System.out.println("");

    System.out.println(s.charAt(0));

  }
}
