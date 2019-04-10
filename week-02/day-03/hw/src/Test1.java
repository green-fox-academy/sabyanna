import javax.swing.*;
import java.awt.*;


public class Test1 extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);

        //draw a line - x1, y1, x2, y2 (coordinates of 1st and 2nd point
        g.setColor(Color.BLUE);
        g.drawLine(10, 25, 200, 45);

        //draws empty rectange
        g.setColor(Color.RED);
        g.drawRect(10, 55, 100, 30);

        //fill == draw
        //draw oval - x, y, width, height (rounds the corners
        g.setColor(Color.GREEN);
        g.fillOval(10, 95, 100, 30);

        //3d rectangle, raised==do you want 3d look or not
        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 50, true);

    }
}
