package herramientas;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class TransformadorImagenes {

    public static BufferedImage escalarImagen(BufferedImage imagenOriginal, double proporcionX, double proporcionY){
        int ancho = imagenOriginal.getWidth();
        int alto = imagenOriginal.getHeight();

        BufferedImage imagenEscalada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        AffineTransform transformador = new AffineTransform();
        transformador.scale(proporcionX,proporcionY);

        AffineTransformOp operacion = new AffineTransformOp(transformador, AffineTransformOp.TYPE_BILINEAR);

        imagenEscalada = operacion.filter(imagenOriginal,imagenEscalada);

        return imagenEscalada;
    }

    public static BufferedImage escalarImagen(BufferedImage imagenOriginal, double proporcion){
        int ancho = imagenOriginal.getWidth();
        int alto = imagenOriginal.getHeight();

        BufferedImage imagenEscalada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);

        AffineTransform transformador = new AffineTransform();
        transformador.scale(proporcion,proporcion);

        AffineTransformOp operacion = new AffineTransformOp(transformador, AffineTransformOp.TYPE_BILINEAR);

        imagenEscalada = operacion.filter(imagenOriginal,imagenEscalada);

        return imagenEscalada;
    }
}
