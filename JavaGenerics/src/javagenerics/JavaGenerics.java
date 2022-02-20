/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenerics;

import java.util.ArrayList;

/**
 *
 * @author paula
 */
public class JavaGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList numbers = new ArrayList();
        
        numbers.add(14);
        numbers.add(22);
        numbers.add(7);
        numbers.add(17);
        numbers.add("Paul");
        numbers.add(12.7f);
        
        printNumbers(numbers);
    }
    
    private static void printNumbers(ArrayList n){
        for(Object i : n){
            System.out.println((Integer)i*2);
        }
    }
}
