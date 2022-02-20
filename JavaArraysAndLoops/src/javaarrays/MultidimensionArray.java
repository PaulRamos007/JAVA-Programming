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
public class MultidimensionArray {
    public void multiArrays(){
        int apartments [][] = {{101,200,102}, {102,222,222}, {303,404,475}, {409,909,761}};
        
        for (int i = 0; i < apartments.length; i++) {
            for (int j = 0; j < apartments[i].length; j++) {
                System.out.print(apartments[i][j]);
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
