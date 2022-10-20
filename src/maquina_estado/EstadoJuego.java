package maquina_estado;

import Jugador.Jugador;
import Navegacion.DirectorioVistas;
import Navegacion.Vista;

import java.awt.*;

public class EstadoJuego implements Estado{

    private static Jugador jugador;
    private static Vista vista;

    public EstadoJuego(){
        jugador = new Jugador();
        vista = DirectorioVistas.obtenerVista(0);
    }

    public void actualizar() {

    }

    public void dibujar(Graphics g) {
        vista.diujar(g);
    }
}
