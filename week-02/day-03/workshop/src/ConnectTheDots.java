import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics g) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int [][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] shape = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        drawPoly(box, g);
        drawPoly(shape, g);

    }

    public static void drawPoly (int[][] x, Graphics a) {

        int[] xpoints = new int[x.length];
        int[] ypoints = new int[x.length];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j % 2 == 0) {
                    xpoints[i] = x[i][j];
                } else {
                    ypoints[i] = x[i][j];
                }

            }

        }
        a.setColor(Color.green);
        a.drawPolygon(xpoints, ypoints, x.length);



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