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
public class HelloAddittion {
    
    public void addittion(){
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1 = myScan.nextInt();
        
        System.out.println("Enter second number");
        int num2 = myScan.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println(sum);
    }
    
}
