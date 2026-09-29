package DatosConsola;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su especialidad: ");
        String especialidad = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        String edad = scanner.nextLine();
        System.out.print("Ingrese su comida favorita: ");
        String comidaFavorita = scanner.nextLine();
        System.out.print("Ingrese su pasatiempo favorito: ");
        String pasatiempoFavorito = scanner.nextLine();

        scanner.close();

        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Edad: " + edad);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("Pasatiempo Favorito: " + pasatiempoFavorito);
    }
}
