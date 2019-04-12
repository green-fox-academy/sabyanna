import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingSquares {



    private static final double third = 0.3333;
    private static final double kh = 0.6666;
    private static final double MINIMUM = 1;


    public static void mainDraw(Graphics g) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        setBackGround(g);

        double x = WIDTH * third;
        double y = WIDTH * kh;

        drawLines(g, (int)(WIDTH*third), 0, (int)(WIDTH*third), WIDTH);



    }

    public static void setBackGround(Graphics a) {
        a.setColor(Color.yellow);
        a.fillRect(0, 0, WIDTH, WIDTH);
    }

    private static void drawLines(Graphics g, int x1, int y1, int x2, int y2) {
        g.setColor(Color.BLACK);
        g.drawLine((int)(WIDTH*third), 0, (int)(WIDTH*third), WIDTH);

        g.drawLine((int)(WIDTH*kh), 0, (int)(WIDTH*kh), WIDTH);

        g.drawLine(0, (int)(WIDTH*third), WIDTH, (int)(WIDTH*third));

        g.drawLine(0, (int)(WIDTH*kh), WIDTH, (int)(WIDTH*kh));
        if((x1 - x2 > MINIMUM) && (y1 - y2 > MINIMUM)) {
            g.translate((int)(WIDTH*third), 0);
            drawLines(g, (int)(x1*third), (int)(y1*third), (int)(x2*third), (int)(y2));

        }
    }
/*
    public static void drawLines(Graphics a) {
        //a.translate((int)(WIDTH*third), 0);
        a.setColor(Color.BLACK);
        a.drawLine((int)(WIDTH*third), 0, (int)(WIDTH*third), WIDTH);

        a.drawLine((int)(WIDTH*kh), 0, (int)(WIDTH*kh), WIDTH);

        a.drawLine(0, (int)(WIDTH*third), WIDTH, (int)(WIDTH*third));

        a.drawLine(0, (int)(WIDTH*kh), WIDTH, (int)(WIDTH*kh));


    }



 */


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