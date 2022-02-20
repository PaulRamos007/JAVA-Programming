/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloapp;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class HelloString {
    public void stringInput(){
    Scanner myScan = new Scanner(System.in);
    
    System.out.println("Enter your first name");
    
    String str = myScan.next();
    
    System.out.println(str);
    }
}
