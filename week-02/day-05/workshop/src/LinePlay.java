import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        backgroundColor(g);
        int tener = 30;

        for (int i = 0; i < WIDTH; i+=tener) {
            drawlinePurple(g, i, 0, WIDTH, i);
            drawlineGreen(g, 0, i, i, WIDTH);
        }




    }

    public static void drawlinePurple(Graphics a, int x1, int y1, int x2, int y2) {
        a.setColor(new Color(189, 46, 242));
        a.drawLine(x1, y1, x2, y2);
    }

    public static void drawlineGreen(Graphics a, int x1, int y1, int x2, int y2) {
        a.setColor(new Color(14, 249, 18));
        a.drawLine(x1, y1, x2, y2);
    }

    public static void backgroundColor(Graphics a) {
        a.setColor(Color.BLACK);
        a.fillRect(WIDTH, 0, WIDTH, WIDTH);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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