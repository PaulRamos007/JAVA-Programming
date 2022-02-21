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
public abstract class GeometricObject implements ICalculable {

    double side;

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Area = " + calcArea() + ", Perimeter = " + getPerimeter();
    }

}
