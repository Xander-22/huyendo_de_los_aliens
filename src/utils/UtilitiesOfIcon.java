package utils;

import javax.swing.*;
import java.awt.*;

public class UtilitiesOfIcon {

    //public UtilitiesOfIcon(){}

    public static Icon getIcon(String url, int width, int height){
        ImageIcon imageIcon = new ImageIcon(UtilitiesOfIcon.class.getResource(url));
        imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        return imageIcon;
    }

}
