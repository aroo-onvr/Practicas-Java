package DatosJOptionPane;

import javax.swing.JOptionPane;

public class Datos
{
    public static void main(String[] args)
    {
        String nombre;
        String especialidad;
        String edad;
        String comidaFavorita;
        String pasatiempoFavorito;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        especialidad = JOptionPane.showInputDialog("Ingrese su especialidad:");

        edad = JOptionPane.showInputDialog("Ingrese su edad:");

        comidaFavorita = JOptionPane.showInputDialog("Ingrese su comida favorita:");

        pasatiempoFavorito = JOptionPane.showInputDialog("Ingrese su pasatiempo favorito:");

        JOptionPane.showMessageDialog(
            null,
            "Nombre: " + nombre +
            "\nEspecialidad: " + especialidad +
            "\nEdad: " + edad +
            "\nComida Favorita: " + comidaFavorita +
            "\nPasatiempo Favorito: " + pasatiempoFavorito
        );
    }
}