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
public class Triangle extends GeometricObject {

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

}
