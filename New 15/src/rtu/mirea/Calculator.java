package rtu.mirea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame {
    private Stack<String> operations = new Stack<>();
    private Stack<Integer> operands = new Stack<>();
    private JTextArea textArea = new JTextArea(1,7);
    private JPanel[] panels = new JPanel[20];
    private JButton[] buttons = {new JButton("7"), new JButton("8"), new JButton("9"), new JButton("/"), new JButton("4"),
            new JButton("5"), new JButton("6"), new JButton("*"), new JButton("1"), new JButton("2"), new JButton("3"),
            new JButton("-"), new JButton("0"), new JButton("."), new JButton("="), new JButton("+")};
    private String number = "";

    public Calculator(){
        super("Calculator");
        setSize(350,350);
        setLayout(new GridLayout(5,4));
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setBackground(new Color(161, 171, 171));
            add(panels[i]);
            if (i == 1) {
                panels[i].setLayout(new FlowLayout());
                panels[i].add(textArea);
           }
            if (i >= 4) {
                panels[i].setLayout(new FlowLayout());
                panels[i].add(buttons[i - 4]);
            }
        }
        buttons[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("0");
                number += '0';
            }
        });
        buttons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("1");
                number += '1';
            }
        });
        buttons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("2");
                number += '2';
            }
        });
        buttons[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("3");
                number += '3';
            }
        });
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("4");
                number += '4';
            }
        });
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("5");
                number += '5';
            }
        });
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("6");
                number += '6';
            }
        });
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("7");
                number += '7';
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("8");
                number += '8';
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("9");
                number += '9';
            }
        });
        buttons[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(".");
                number += '.';
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("/");
                if (!number.equals("")) {
                    operands.push(Integer.parseInt(number));
                    number = "";
                }
                Count("/");
            }
        });
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("*");
                if (!number.equals("")) {
                    operands.push(Integer.parseInt(number));
                    number = "";
                }
                Count("*");
            }
        });
        buttons[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("-");
                if (!number.equals("")) {
                    operands.push(Integer.parseInt(number));
                    number = "";
                }
                Count("-");
            }
        });
        buttons[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("+");
                if (!number.equals("")) {
                    operands.push(Integer.parseInt(number));
                    number = "";
                }
                Count("+");
            }
        });
        buttons[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!operations.empty()) {
                    if (!number.equals("")) {
                        operands.push(Integer.parseInt(number));
                        number = "";
                        Count("!");
                        textArea.setText(String.valueOf(operands.peek()));
                    }
                    else
                        System.out.println("Error");
                }
                else {
                    textArea.setText(String.valueOf(operands.peek()));
                }
            }
        });
    }
    private void Count(String oper) {
        if (oper.equals("!")) {
            while (!operations.empty()) {
                oper = operations.pop();
                int result = 0, num2 = operands.pop(), num1 = operands.pop();
                if (oper.equals("+"))
                    result = num1 + num2;
                else if (oper.equals("-"))
                    result = num1 - num2;
                else if (oper.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("Division on 0");
                        System.exit(-1);
                    }
                    else
                        result = num1 / num2;
                }
                else
                    result = num1 * num2;
                operands.push(result);
            }
        }
        else if (operations.empty())
            operations.push(oper);
        else {
            String oper_now = operations.pop();
            if ((oper_now.equals("+") || oper_now.equals("-")) && (oper.equals("*") || oper.equals("/"))) {
                operations.push(oper_now);
                operations.push(oper);
            }
            else {
                operations.push(oper);
                int result = 0, num2 = operands.pop(), num1 = operands.pop();
                if (oper_now.equals("+"))
                    result = num1 + num2;
                else if (oper_now.equals("-"))
                    result = num1 - num2;
                else if (oper_now.equals("/")) {
                    if (num2 == 0) {
                        System.out.println("Division on 0");
                        System.exit(-1);
                    } else
                        result = num1 / num2;
                }
                else
                    result = num1 * num2;
                operands.push(result);
            }
        }
    }
}
