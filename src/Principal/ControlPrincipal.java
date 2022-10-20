package Principal;

import graficos.SuperficieDibujo;
import graficos.Ventana;
import maquina_estado.MaquinaEstado;

public class ControlPrincipal {

    private static boolean enFuncionamiento = false;
    private static int aps = 0;
    private static int fps = 0;
    public static SuperficieDibujo superficieDibujo;
    public static Ventana ventana;
    public static MaquinaEstado maquinaEstado;

    public static void main(String[] args) {

        iniciarJuego();
        iterarBuclePrincipal();

    }

    private static void iniciarJuego() {
        enFuncionamiento = true;
        superficieDibujo = new SuperficieDibujo();
        ventana = new Ventana();
        maquinaEstado = new MaquinaEstado();
    }

    private static void detenerJuego() {
        enFuncionamiento = false;

        System.exit(0);
    }

    private static void actualizar(){
        superficieDibujo.actualizar(maquinaEstado);
        aps++;
    }

    private static void dibujar(){
        superficieDibujo.dibujar(maquinaEstado);
        fps++;
    }

    private static void iterarBuclePrincipal(){
        final int NS_POR_SEGUNDO = 1000000000;
        final int APS_OBJETIVO = 60;
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;

        long tiempoReferenciaActualizacion = System.nanoTime();
        long tiempoReferenciaContador = System.nanoTime();

        double tiempoSinProcesar;
        double delta=0;

        while (enFuncionamiento){
            long tiempoIncial = System.nanoTime();
            tiempoSinProcesar = tiempoIncial - tiempoReferenciaActualizacion;
            tiempoReferenciaActualizacion = tiempoIncial;

            delta += tiempoSinProcesar / NS_POR_ACTUALIZACION;

            while (delta >= 1){
                actualizar();
                dibujar();
                delta--;

            }


            if (System.nanoTime() - tiempoReferenciaContador >= NS_POR_SEGUNDO){
                System.out.println("APS: " + aps + " FPS: " + fps);

                tiempoReferenciaContador = System.nanoTime();

                aps = 0;
                fps = 0;
            }
        }
    }



}
