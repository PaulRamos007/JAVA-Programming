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
public abstract class Animal {
    
    public abstract void communicate();
    
    public abstract void move();
    
    public void weirdFeature(){
        System.out.println("This is a weird feature");
    }
}
