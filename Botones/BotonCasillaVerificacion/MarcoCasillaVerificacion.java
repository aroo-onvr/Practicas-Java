package Botones.BotonCasillaVerificacion;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame
{
    private JTextField campoTexto;

    private JCheckBox negritaCheckBox;
    private JCheckBox cursivaCheckBox;

    public MarcoCasillaVerificacion()
    {
        super("Prueba de CheckBox");

        setLayout(new FlowLayout());

        campoTexto = new JTextField("Texto de ejemplo", 20);
        add(campoTexto);

        negritaCheckBox = new JCheckBox("Negrita");
        add(negritaCheckBox);

        cursivaCheckBox = new JCheckBox("Cursiva");
        add(cursivaCheckBox);

        ItemListener manejador = new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent evento)
            {
                int estilo = Font.PLAIN;

                if (negritaCheckBox.isSelected())
                {
                    estilo = Font.BOLD;
                }

                if (cursivaCheckBox.isSelected())
                {
                    estilo = estilo | Font.ITALIC;
                }

                campoTexto.setFont(new Font("Arial", estilo, 20));
            }
        };

        negritaCheckBox.addItemListener(manejador);
        cursivaCheckBox.addItemListener(manejador);
    }

    public static void main(String[] args)
    {
        MarcoCasillaVerificacion ventana = new MarcoCasillaVerificacion();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 150);
        ventana.setVisible(true);
    }
}