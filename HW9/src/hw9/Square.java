/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw9;

/**
 *
 * @author paula
 */
public class Square extends GeometricObject {

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

}
