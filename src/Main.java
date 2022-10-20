import utils.JFondo;
import viewController.GameManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("");
        f.getContentPane().add(new JFondo(""));
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setVisible(true);
        //runIndex();
    }

    public static void runIndex(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame index = new GameManager();
                index.setSize(1250, 600);
                index.setLocation(60, 100);
                index.setUndecorated(true);
                index.setVisible(true);
            }
        });
    }
}