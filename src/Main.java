import viewController.GameManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        runIndex();
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