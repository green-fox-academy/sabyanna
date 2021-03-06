import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NewDrawing {



    private static final double third = 0.3333;
    private static final double kh = 0.6666;
    private static final int MINIMUM = 1;
    private static final double D = 1.333333;




    public static void mainDraw(Graphics g) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        setBackGround(g);

        int x1 = (int)(WIDTH * third);
        int y1 = (int)(WIDTH * third);
        int x2 = (int)(WIDTH * third);
        int y2 = (int)(WIDTH * third);
        g.setColor(Color.BLACK);
        int width = 640;


        drawLines(g, x1, y1, x2, y2, 640);
        g.translate(-315
                , 0);
        //g.setColor(Color.blue);
        //drawLines2(g, x1, y1, x2, y2, 640);

    }

    public static void setBackGround(Graphics a) {
        a.setColor(Color.yellow);
        a.fillRect(0, 0, WIDTH, WIDTH);
    }

    private static void drawLines(Graphics g, int x1, int y1, int x2, int y2, int width) {

        g.drawLine(x1, 0, x2, width);
        g.drawLine(x1 *2, 0, x2*2, width );
        g.drawLine(0, y1, width, y2);
        g.drawLine(0, 2*y1, width, 2*y2);

        if(y2 > 1) {

            g.translate((int)(width * third), 0);
            drawLines(g, (int)(x1*third), (int)(y1* third), (int)(x2 * third), (int)(y2* third), (int)(width *third));
            //g.translate(0, (int)(width * third));
            //drawLines(g, (int)(x1*third), (int)(y1* third), (int)(x2 * third), (int)(y2* third), (int)(width *third));
        }

    }



    private static void drawLines2(Graphics g, int x1, int y1, int x2, int y2, int width) {

        g.drawLine(x1, 0, x2, width);
        g.drawLine(x1 *2, 0, x2*2, width );
        g.drawLine(0, y1, width, y2);
        g.drawLine(0, 2*y1, width, 2*y2);

        if(y2 > 1) {
            g.translate(0, (int)(width * third));
            drawLines2(g, (int)(x1*third), (int)(y1* third), (int)(x2 * third), (int)(y2* third), (int)(width *third));

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