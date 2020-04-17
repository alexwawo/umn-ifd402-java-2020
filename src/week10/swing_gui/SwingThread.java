package week10.swing_gui;

import javax.swing.*;

// https://www.youtube.com/watch?v=jUEOWVjnIR8

public class SwingThread {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Hello World Swing!");
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
