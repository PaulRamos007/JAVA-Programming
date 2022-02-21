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
public class HW9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeometricObject square = new Square(4);
        System.out.println("Square: " + square.toString());
        System.out.println("--------------");
        
        GeometricObject triangle = new Triangle(3);
        System.out.println("Triangle: " + triangle.toString());
        System.out.println("--------------");
    }
    
}
