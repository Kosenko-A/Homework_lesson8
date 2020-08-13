package ru.geekbrains.homeworks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;

public class ButtonListener implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder sb = new StringBuilder();
    private  int operation;
    public double val;

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttons = (JButton) e.getSource();
        double val1 = Double.parseDouble(buttons.getText());
        sb.append(inputField.getText()).append(buttons.getText());
        inputField.setText(sb.toString());
        sb.setLength(0);

        if (e.getActionCommand().charAt(0)>='0' && e.getActionCommand().charAt(0)<='9'){
            val = Double.parseDouble(buttons.getText());
            sb.append(inputField.getText()).append(buttons.getText());
            inputField.setText(sb.toString());
            sb.setLength(0);
        } else if (e.getActionCommand().charAt(0) == '=') {
            operation = 0;
        } else if (e.getActionCommand().charAt(0) == '+') {
            operation = 1;
        } else if (e.getActionCommand().charAt(0) == '-') {
            operation = 2;
        } else if (e.getActionCommand().charAt(0) == '*') {
            operation = 3;
        } else if (e.getActionCommand().charAt(0) == '/') {
            operation = 4;
        }


        switch (operation){

            case 1:
                double result = val1 + val;
                inputField.setText(String.valueOf(result));
                break;
            case 2:
                result = val1 - Double.parseDouble(buttons.getText());
                inputField.setText(String.valueOf(result));
                break;
            case 3:
                result = val1 * Double.parseDouble(buttons.getText());
                inputField.setText(String.valueOf(result));
                break;
            case 4:
                result = val1 / Double.parseDouble(buttons.getText());
                inputField.setText(String.valueOf(result));
                break;
        }
    }
    /*private void pressedNumber (String number, int operation){
        if (operation == 0){

        }
    }*/
}
