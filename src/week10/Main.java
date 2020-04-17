package week10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame container = new JFrame("Window Utama");
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(300,100);
        container.setLocation(200,200);
        container.setVisible(true);
    }
}
