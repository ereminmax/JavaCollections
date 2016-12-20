package com.omeg.tk.figur;

/**
 * Created by jacksolovey on 11.03.2016.
 */
public class Ellips extends Shape {
    public Ellips(int a, int b) {
        super(a, b);
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.max(a, b) * Math.min(a, b) * 0.25;
    }

    @Override
    public String getName() {
        return this.getClass().toString();
    }
}