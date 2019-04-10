import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics g) {


        for(int i = 1; i < 20; i++) {
            int x = 1;
            for (int j = 1; j <= i; j++)
                x += x;

            drawRect(x, g);
        }

    }

    public static void drawRect(int x, Graphics a) {
        a.setColor(Color.BLACK);
        a.drawRect(x, x, x, x);

        a.setColor(new Color(198, 53, 150));
        a.fillRect(x+1, x+1, x-1, x-1);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}