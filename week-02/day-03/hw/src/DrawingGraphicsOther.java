import javax.swing.*;

public class DrawingGraphicsOther {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingGraphics p = new DrawingGraphics();
        f.add(p);
        f.add(p);
        f.setSize(400,250);
        f.setVisible(true);
    }
}
