package rtu.mirea;

import javax.swing.*;
import java.awt.*;

public class Country extends JFrame {
    String[] country = {"Australia", "China", "England", "Russia"};
    String[] information = {"Information about Australia", "Information about China", "Information about England", "Information about Russia"};
    JComboBox<String> comboBox = new JComboBox<>(country);
    JTextArea textArea;

    public Country() {
        super("Countries");
        setSize(700,500);
        setLayout(new FlowLayout());
        comboBox.setBounds(50,50,90,20);
        add(comboBox);
        textArea = new JTextArea(getInformation(comboBox.getSelectedIndex()),10,20);
        add(textArea);
        comboBox.addItemListener(e -> {
            textArea.setText(getInformation(comboBox.getSelectedIndex()));
        });
    }

    public String getInformation(int i) {
        return information[i];
    }
}
