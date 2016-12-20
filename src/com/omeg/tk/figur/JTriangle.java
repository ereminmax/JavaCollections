package com.omeg.tk.figur;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Максим on 20.12.2016.
 */
public class JTriangle extends JComponent {
    int a, b;
    Point o = new Point(0, 0);
    Color color;

    public JTriangle(int a, int b, Color color) {
        this.a = a * 30;
        this.b = b * 30;
        this.color = color;
    }
    public void paint(Graphics g) {
        g.setColor(color);
        int a2 = a / 2;
        Point p2 = new Point(o.x + a2, o.y + b);
        Point p3 = new Point(o.x + a2, o.y);
        g.drawLine(o.x, o.y, p2.x, p2.y);
        g.drawLine(o.x, o.y, p3.x, p3.y);
        g.drawLine(p2.x, p2.y, p3.x, p3.y);
    }
}
