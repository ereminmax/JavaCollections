package com.omeg.tk.figur;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Максим on 20.12.2016.
 */
public class JSquare extends JComponent {
    int a, b;
    Color color;

    public JSquare(int a, int b, Color color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawRect(a, b, 100, 100);
    }
}
