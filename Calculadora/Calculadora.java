package Calculadora;

import java.awt.*;

public class Calculadora extends Frame {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button b0, bSuma, bResta, bMultiplicacion, bDivision, bIgual, bLimpiar;
    private TextField display;

    public Calculadora() {
        setLayout(new BorderLayout());

        display = new TextField();
        add(display, BorderLayout.NORTH);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");

        bSuma = new Button("+");
        bResta = new Button("-");
        bMultiplicacion = new Button("*");
        bDivision = new Button("/");
        bIgual = new Button("=");
        bLimpiar = new Button("C");

        Panel teclado = crearTeclado();
        add(teclado, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private Panel crearTeclado() {
        Panel p = new Panel(new GridLayout(4, 4));

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bSuma);

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bResta);

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bMultiplicacion);

        p.add(bLimpiar);
        p.add(b0);
        p.add(bIgual);
        p.add(bDivision);

        return p;
    }
}