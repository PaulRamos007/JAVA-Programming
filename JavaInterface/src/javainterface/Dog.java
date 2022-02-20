/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterface;

/**
 *
 * @author paula
 */
public class Dog implements Animal{
    
    @Override
    public void communicate(){
        System.out.println("Barks");
    }
    
    @Override
    public void move(){
        System.out.println("Run");
    }
}
