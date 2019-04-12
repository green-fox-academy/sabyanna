import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics g) {
        // Fill the canvas with a checkerboard pattern.


        g.setColor(Color.white);
        g.fillRect(0, 0, 320, 320);
        for (int i = 0; i < 8; i++) {

            if (i % 2 != 0) {
                for (int j = 0; j < 4; j++) {
                    drawRectB((j * 80), i * 40, 40, g);
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    drawRectB(40 + (j * 80), i * 40, 40, g);
                }
            }

        }

    }

    public static void drawRectB(int x, int y, int size, Graphics a) {

        a.setColor(Color.BLACK);
        a.fillRect(x, y, size, size);

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