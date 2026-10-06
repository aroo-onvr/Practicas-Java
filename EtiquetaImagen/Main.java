package EtiquetaImagen;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        EtiquetaImg v1 = new EtiquetaImg();
        v1.setVisible(true);
        v1.setSize(300, 300);
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}