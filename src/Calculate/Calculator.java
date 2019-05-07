package Calculate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public static void calculate() {

    JFrame frame = new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(260,150);
    JPanel contents = new JPanel(new VerticalLayout());
    JTextField first = new JTextField(5);
    JTextField operator = new JTextField(1);
    JTextField second = new JTextField(5);
    JButton button = new JButton("Count");
    JOptionPane.showMessageDialog(contents,"<html><i>Hello!\nWelcome to the calculator!\nEnter the first value, operator and second value.");
    contents.add(first);
    contents.add(operator);
    contents.add(second);
    contents.add(button);
    frame.setContentPane(contents);
    frame.setVisible(true);

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("\n\n");
                int a = getInt(first.getText());
                System.out.println("Operator: " + operator.getText());
                int b = getInt(second.getText());
                 JOptionPane.showInputDialog("Result: ",calc(a,b,operator.getText()));
            }
        };

        button.addActionListener(buttonListener);

        ActionListener firstListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("First number: " + first.getText());
            }
        };

        first.addActionListener(firstListener);

        ActionListener secondListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Second number: " + second.getText());
            }
        };

        second.addActionListener(secondListener);

        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operator: " + operator.getText());
            }
        };

        operator.addActionListener(operatorListener);


    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                calculate();
            }
        });
    }

    public static int calc(int first, int second, String operator){
        int result = 0;
        switch(operator){
            case "*":
                result = first * second;
                System.out.println("Multiplication result: " + result);
                return result;
            case "/":
                result = first / second;
                System.out.println("Dividing result: " + result);
                return result;
            case "+":
                result = first + second;
                System.out.println("Result of addition: " + result);
                return result;
            case "-":
                result = first - second;
                System.out.println("Subtraction result: " + result);
                return result;
            case "%":
                result = (int)Math.pow(first,second);
                System.out.println("Result of exponentiation: " + result);
                return result;
        }
        return result;
    }

    public static int getInt(String x){
        int a = Integer.parseInt(x);
        System.out.println("Assigned value: " + a);
        return a;
    }

}
