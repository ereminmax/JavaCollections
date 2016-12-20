package com.omeg.tk.figur;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Максим on 20.12.2016.
 */
public class JOval extends JComponent {
    int a, b;
    Color color;

    public JOval(int a, int b, Color color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public void paint(Graphics g) {
        g.clearRect(0, 0, 300, 300);
        g.setColor(color);
        g.drawOval(a, b, 100, 100);
    }
}
