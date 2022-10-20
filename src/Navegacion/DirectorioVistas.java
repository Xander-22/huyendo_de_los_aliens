package Navegacion;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import inventario.Objeto;

public class DirectorioVistas {

    public static Vista obtenerVista(final int numeroVista){
        Vista vista = null;

        switch(numeroVista){
            case 0:
                vista = new Vista(numeroVista, new Salida[]{},new Objeto[]  {});
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }

        return vista;
    }
}
