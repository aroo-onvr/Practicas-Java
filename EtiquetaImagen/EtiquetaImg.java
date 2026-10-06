package EtiquetaImagen;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EtiquetaImg extends JFrame{
    private final JLabel etiqueta;
    private final JLabel etiqueta2;

    public EtiquetaImg() {
        super("Etiquetas con Imagen");
        setLayout(new FlowLayout());

        Icon imagen = new ImageIcon(getClass().getResource("imagen2.png"));
        etiqueta = new JLabel("Gato Fresa:", imagen, SwingConstants.LEFT);
        add(etiqueta);

        Icon imagen2 = new ImageIcon(getClass().getResource("imagen1.png"));
        etiqueta2 = new JLabel("Gato Lentes:", imagen2, SwingConstants.LEFT);
        add(etiqueta2);
    }
}