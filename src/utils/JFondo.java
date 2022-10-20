package utils;

import javax.swing.*;
import java.awt.*;


/**
 * Clase para establecer un JPanel con fondo
 */
public class JFondo extends JPanel {


    private ImageIcon fondo;
    String url;

    //url de la imagen
    public JFondo(String url) {
        this.url = url;
    }

    /**
     * Metodo abstracto que permite re dibujar o sobre escribir los componentes que esten encima del JPanel
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        fondo = new ImageIcon(getClass().getResource(url));

        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

}
