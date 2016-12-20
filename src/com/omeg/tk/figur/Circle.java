package com.omeg.tk.figur;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Еремин_МВ
 */
public class Circle extends Shape {
    public Circle(int a, int b) {
        super(a, b);
    }
    
    @Override
    public double getSquare() {
        double r = (double)Math.min(a, b) / 2;
        return 2 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public String getName() {
        return Circle.class.toString();
    }
}
