package rtu.mirea;

import javax.swing.*;
import java.awt.*;

public class Anim extends JFrame {
    JLabel[] arrL = {
            new JLabel(new ImageIcon("res/Al1.jpg")),
            new JLabel(new ImageIcon("res/Al2.jpg")),
            new JLabel(new ImageIcon("res/Al3.jpg")),
            new JLabel(new ImageIcon("res/Al4.jpg")),
            new JLabel(new ImageIcon("res/Al5.jpg")),
            new JLabel(new ImageIcon("res/Al6.jpg"))
    };

    private static final int DTIME = 600;

    Anim () {
        super("Зелёна");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        for (JLabel img: arrL) {
            add(img);
        }
        pack();
    }

    public void setVisible(boolean b) {
        super.setVisible(b);
        while (true)
            for (JLabel img: arrL) {
                for (JLabel imgClose: arrL)
                    imgClose.setVisible(false);
                img.setVisible(true);
                try {
                    Thread.sleep(DTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
