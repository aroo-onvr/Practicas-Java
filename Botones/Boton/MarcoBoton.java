package Botones.Boton;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoBoton extends JFrame 
{
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;

    public MarcoBoton()
    {
        super("Prueba de botones");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton simple");
        add(botonJButtonSimple);
        
        Icon imagen1 = new ImageIcon(getClass().getResource("imagen1.png"));
        Icon imagen2 = new ImageIcon(getClass().getResource("imagen2.png"));
        botonJButtonElegante = new JButton("Boton elegante", imagen1);
        botonJButtonElegante.setRolloverIcon(imagen2);
        add(botonJButtonElegante);
        
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    private class ManejadorBoton implements ActionListener
    {
        @Override 
        public void actionPerformed(ActionEvent evento)
        {
            JOptionPane.showMessageDialog(MarcoBoton.this,String.format("Usted oprimio: %s", evento.getActionCommand()));
        }
    
        
    }
    


}