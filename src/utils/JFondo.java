package utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


/**
 * Clase para establecer un JPanel con fondo
 */
public class JFondo extends JPanel implements MouseMotionListener {

    int x, y;
    String texto = "";

    private ImageIcon fondo;
    String url;

    //url de la imagen
    public JFondo(String url) {
        this.url = url;
        addMouseMotionListener(this);
    }

    /**
     * Metodo abstracto que permite re dibujar o sobre escribir los componentes que esten encima del JPanel
     * @param g
     */
    /*@Override
    public void paint(Graphics g) {
        fondo = new ImageIcon(getClass().getResource(url));

        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }*/

    @Override
    public void paint(Graphics g) {
        ImageIcon image = new ImageIcon(getClass().getResource("/resource/icon/astronauta.png"));
        g.drawImage(image.getImage(), x, y, 32, 32, null);
        Font font = new Font("Arial", Font.BOLD, 30);
        g.setFont(font);
        g.drawString(texto, 20, 400);
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        x = (int)mouseEvent.getPoint().getX();
        y = (int)mouseEvent.getPoint().getY();

        texto = "X: " + x + "    Y: " + y;
        System.out.println(texto);
        repaint();
    }
}
