package RegistroLinea;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Registro extends JFrame{
    private final JTextField nombreJTextField;
    private final JTextField apellidoMaternoJTextField;
    private final JTextField apellidoPaternoJTextField;
    private final JTextField edadJTextField;
    private final JTextField correoelectronicoJTextField;
    private final JTextField telefonoJTextField;
    private final JTextField nacionalidadJTextField;
    private final JTextField curpJTextField;
    private final JTextField codigoPostaTextField;
    private final JTextField generoJTextField;

    private final JLabel nombreJLabel;
    private final JLabel apellidoMaternoJLabel;
    private final JLabel apellidoPaternoJLabel;
    private final JLabel edadJLabel;
    private final JLabel correoelectronicoJLabel;
    private final JLabel telefonoJLabel;
    private final JLabel nacionalidadJLabel;
    private final JLabel curpJLabel;
    private final JLabel codigoPostalJLabel;
    private final JLabel generoJLabel;

    public Registro() {
        super("Registro");
        setLayout(new GridLayout(12, 2)); // 12 rows, 2 columns

        nombreJLabel = new JLabel("Nombre:");
        nombreJTextField = new JTextField();
        apellidoPaternoJLabel = new JLabel("Apellido Paterno:");
        apellidoPaternoJTextField = new JTextField();
        apellidoMaternoJLabel = new JLabel("Apellido Materno:");
        apellidoMaternoJTextField = new JTextField();
        edadJLabel = new JLabel("Edad:");
        edadJTextField = new JTextField();
        correoelectronicoJLabel = new JLabel("Correo Electrónico:");
        correoelectronicoJTextField = new JTextField();
        telefonoJLabel = new JLabel("Teléfono:");
        telefonoJTextField = new JTextField();
        nacionalidadJLabel = new JLabel("Nacionalidad:");
        nacionalidadJTextField = new JTextField();
        curpJLabel = new JLabel("CURP:");
        curpJTextField = new JTextField();
        codigoPostalJLabel = new JLabel("Código Postal:");
        codigoPostaTextField = new JTextField();
        generoJLabel = new JLabel("Género:");
        generoJTextField = new JTextField();

        add(nombreJLabel);
        add(nombreJTextField);
        add(apellidoPaternoJLabel);
        add(apellidoPaternoJTextField);
        add(apellidoMaternoJLabel);
        add(apellidoMaternoJTextField);
        add(edadJLabel);
        add(edadJTextField);
        add(correoelectronicoJLabel);
        add(correoelectronicoJTextField);
        add(telefonoJLabel);
        add(telefonoJTextField);
        add(nacionalidadJLabel);
        add(nacionalidadJTextField);
        add(curpJLabel);
        add(curpJTextField);
        add(codigoPostalJLabel);
        add(codigoPostaTextField);
        add(generoJLabel);
        add(generoJTextField);
    }
}
