package com.omeg.tk.figur;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Masha
 */
public abstract class Shape {
    protected int a, b;
    public int getA() {
        return this.a;
    }
    public int getB() {
        return this.b;
    }
    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract double getSquare();
    public abstract String getName();
}
