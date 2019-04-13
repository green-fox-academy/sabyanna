import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {







    static int WIDTH = 640;
    static int HEIGHT = 640;

    static final double degrees = 30.0;
    static final double radians = Math.toRadians(degrees);
    static final int len = 45;
    static final double magic = Math.cos(radians) * len;
    static final int wid = WIDTH/2;





    public static void mainDraw(Graphics g) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.

        setBackGround(g);

        g.setColor(Color.BLACK);



        drawHexagons(g, 0, 0.0, 0.0);



    }

    public static void setBackGround(Graphics a) {
        a.setColor(Color.WHITE);
        a.fillRect(0, 0, WIDTH, WIDTH);
    }


    private static void drawHexagons(Graphics g, int i, double Magic, double mAgic) {

        /*
        double degrees = 30.0;
        double radians = Math.toRadians(degrees);
        int len = 45;
        double magic = Math.cos(radians) * len;
        int wid = WIDTH/2;

         */


        int xp[] = {(int)(wid - len/2+mAgic), (int)(wid + len/2+mAgic), (int)(wid +len+mAgic), (int)(wid +len/2+mAgic), (int)(wid - len/2+mAgic), (int)(wid - len+mAgic) };
        int yp[] = {(int)(wid-magic+Magic), (int)(wid - magic+Magic), (int)(wid+Magic), (int)(wid + magic+Magic), (int)(wid + magic+Magic), (int)(wid+Magic)};

        g.drawPolygon(xp, yp, 6);
        i++;
        if (i < 4) {
            drawHexagons(g,i, Magic-2*magic, mAgic);
            drawHexagons(g,i, Magic+2*magic, mAgic);
            drawHexagons(g,i, Magic-magic, mAgic+len*3/2);
            drawHexagons(g,i, Magic-magic, mAgic-len*3/2);
            drawHexagons(g,i, Magic+magic, mAgic-len*3/2);
            drawHexagons(g,i, Magic+magic, mAgic+len*3/2);


        }

        /*
        int xp[] = {wid - len/2, wid + len/2, wid +len, wid +len/2, wid - len/2, wid - len };
        int yp[] = {(int)(wid-magic), (int)(wid - magic), wid, (int)(wid + magic), (int)(wid + magic), (int)(wid)};
         */


        //int w = WIDTH/2;
        //int len = 60;


        //int xp[] = (w-len/2, );
        //int yp[] = (w-magic, );
        //int np[] = (6);










    }



    // Don't touch the code below



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