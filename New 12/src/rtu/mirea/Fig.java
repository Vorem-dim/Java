package rtu.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Fig extends Shape {
    private JPanel[] pnl = new JPanel[20];
    JFrame frame = new JFrame("Figures");

    public Fig () {
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,4));
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(255,255,255));
            frame.add(pnl[i]);
        }

        int x, y, ran;
        char col1, col2, col3;
        for (int i = 0; i < 20; i++) {
            col1 = (char)(Math.random() % 256);
            col2 = (char)(Math.random() % 256);
            col3 = (char)(Math.random() % 256);
            x = (int)(Math.random() % 20);
            y = (int)(Math.random() % 20);
            ran = (int)(Math.random() % 3);
            switch (ran) {
                case 0:
                    Rect(x, y, col1, col2, col3);
                case 1:
                    Circle(x, y, col1, col2, col3);
                case 2:
                    Oval(x, y, col1, col2, col3);
            }
        }

        frame.setVisible(true);
    }

    @Override
    public void Rect(int x, int y, char col1, char col2, char col3) {
        Draw draw = new Draw();
        draw.Date(x, y, col1, col2, col3, "Rect");
        frame.add(draw);
    }

    @Override
    public void Circle(int x, int y, char col1, char col2, char col3) {
        Draw draw = new Draw();
        draw.Date(x, y, col1, col2, col3, "Circle");
        frame.add(draw);
    }

    @Override
    public void Oval(int x, int y, char col1, char col2, char col3) {
        Draw draw = new Draw();
        draw.Date(x, y, col1, col2, col3, "Oval");
        frame.add(draw);
    }
}
