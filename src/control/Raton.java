package control;

import Principal.Configuracion;
import Principal.ControlPrincipal;
import graficos.SuperficieDibujo;
import herramientas.CargadorRecursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;

public class Raton extends MouseAdapter {

    public Cursor cursor;


    public Raton(final SuperficieDibujo sd){
        estabblecerCursor(Configuracion.rutaCursor);

    }

    public Point obtenerPosicion (){
        final Point posicion = MouseInfo.getPointerInfo().getLocation();

        SwingUtilities.convertPointFromScreen(posicion, ControlPrincipal.superficieDibujo);

        return posicion;
    }

    public void estabblecerCursor(final String ruta){

        final Toolkit configuracion = Toolkit.getDefaultToolkit();

        final BufferedImage iconoPersonaje = CargadorRecursos.cargarImagen(ruta);

        Configuracion.ladoCursor=iconoPersonaje.getWidth();

        final Point punta = new Point(0,0);

        cursor = configuracion.createCustomCursor(iconoPersonaje,punta,"Personaje");

    }

}
