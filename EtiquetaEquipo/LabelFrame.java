package EtiquetaEquipo;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
    private JLabel etiqueta1Aaron;
    private JLabel etiqueta2Aaron;
    private JLabel etiqueta3Aaron;
    private JLabel etiqueta4Aaron;

    private JLabel etiqueta1Quique;
    private JLabel etiqueta2Quique;
    private JLabel etiqueta3Quique;
    private JLabel etiqueta4Quique;

    private JLabel etiqueta1Ingrid;
    private JLabel etiqueta2Ingrid;
    private JLabel etiqueta3Ingrid;
    private JLabel etiqueta4Ingrid;

    private JLabel etiqueta1Fernando;
    private JLabel etiqueta2Fernando;
    private JLabel etiqueta3Fernando;
    private JLabel etiqueta4Fernando;

    private JLabel etiqueta1Walter;
    private JLabel etiqueta2Walter;
    private JLabel etiqueta3Walter;
    private JLabel etiqueta4Walter;

    public LabelFrame(){
        super("Prueba Label");
        setLayout(new FlowLayout());

        // Aarón
        Icon imagenAaron = new ImageIcon(getClass().getResource( "imagenAaron.png"));
        etiqueta1Aaron = new JLabel(
                "Aarón",
                imagenAaron,
                SwingConstants.LEFT);
        etiqueta1Aaron.setToolTipText("Nombre");
        add(etiqueta1Aaron);

        etiqueta2Aaron = new JLabel("Minecraft");
        etiqueta2Aaron.setToolTipText("Gusto");
        etiqueta2Aaron.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta2Aaron.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta2Aaron);

        etiqueta3Aaron = new JLabel("Jugar Videojuegos");
        etiqueta3Aaron.setToolTipText("Pasatiempo");
        add(etiqueta3Aaron);

        etiqueta4Aaron = new JLabel("Gato");
        etiqueta4Aaron.setToolTipText("Mascota");
        add(etiqueta4Aaron);
        
        // QUIQUE

        Icon imagenQuique = new ImageIcon(getClass().getResource("imagenQuique.png"));

        etiqueta1Quique = new JLabel("Enrique", imagenQuique, SwingConstants.LEFT);
        etiqueta1Quique.setToolTipText("Nombre");
        add(etiqueta1Quique);

        etiqueta2Quique = new JLabel("Mole poblano");
        etiqueta2Quique.setToolTipText("Gustos");
        etiqueta2Quique.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta2Quique.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta2Quique);

        etiqueta3Quique = new JLabel("Jugar fubol");
        etiqueta3Quique.setToolTipText("Pasatiempo");
        add(etiqueta3Quique);

        etiqueta4Quique = new JLabel("Roky(perro)");
        etiqueta4Quique.setToolTipText("Mascota");
        add(etiqueta4Quique);

        // Ingrid

        Icon imagenIngrid = new ImageIcon(getClass().getResource("imagenIngrid.png"));

        etiqueta1Ingrid = new JLabel("Ingrid", imagenIngrid, SwingConstants.LEFT);
        etiqueta1Ingrid.setToolTipText("Nombre");
        add(etiqueta1Ingrid);

        etiqueta2Ingrid = new JLabel("Arroz");
        etiqueta2Ingrid.setToolTipText("Gustos");
        etiqueta2Ingrid.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta2Ingrid.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta2Ingrid);

        etiqueta3Ingrid = new JLabel("Escuchar musica");
        etiqueta3Ingrid.setToolTipText("Pasatiempo");
        add(etiqueta3Ingrid);

        etiqueta4Ingrid = new JLabel("Chiquis(perro)");
        etiqueta4Ingrid.setToolTipText("Mascota");
        add(etiqueta4Ingrid);

        // Fernando

        Icon imagen = new ImageIcon(getClass().getResource( "imagenFernando.png"));
        etiqueta1Fernando = new JLabel(
                "Nombre: Fernando Torres Martínez",
                imagen,
                SwingConstants.LEFT);
        etiqueta1Fernando.setToolTipText("Nombre");
        add(etiqueta1Fernando);

        etiqueta2Fernando = new JLabel("Gustos: Burritos, Fórmula 1");
        etiqueta2Fernando.setToolTipText("Gusto");
        etiqueta2Fernando.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta2Fernando.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta2Fernando);

        etiqueta3Fernando = new JLabel("Pasatiempo: Escuchar música, jugar basket");
        etiqueta3Fernando.setToolTipText("Pasatiempo");
        add(etiqueta3Fernando);

        etiqueta4Fernando = new JLabel("Mascota: Zeus(Perro)");
        etiqueta4Fernando.setToolTipText("Mascota");
        add(etiqueta4Fernando);

        // Walter

        Icon imagenWalter = new ImageIcon(getClass().getResource("imagenWalter.png"));
        etiqueta1Walter = new JLabel(
                "Nombre: Christopher Walter Galicia Flores",
                imagenWalter,
                SwingConstants.LEFT);
        etiqueta1Walter.setToolTipText("NOMBRE");
        add(etiqueta1Walter);

        etiqueta2Walter = new JLabel("Básquet");
        etiqueta2Walter.setToolTipText("GUSTOS");
        add(etiqueta2Walter);

        etiqueta3Walter = new JLabel("Jugar básquet");
        etiqueta3Walter.setToolTipText("PASATIEMPO");
        add(etiqueta3Walter);

        etiqueta4Walter = new JLabel("Mi perrita Canela");
        etiqueta4Walter.setToolTipText("MASCOTA");
        add(etiqueta4Walter);
    }
}
