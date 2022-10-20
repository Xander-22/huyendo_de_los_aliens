package maquina_estado;

import java.awt.*;

public class MaquinaEstado {

    private final Estado[] estados;
    private Estado estadoActual;


    public MaquinaEstado(){
        estados = new Estado[1];

        estados[0] = new EstadoJuego();

        estadoActual=estados[0];
    }

    public void actualizar(){
        estadoActual.actualizar();

    }

    public void dibujar(final Graphics g){
        estadoActual.dibujar(g);

    }
}
