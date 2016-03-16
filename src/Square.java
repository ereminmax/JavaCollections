/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Masha
 */
public class Square extends Shape {
    public Square(int a, int b) {
        super(a, b);
    }
    
    @Override
    public double getSquare() {
        return b*b; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return Square.class.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
