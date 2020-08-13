package ru.geekbrains.homeworks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Double.valueOf;

public class ButtonListener implements ActionListener {
    private final JTextField inputField;
    private final StringBuilder sb = new StringBuilder();


    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double n1 = 0;
        double n2 = 0;

        if (e.getActionCommand().charAt(0) >= '0' && e.getActionCommand().charAt(0) <= '9') {
            sb.append(inputField.getText()).append(e.getActionCommand());
            inputField.setText(sb.toString());
                n1 = parseDouble(String.valueOf(sb.charAt(0)));
            if (n1 != 0) {
                 n2 = parseDouble(String.valueOf(sb.charAt(0)));
            }
            sb.setLength(0);
        } else {
            double result = 0;
            if (e.getActionCommand().equals("+")) {
                sb.append(inputField.getText()).append("+");
                inputField.setText(sb.toString());
                result = calculate (1, n1, n2);
                sb.setLength(0);

            } else if (e.getActionCommand().equals("-")) {
                sb.append(inputField.getText()).append("-");
                inputField.setText(sb.toString());
                result = calculate (2, n1, n2);
                sb.setLength(0);
            } else if (e.getActionCommand().equals("*")) {
                sb.append(inputField.getText()).append("*");
                inputField.setText(sb.toString());
                result = calculate (3, n1, n2);
                sb.setLength(0);
            } else if (e.getActionCommand().equals("/")) {
                sb.append(inputField.getText()).append("/");
                inputField.setText(sb.toString());
                result = calculate (4, n1, n2);
                sb.setLength(0);
            } else if (e.getActionCommand().equals("=")) {
                sb.append(inputField.getText()).append("=").append(result);
                inputField.setText(sb.toString());
                sb.setLength(0);

            }
        }
    }
    private double calculate (int oper, double n1, double n2){
        double res = 0;
        switch (oper){
            case 1:
                res = n1+n2;
                break;
            case 2:
                res = n1-n2;
                break;
            case 3:
                res = n1*n2;
                break;
            case 4:
                res = n1/n2;
                break;
        }
        return res;
    }

}

    /*private void pressedNumber (String value){
        sb.append(inputField.getText()).append(value);
        inputField.setText(sb.toString());
        double n1 = parseDouble(String.valueOf(sb.charAt(0)));
        if (n1 != 0){
            double n2 = parseDouble(String.valueOf(sb.charAt(0)));
        }

        sb.setLength(0);
    }

    private void pressedOperation (String operation){
        if (operation.equals("+")){
            sb.append(inputField.getText()).append("+");
            inputField.setText(sb.toString());

            sb.setLength(0);

        } else if (operation.equals("-")) {
            sb.append(inputField.getText()).append("-");
            inputField.setText(sb.toString());
            sb.setLength(0);
        }else if (operation.equals("*")) {
            sb.append(inputField.getText()).append("*");
            inputField.setText(sb.toString());
            sb.setLength(0);
        }else if (operation.equals("/")) {
            sb.append(inputField.getText()).append("/");
            inputField.setText(sb.toString());
            sb.setLength(0);
        }else if (operation.equals("=")) {
            sb.append(inputField.getText()).append("=");
            inputField.setText(sb.toString());

            sb.setLength(0);
        }
    }*/

