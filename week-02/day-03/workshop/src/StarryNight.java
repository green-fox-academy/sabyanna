import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics g) {

        g.setColor(new Color(11, 20, 45));
        g.fillRect(0, 0, 320, 320);







        for (int i = 0; i < 100; i++) {
            star(((int) (Math.random() * 320)), ((int) (Math.random() * 320)), ((int) (Math.random() * 4 + 1)), g);
        }

        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)



    }

    public static void star(int x, int y, int size, Graphics a) {
        int yellow = (int) (Math.random() * 255);
        a.setColor(new Color(yellow, yellow, 0 ));
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