package LayoutsRelativos.BorderLayout;

import java.awt.*;

public class BorderEjemplo extends Frame {
    private Button bNorte, bSur, bEste, bOeste, bCentro;

    public BorderEjemplo() {
        setLayout(new BorderLayout());

        bNorte = new Button("Norte");
        bSur = new Button("Sur");
        bEste = new Button("Este");
        bOeste = new Button("Oeste");
        bCentro = new Button("Centro");

        add(bNorte, BorderLayout.NORTH);
        add(bSur, BorderLayout.SOUTH);
        add(bEste, BorderLayout.EAST);
        add(bOeste, BorderLayout.WEST);
        add(bCentro, BorderLayout.CENTER);
    }
}