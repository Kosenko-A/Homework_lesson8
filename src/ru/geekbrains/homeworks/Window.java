package ru.geekbrains.homeworks;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window(){
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(60, 60, 400, 600);
        setBackground(new Color(151,144,222));
        setVisible(true);
        JButton jb[] = new JButton[20];

        setLayout( new GridLayout(2,1));

        JPanel inputPanel = new JPanel(new BorderLayout());
        JTextField inputField = new JTextField();
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputField.setEditable(false);
        add(inputPanel);

        ButtonListener buttonListener = new ButtonListener(inputField);


        JPanel buttons = new JPanel(new GridLayout(5,4));
        buttons.setBackground(new Color(151,144,222));


        for (int i = 1; i <=3; i++) {
            jb[i] = new JButton(String.valueOf (i));
            jb[i].addActionListener(buttonListener);
            buttons.add(jb[i]);

        }
            jb[4] = new JButton("+");
            jb[4].addActionListener(buttonListener);
        buttons.add(jb[4]);

        for (int i = 5; i <=7; i++) {
            jb[i-1] = new JButton(String.valueOf(i-1));
            jb[i-1].addActionListener(buttonListener);
            buttons.add(jb[i-1]);
        }
            jb[8] = new JButton("-");
            jb[8].addActionListener(buttonListener);
        buttons.add(jb[8]);

        for (int i = 9; i <=11; i++) {
            jb[i-2] = new JButton(String.valueOf (i-2));
            jb[i-2].addActionListener(buttonListener);
            buttons.add(jb[i-2]);
        }
            jb[12] = new JButton("*");
            jb[12].addActionListener(buttonListener);
        buttons.add(jb[12]);

            jb[13] = new JButton("C");
            jb[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        buttons.add(jb[13]);

            jb[14] = new JButton(String.valueOf(0));
            jb[14].addActionListener(buttonListener);
        buttons.add(jb[14]);
            jb[15] = new JButton("=");
            jb[15].addActionListener(buttonListener);
        buttons.add(jb[15]);
            jb[16] = new JButton("/");
            jb[16].addActionListener(buttonListener);
        buttons.add(jb[16]);

        add(buttons);



        setVisible(true);
    }

}
