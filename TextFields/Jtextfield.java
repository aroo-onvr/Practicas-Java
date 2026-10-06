package TextFields;

import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Jtextfield extends JFrame {
    private final JTextField campoTexto;
    private final JTextField campoTextoBloqueado;
    private final JPasswordField campoContrasenia;

    public Jtextfield(){
        super("Campos de Texto");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Campo de texto");
        campoTexto.setEditable(false);
        campoTextoBloqueado = new JTextField("Campo de texto bloqueado");
        campoContrasenia = new JPasswordField("Campo de texto contraseña");

        add(campoTexto);
        add(campoTextoBloqueado);
        add(campoContrasenia);
    }
}