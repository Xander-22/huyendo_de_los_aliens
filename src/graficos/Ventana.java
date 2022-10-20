package graficos;

import Principal.Configuracion;
import Principal.ControlPrincipal;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(Configuracion.nombre);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.add(ControlPrincipal.superficieDibujo, null);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }



}
