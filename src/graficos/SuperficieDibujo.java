package graficos;

import Principal.Configuracion;
import control.Raton;
import maquina_estado.MaquinaEstado;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class SuperficieDibujo extends Canvas {

    private static final long serialVersionUID = -3630376556669814524L;

    private BufferStrategy buffer;
    private Graphics g;
    private BufferedImage imagen;

    private Raton raton;

    public SuperficieDibujo(){

        raton = new Raton(this);
        setCursor(raton.cursor);
        addMouseListener(raton);

        setPreferredSize(new Dimension(Configuracion.ancho, Configuracion.alto));
    }
    public void actualizar(final MaquinaEstado maquinaEstado) {
        maquinaEstado.actualizar();
    }

    public void dibujar(final MaquinaEstado maquinaEstado){
        buffer = getBufferStrategy();

        if (buffer==null){
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        maquinaEstado.dibujar(g);


        if (Configuracion.modoDeBug){

        }

        g.dispose();

        buffer.show();

    }


}
