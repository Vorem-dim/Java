package rtu.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    private int Milcount = 0, Madcount = 0;
    private JButton button1 = new JButton("AC Milan");
    private JButton button2 = new JButton("Real Madrid");
    private JLabel label1 = new JLabel("Result: 0 x 0");
    private JLabel label2 = new JLabel("Last Score: N/A");
    private JLabel label3 = new JLabel("Winner: DRAW");
    private JPanel[] pnl = new JPanel[8];
    private Font fnt = new Font("Times new roman",Font.BOLD,20);
    Match() {
        super("Milan vs Madrid");
        setSize(350,200);
        setLayout(new GridLayout(5,2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(255,255,255));
            add(pnl[i]);
        }
        pnl[0].setLayout(new FlowLayout());
        pnl[0].add(label1);
        pnl[2].setLayout(new FlowLayout());
        pnl[2].add(label2);
        pnl[4].setLayout(new FlowLayout());
        pnl[4].add(label3);
        pnl[6].setLayout(new FlowLayout());
        pnl[6].add(button1);
        pnl[7].setLayout(new FlowLayout());
        pnl[7].add(button2);
        button1.addActionListener(new ButtonListener1());
        button2.addActionListener(new ButtonListener2());
    }
    class ButtonListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Milcount++;
            label1.setText("Result " + Milcount + " x " + Madcount);
            label2.setText("Last Score: AC Milan");
            if (Milcount > Madcount)
                label3.setText("Winner: AC Milan");
            else if (Milcount < Madcount)
                label3.setText("Winner: Real Madrid");
            else
                label3.setText("Winner: DRAW");
        }
    }class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Madcount++;
            label1.setText("Result " + Milcount + " x " + Madcount);
            label2.setText("Last Score: Real Madrid");
            if (Milcount > Madcount)
                label3.setText("Winner: AC Milan");
            else if (Milcount < Madcount)
                label3.setText("Winner: Real Madrid");
            else
                label3.setText("Winner: DRAW");
        }
    }

}
