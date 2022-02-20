/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Himanshu.Devnani
 */
public class simpleNumberException {
    
    public static void main(String[] args) {
        
        try{
            String str = "fgh";
            int Num1 = Integer.parseInt(str);
            System.out.println(Num1);
    }catch(NumberFormatException e){
            System.out.println(e);
 
    }
        System.out.println("This code will execute after exception");
    
    }
    
}
