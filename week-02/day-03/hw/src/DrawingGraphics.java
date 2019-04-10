import javax.swing.*;
import java.awt.*;

public class DrawingGraphics  extends JPanel {

        public void paintComponent(Graphics g) {
            //g is used to set color stb we manipulate the object
            //paintCOmponent is built in method

            super.paintComponent(g);
            //calls the superclasses' paintComponent

            this.setBackground(Color.WHITE);

            g.setColor(Color.BLUE);  //all caps means sth in java

            //drawing solid rectangle, balfent 0,0 - x, y, width, height
            g.fillRect(25, 25, 100, 30);

            g.setColor(new Color(190,81,215));
            g.fillRect(25, 65, 100, 30);

            //draw strings or text on the screen
            g.setColor(Color.RED);
            g.drawString("this is some text", 25, 120);

        }

    }
