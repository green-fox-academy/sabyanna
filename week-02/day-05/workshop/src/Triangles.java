import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        backgroundColor(g);

        double degrees = 30.0;
        double radians = Math.toRadians(degrees);


        double height = Math.cos(radians) * 640;




        double Mheight = height/20;
        int Mwidth = WIDTH / 20;
        int Wfel = WIDTH / 2;

        for (int i = 0; i <= 20; i++)   {
            drawline(g, (int)(i*Mwidth/2), (int)(height-i*Mheight), WIDTH-i*Mwidth/2, (int)(height-i*Mheight));
        }

        for (int i = 0; i <= 20; i++)   {
            drawline(g, i*Mwidth, (int)(height), Wfel + i*Mwidth/2, (int)(i*Mheight));
        }

        for (int i = 0; i <= 20; i++)   {
            drawline(g, i*Mwidth/2, (int)(height - i*Mheight), i*Mwidth, (int)(height));
        }




        /*
        for (int i = 0; i <= fel; i+=tener) {
            drawlineGreen(g, i, fel, fel, fel-i);
        }
         */










    }


    public static void drawline(Graphics a, int x1, int y1, int x2, int y2) {
        a.setColor(Color.BLACK);
        a.drawLine(x1, y1, x2, y2);
    }

    public static void backgroundColor(Graphics a) {
        a.setColor(Color.BLACK);
        a.fillRect(WIDTH, 0, WIDTH, WIDTH);
    }

    // Don't touch the code below



    static int WIDTH = 640;
    static int HEIGHT = 640 ;
    ;

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