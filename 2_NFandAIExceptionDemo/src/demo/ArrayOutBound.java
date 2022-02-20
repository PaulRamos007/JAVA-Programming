/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Himanshu.Devnani
 */
public class ArrayOutBound {
    
    public static void main(String[] args) {
        try{
            int[] num = new int[5];
            num[10] = 50;
        
        
        
        }catch(ArrayIndexOutOfBoundsException aoob){
        
            System.out.println(aoob);
        
        }
        System.out.println("This code will execute after exception");
    }
    
}
