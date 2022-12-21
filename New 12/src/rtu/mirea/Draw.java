package rtu.mirea;

import javax.swing.*;
import java.awt.*;

public class Draw extends JComponent {
    int x, y;
    String figure;
    char col1, col2, col3;
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color color = new Color(col1, col2, col3);
        if (figure.equals("Rect")) {
            g2.drawRect(x, y, 20, 10);
            g.fillRect(x, y, 20, 10);
        }
        else if (figure.equals("Oval")) {
            g.drawOval(x, y, 20 , 10);
            g.fillOval(x, y, 20 , 10);
        }
        else if (figure.equals("Circle")) {
            g.drawOval(x, y, 20 , 20);
            g.fillOval(x, y, 20 , 20);
        }
        g.setColor(color);
    }
    public void Date(int x, int y, char col1, char col2, char col3, String figure) {
        this.x = x;
        this.y = y;
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.figure = figure;
    }
}
