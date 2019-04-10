import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        g.setColor(Color.BLACK);
        line(0, 0, g);

        for (int i = 0; i < 64; i++) {
            if ((0 <= i) && (i <= 16)) {
                for (int j = 0; j <= 16; j++) {
                    line((j*20), 0, g);
                }
            } else if ((16 < i) && (i <= 32)) {
                for (int j = 0; j <= 16; j++) {
                    line(320, (j*20), g);
                }
            } else if ((32 < i) && (i <= 48)) {
                for (int j = 0; j <= 16; j++) {
                    line((j*20), 320, g);
                }
            } else {
                for (int j = 0; j <= 16; j++) {
                    line(0, (j*20), g);
                }
            }

        }


        for (int i = 0; i < 3; i++) {
            line((i*20), 0, g);
        }





    }

    public static void line(int x, int y, Graphics a) {
        a.drawLine(x, y, 160, 160);
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