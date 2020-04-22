package week10.demokelas;

import javax.swing.*;

public class Demo extends JFrame{
    private JTextField textFieldName;
    private JTextField textFieldPOB;
    private JCheckBox eatingCheckBox;
    private JCheckBox sleepingCheckBox;
    private JPanel panelUtama;

    Demo(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelUtama);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new Demo("Demo Kelas");
        frame.setVisible(true);
    }
}
