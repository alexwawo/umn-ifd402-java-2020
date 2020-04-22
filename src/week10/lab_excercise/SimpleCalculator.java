package week10.lab_excercise;

import week10.celcius_converter.CelsiusConverterGUI;

import javax.swing.*;

public class SimpleCalculator extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton getSumButton;
    private JPanel mainPanel;

    SimpleCalculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new SimpleCalculator("Simple Calculator");
        frame.setVisible(true);
    }
}
