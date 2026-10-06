package Elementos;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TodosElementos extends JFrame
{
    private JTextField nombreCampo;
    private JPasswordField contrasenaCampo;
    private JCheckBox negritaCheckBox;
    private JCheckBox cursivaCheckBox;
    private JRadioButton masculinoRadioButton;
    private JRadioButton femeninoRadioButton;
    private JComboBox<String> opcionesComboBox;
    private JLabel textoLabel;

    public TodosElementos()
    {
        setTitle("Prácticas Java");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textoLabel = new JLabel("Nombre:");
        add(textoLabel);

        nombreCampo = new JTextField(15);
        add(nombreCampo);

        add(new JLabel("Contraseña:"));
        contrasenaCampo = new JPasswordField(15);
        add(contrasenaCampo);

        negritaCheckBox = new JCheckBox("Negrita");
        cursivaCheckBox = new JCheckBox("Cursiva");

        add(negritaCheckBox);
        add(cursivaCheckBox);

        masculinoRadioButton = new JRadioButton("Masculino");
        femeninoRadioButton = new JRadioButton("Femenino");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculinoRadioButton);
        grupo.add(femeninoRadioButton);

        add(masculinoRadioButton);
        add(femeninoRadioButton);

        opcionesComboBox = new JComboBox<>();
        opcionesComboBox.addItem("Opción 1");
        opcionesComboBox.addItem("Opción 2");
        opcionesComboBox.addItem("Opción 3");
        add(opcionesComboBox);

        JButton boton = new JButton("Mostrar");
        add(boton);

        boton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nombre = nombreCampo.getText();

                if (nombre.isEmpty())
                {
                    JOptionPane.showMessageDialog(
                        TodosElementos.this,
                        "Escribe tu nombre."
                    );
                }
                else
                {
                    JOptionPane.showMessageDialog(
                        TodosElementos.this,
                        "Hola " + nombre
                    );
                }
            }
        });

        negritaCheckBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                actualizarFuente();
            }
        });

        cursivaCheckBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                actualizarFuente();
            }
        });

        setVisible(true);
    }

    private void actualizarFuente()
    {
        int estilo = Font.PLAIN;

        if (negritaCheckBox.isSelected())
        {
            estilo += Font.BOLD;
        }

        if (cursivaCheckBox.isSelected())
        {
            estilo += Font.ITALIC;
        }

        textoLabel.setFont(new Font("Arial", estilo, 14));
    }

    public static void main(String[] args)
    {
        new TodosElementos();
    }
}
