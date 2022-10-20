package Navegacion;

import Principal.Configuracion;
import herramientas.CargadorRecursos;
import herramientas.TransformadorImagenes;
import inventario.Objeto;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Vista {

    public final int id;
    public BufferedImage imagen;
    public final Salida[] salidas;
    public final Objeto[] objetos;

    public Vista(final int id, final Salida[] salidas, final Objeto[] objetos) {
        this.id = id;
        this.salidas = salidas;
        this.objetos = objetos;
        imagen = null;
    }

    public void diujar(final Graphics g){
        if (imagen==null){
            String ruta = Configuracion.rutaImagenes;
            imagen = CargadorRecursos.cargarImagen(ruta);

            imagen = TransformadorImagenes.escalarImagen(imagen,1);

        }

        g.drawImage(imagen,0,0,null);

        if (Configuracion.modoDeBug){

        }
    }
}
