package herramientas;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class CargadorRecursos {

    public static BufferedImage cargarImagen(String ruta){
        BufferedImage imagenTemporal = null;

        try {
            imagenTemporal = ImageIO.read(ClassLoader.class.getResource(ruta));
        }catch (IOException e) {
            e.printStackTrace();
        }

        return imagenTemporal;

    }
}
