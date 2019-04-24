package comparable.FleetOfThings;

import printable.Printable;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>, Printable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    public int compareTo(Thing o) {
        int result = Boolean.compare(this.completed, o.completed);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;

    }

    @Override
    public void printAllFields() {
        System.out.println(toString());
    }

    /*
    public int compareTo(Domino o){
      int result = Integer.compare(this.left, o.left);
      if (result == 0){
        result = Integer.compare(this.right, o.right);
      }
      return result;
    }
    */
}