/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author paula
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(17);
        num.add(22);
        num.add(32);
        num.add(57);
        num.add(22);
        num.add(45);
        num.add(22);
        
        int select = 22;
        
        System.out.println("Num.size gives you the size of the arraylist " + num.size());
        System.out.println("How many times " + select + " is in my ArrayList " + Collections.frequency(num, select));
        System.out.println("At what index is the first occurence of a particular number " + num.indexOf(select));
        System.out.println("At what position is the last occurence of a particular number " + num.lastIndexOf(select));
        System.out.println("Getting the value of index " + num.get(2));
        System.out.println("Getting the max value of an ArrayList " + Collections.max(num));
        System.out.println("Getting the min value of an ArrayList " + Collections.min(num));
    }
    
}
