package viewController;

import utils.JFondo;
import utils.UtilitiesOfIcon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class GameManager extends JFrame {
    JPanel spaceMap = new JFondo("/resource/wallpaper/spaceMap.jpg");
    JPanel navBar = new JFondo("/resource/wallpaper/spaceNavBar.jpeg");
    JButton exitButton = new JButton();

    public GameManager(){
        //setupView();
        getContentPane().add(new JFondo(""));
        //setContentPane(spaceMap);
    }

    public void setupView() {
        spaceMap.setLayout(null);
        spaceMap.setSize(700, 500);
        //loadTopNavBarComponents();
        loadExitButtonComponents();
        spaceMap.add(navBar);
    }

    private void loadTopNavBarComponents() {
        navBar.setLayout(null);
        navBar.setSize(1250, 30);
        navBar.setOpaque(true);
        addView1ToView2(navBar, spaceMap);
    }

    private void loadExitButtonComponents() {
        exitButton.setLocation(1220, 0);
        exitButton.setSize(30, 30);
        exitButton.setIcon(UtilitiesOfIcon.getIcon("/resource/icon/Close_Icon.png",exitButton.getWidth(), exitButton.getHeight()));
        addView1ToView2(exitButton, spaceMap);
        loadExitButtonAction();
    }

    private void loadExitButtonAction() {
        ActionListener exitAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int selection = JOptionPane.showConfirmDialog(null, "¿Desea salir de la App?", "WARNING", JOptionPane.YES_NO_OPTION, 1, UtilitiesOfIcon.getIcon("/resource/icon/exit_door.png", 50, 50));
                if (selection == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        };
        exitButton.addActionListener(exitAction);
    }

    private void addView1ToView2(Component view1, JComponent view2) {
        view2.add(view1);
    }

}

