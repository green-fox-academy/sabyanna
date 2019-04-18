package Creating;

public class Counter {
    int counter = 0;
    int originalCounter = counter;


    Counter() {
    }

    Counter(int counter) {
        this.counter = counter;
        originalCounter = counter;

    }


    public void add(int number) {
        this.counter += number;
    }

    public void add() {
        counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = originalCounter;

    }


}
