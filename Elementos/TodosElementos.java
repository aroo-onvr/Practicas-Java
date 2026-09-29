package Elementos;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TodosElementos extends JFrame {

    private final JButton boton;
    private final JCheckBox casilla;
    private final JRadioButton opcion;
    private final JLabel etiqueta;
    private final JTextField campoTexto;
    private final JPasswordField campoContraseña;

    public TodosElementos() {

        super("Prueba de Componentes");
        setLayout(new FlowLayout());

        etiqueta = new JLabel("Ingrese sus datos:");
        add(etiqueta);

        campoTexto = new JTextField("Texto", 15);
        add(campoTexto);

        campoContraseña = new JPasswordField(15);
        add(campoContraseña);

        casilla = new JCheckBox("Aceptar");
        add(casilla);

        opcion = new JRadioButton("Opción");
        add(opcion);

        boton = new JButton("Mostrar");
        add(boton);

        casilla.addItemListener(new ManejadorComponentes());
        opcion.addItemListener(new ManejadorComponentes());
        boton.addItemListener(new ManejadorComponentes());

    }

    public class ManejadorComponentes implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent evento) {

            if (evento.getSource() == casilla) {

                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    etiqueta.setText("Casilla seleccionada");
                } else {
                    etiqueta.setText("Casilla no seleccionada");
                }
            }

            if (evento.getSource() == opcion) {

                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    etiqueta.setText("Opción seleccionada");
                } else {
                    etiqueta.setText("Opción no seleccionada");
                }
            }

            if (evento.getSource() == boton) {

                JOptionPane.showMessageDialog(TodosElementos.this, "Texto: " + campoTexto.getText());
            }
        }
    }
}