import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {

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



    drawRect(g, 0, 0, 640);

  }

  public static void setBackGround(Graphics a) {
    a.setColor(Color.YELLOW);
    a.fillRect(0, 0, WIDTH, WIDTH);
  }


  private static void drawRect(Graphics g, int x, int y, int scale) {
    g.drawRect(x, y, scale, scale);
    if (scale > 2) {
      drawRect(g, x+ scale / 3, y, scale/3);
      drawRect(g, x, y + scale / 3, scale/3);
      drawRect(g, x + scale / 3, y + scale / 3 * 2, scale/3);
      drawRect(g, x + scale / 3 * 2, y + scale / 3, scale/3);
    }

  }


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
