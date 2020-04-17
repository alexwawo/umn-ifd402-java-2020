package week10.swing_gui;

import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Window Utama");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLocation(200,200);
        frame.setVisible(true);
    }
}
