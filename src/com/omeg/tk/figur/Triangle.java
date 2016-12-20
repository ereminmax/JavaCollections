package com.omeg.tk.figur;

/**
 * Created by jacksolovey on 11.03.2016.
 */
public class Triangle extends Shape {
    public Triangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double getSquare() {
        return 0.5 * Math.min(a, b) * Math.min(a, b);
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }
}
