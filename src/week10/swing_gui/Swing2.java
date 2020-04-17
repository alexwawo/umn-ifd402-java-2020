package week10.swing_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("title");
        JPanel panel = new JPanel();
        JButton button = new JButton("Press Me");

        panel.add(button);
        frame.setContentPane(panel);
        frame.setSize(300, 200);
        frame.setLocation(200,200);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You pressed a button");
            }
        });
    }
}
