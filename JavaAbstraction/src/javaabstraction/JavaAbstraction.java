/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstraction;

/**
 *
 * @author paula
 */
public class JavaAbstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal doberman = new Dog();
        doberman.communicate();
        doberman.move();
        
        Animal sparrow = new Bird();
        sparrow.move();
        
        Animal labrador = new Dog();
        labrador.move();
        labrador.weirdFeature();
    }
    
}
