package np.edu.scst.shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.*;

public class Shape extends JFrame {

    Shape() {
        JPanel jPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                //because in g.create() it is returning Grahpics as data type so no new keyword
                Graphics2D g2 = (Graphics2D) g.create();
                //          x1,y1,x2,y2
                g2.drawLine(1, 1, 45, 45);
                g2.setColor(Color.red);
                g2.drawLine(50, 50, 100, 100);

                //          x1    y1  width  height
                g2.drawRect(210, 250, 300, 450);
                g2.drawRect(100, 150, 300, 450);

                g2.drawOval(300, 40, 400, 80);
                g2.drawOval(50, 200, 150, 130);

                //polygon - pentagon
                int[] x = {20, 50, 50, 10, 10};
                int[] y = {10, 25, 50, 50, 25};

                g2.drawPolygon(x, y, 5);

            }
        };
        add(jPanel);

        setVisible(true);
        setSize(700, 700);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Shape();
    }

}
