/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapp;

/**
 *
 * @author paula
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        
        System.out.println("Paul Ramos");
        
        HelloAddittion myAddittion = new HelloAddittion();
        myAddittion.addittion();
        
        HelloString myString = new HelloString();
        myString.stringInput();
        
        HelloDataType myData = new HelloDataType();
        myData.checkData();
    }
}
