import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TwoTriangles {


    static int HEIGHT = 640;

    static final double degrees = 30.0;
    static final double radians = Math.toRadians(degrees);
    static final int hei = HEIGHT/2;
    static final double side = hei / Math.cos(radians);
    static double WIDTH = side * 2;
    static final double wid = WIDTH/2;


    public static void mainDraw(Graphics g) {
        setBackGround(g);
        g.setColor(Color.BLACK);
        int xxp[] = {0, (int)(WIDTH), (int)(wid)};
        int yyp[] = {0, 0, HEIGHT};
        g.drawPolygon(xxp, yyp, 3);

        triangles(g, 0, 1, 1, (int)(wid), side);
    }

    public static void setBackGround(Graphics a) {
        a.setColor(Color.WHITE);
        a.fillRect(0, 0, (int)(WIDTH), (int)(WIDTH));
    }

    public static void triangles(Graphics g, int i, double magic, double MAGIC, int x1, double Side) {
        int xp[] = {(int)(x1 * magic), (int)(x1 - Side/2 * magic), (int)(x1+Side/2 * magic)};
        int yp[] = {0, (int)(hei * MAGIC), (int)(hei * MAGIC)};
        g.drawPolygon(xp,yp,3);
        i++;

        if (i < 6) {
            triangles(g, i, magic/2, MAGIC/2, x1,Side /2);
            triangles(g, i, magic*3/2, MAGIC/2, x1,Side /2);

        }
    }




    // Don't touch the code below



    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension((int)(WIDTH), HEIGHT));
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