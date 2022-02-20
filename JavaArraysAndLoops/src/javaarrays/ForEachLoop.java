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
public class ForEachLoop {
    public void arrayLoops(){
        float []marks = {12.5f, 13.4f, 12.2f};
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
        for(float element: marks){
             System.out.println(element);
         }
    }
}
