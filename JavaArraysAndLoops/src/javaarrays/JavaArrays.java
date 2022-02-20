/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarrays;

/**
 *
 * @author paula
 */
public class JavaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayIntro myarrays = new ArrayIntro();
        myarrays.basicArray();
        
        ForEachLoop myloops = new ForEachLoop();
        myloops.arrayLoops();
        
        MultidimensionArray multiarray = new MultidimensionArray();
        multiarray.multiArrays();
        
        WhileLoop myWhile = new WhileLoop();
        myWhile.loopBasic();
        
        DoWhile myDoWhile = new DoWhile();
        myDoWhile.doWhileLoop();
    }
    
}
