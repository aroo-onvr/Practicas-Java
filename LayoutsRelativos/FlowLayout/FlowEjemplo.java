package LayoutsRelativos.FlowLayout;

import java.awt.*;

public class FlowEjemplo extends Frame {
    private Button b1, b2, b3;

    public FlowEjemplo() {
        setLayout(new FlowLayout());

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");

        add(b1);
        add(b2);
        add(b3);

        setSize(300, 150);
        setVisible(true);
    }
}