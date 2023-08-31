import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Calculator {
    public double first_num;
    public double result;
    public String operator;

    public Calculator(){
        Window window = new Window("Bruno", 0, 0, 0);
        Display display = new Display(68, 68, 68);
        Button buttonDivision = new Button("÷", 20, 180, 50, 50, 213, 213, 213, 0, 0, 0);
        Button buttonMultiplication = new Button("x", 90, 180, 50, 50, 213, 213, 213, 0, 0, 0);
        Button buttonSubtration = new Button("-", 160, 180, 50, 50, 213, 213, 213, 0, 0, 0);
        Button buttonPlus = new Button("+", 230, 180, 50, 50, 213, 213, 213, 0, 0, 0);
        Button button7 = new Button("7", 20, 250, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button8 = new Button("8", 90, 250, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button9 = new Button("9", 160, 250, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button4 = new Button("4", 20, 320, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button5 = new Button("5", 90, 320, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button6 = new Button("6", 160, 320, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button1 = new Button("1", 20, 390, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button2 = new Button("2", 90, 390, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button3 = new Button("3", 160, 390, 50, 50, 64, 64, 64, 255, 255, 255);
        Button buttonPoint = new Button(".", 160, 460, 50, 50, 64, 64, 64, 255, 255, 255);
        Button button0 = new Button("0", 20, 460, 120, 50, 64, 64, 64, 255, 255, 255);
        Button buttonAc = new Button("C", 230, 250, 50, 120, 64, 64, 64, 255, 255, 255);
        Button buttonEquals = new Button("=", 230, 390, 50, 120, 255, 215, 0, 255, 255, 255);

        // Add the components
        window.add(display);
        window.add(buttonDivision);
        window.add(buttonMultiplication);
        window.add(buttonSubtration);
        window.add(buttonPlus);
        window.add(button7);
        window.add(button8);
        window.add(button9);
        window.add(button4);
        window.add(button5);
        window.add(button6);
        window.add(button7);
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button0);
        window.add(buttonPoint);
        window.add(buttonAc);
        window.add(buttonEquals);

        // Events --> Connect the JButton with JTextField
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + "9");
            }
        });
        buttonPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(display.getText() + ".");
            }
        });
        buttonAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                display.setText(null);
            }
        });
        // Buttons Operators
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                first_num = Double.parseDouble(display.getText());
                display.setText("");
                operator = "+";
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                first_num = Double.parseDouble(display.getText());
                display.setText("");
                operator = "/";
            }
        });
        buttonSubtration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                first_num = Double.parseDouble(display.getText());
                display.setText("");
                operator = "-";
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                first_num = Double.parseDouble(display.getText());
                display.setText("");
                operator = "*";
            }
        });
        // Button Equals
        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                double second_num = Double.parseDouble(display.getText());
                String answer;
                if (operator.equalsIgnoreCase("+")) {
                    result = first_num + second_num;
                    answer = String.format("%.2f", result);
                    display.setText(answer);
                }
                if (operator.equalsIgnoreCase("-")) {
                    result = first_num - second_num;
                    answer = String.format("%.2f", result);
                    display.setText(answer);
                }
                if (operator.equalsIgnoreCase("*")) {
                    result = first_num * second_num;
                    answer = String.format("%.2f", result);
                    display.setText(answer);
                }
                if (operator.equalsIgnoreCase("/")) {
                    result = first_num / second_num;
                    answer = String.format("%.2f", result);
                    display.setText(answer);
                }
            }
        });
    }
}
