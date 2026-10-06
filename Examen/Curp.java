package Examen;
// Imports de Java
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
// Clase CURP
public class Curp extends JFrame {
    // Campos de texto
    private JTextField nombrecampotexto;
    private JTextField primerapellidocampotexto;
    private JTextField segundoapellidocampotexto;
    private JTextField fechanacimientocampotexto;
    private JTextField sexocampotexto;
    private JTextField estadocampotexto;
    // Labels
    private JLabel nombrelabel;
    private JLabel primerapellidolabel;
    private JLabel segundoapellidolabel;
    private JLabel fechanacimientoLabel;
    private JLabel sexoLabel;
    private JLabel estadoLabel;
    // Buttons
    private JButton continuar;
    // Ventana
    public Curp() {
        super("Obtener CURP"); // Titulo de la ventana
        setLayout(new GridLayout(7, 2, 8, 8)); // Tipo de layout con espacio

        nombrelabel = new JLabel("Nombre(s):");
        add(nombrelabel);
        nombrecampotexto = new JTextField(15);
        add(nombrecampotexto);
        primerapellidolabel = new JLabel("Primer Apellido:");
        add(primerapellidolabel);
        primerapellidocampotexto = new JTextField(15);
        add(primerapellidocampotexto);
        segundoapellidolabel = new JLabel("Segundo Apellido:");
        add(segundoapellidolabel);
        segundoapellidocampotexto = new JTextField(15);
        add(segundoapellidocampotexto);
        fechanacimientoLabel = new JLabel("Fecha de nacimiento (DD/MM/AAAA):");
        add(fechanacimientoLabel);
        fechanacimientocampotexto = new JTextField(15);
        add(fechanacimientocampotexto);
        sexoLabel = new JLabel("Sexo (H/M):");
        add(sexoLabel);
        sexocampotexto = new JTextField(15);
        add(sexocampotexto);
        estadoLabel = new JLabel("Clave de Estado (ej. PL, MC, DF):");
        add(estadoLabel);
        estadocampotexto = new JTextField(15);
        add(estadocampotexto);
        continuar = new JButton("Continuar");
        add(continuar);

        ManejadorBoton manejador = new ManejadorBoton();
        continuar.addActionListener(manejador);
    }
    
    public class ManejadorBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            String curp = "";
            String nombre = nombrecampotexto.getText();
            String primerapellido = primerapellidocampotexto.getText();
            String segundoapellido = segundoapellidocampotexto.getText();
            String fechanacimiento = fechanacimientocampotexto.getText();
            String sexo = sexocampotexto.getText();
            String estado = estadocampotexto.getText();
            //Primer apellido
            curp += primerapellido.charAt(0);
            for (int i = 1; i < primerapellido.length(); i++) {
                char letra = primerapellido.charAt(i);
                if (letra == 'A' || letra == 'E' ||
                        letra == 'I' || letra == 'O' ||
                        letra == 'U' ||
                        letra == 'a' || letra == 'e' ||
                        letra == 'i' || letra == 'o' ||
                        letra == 'u') {

                    curp += letra;
                    break;
                }
            }
            curp += segundoapellido.charAt(0); //Segundo apellido
            curp += nombre.charAt(0);//Nombre
            //Fecha
            String[] fecha = fechanacimiento.split("/");
            String dia = fecha[0];
            String mes = fecha[1];
            String anio = fecha[2];
            curp += anio.substring(2,4);
            curp += mes;
            curp += dia;
            //Sexo
            curp += sexo.toUpperCase();
            //Estado
            curp += estado.charAt(0);
            curp += estado.charAt(1);
            //Mostrar CURP
            JOptionPane.showMessageDialog(null, "CURP: " + curp.toUpperCase());
        }
    }
}