import javax.swing.*;

public class Test1Other {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Test1 p = new Test1();
        f.add(p);
        f.add(p);
        f.setSize(500,270);
        f.setVisible(true);
    }
}
