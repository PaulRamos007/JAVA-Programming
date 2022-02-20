/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author paula
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> listA = new ArrayList<>();
        
        listA.add(7);
        listA.add("Hello");
        listA.add(true);
        
        System.out.println("Here are the elements of ListA");
        for (Object o : listA){
            System.out.println(o);
        }
        System.out.println("");
        System.out.println(listA.get(0));
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(17);
        num.add(22);
        num.add(32);
        num.add(57);
        num.add(45);
        
        System.out.println("Here are the elements of nums");
        for (int i = 0; i < num.size(); i++) {
            int myNum = num.get(i);
            System.out.println(myNum);
        }
        
        System.out.println("");
        
        
        //Some useful methods
        
        System.out.println("Num.size gives you the size of the arraylist " + num.size());
        int key = 17;
        System.out.println("Num.contains is used to check whether an element is in my array " + num.contains(key));
        System.out.println("How many times " + key + " is in my ArrayList " + Collections.frequency(num, key));
        System.out.println("At what index is the first occurence of a particular number " + num.indexOf(key));
        System.out.println("At what position is the last occurence of a particular number " + num.lastIndexOf(key));
        System.out.println("Getting the value of any index " + num.get(2));
        System.out.println("Getting the max value of an ArrayList " + Collections.max(num));
        System.out.println("Getting the min value of an ArrayList " + Collections.min(num));
        
        //Methods the can change the list
        num.set(0, 44);
        System.out.println("After using num.set the arraylist looks like this " + (num));
        
        num.remove(0);
        System.out.println("After using remove our arraylist will look like this " + (num));
        
        Collections.shuffle(num);
        System.out.println("After using shuffle our arraylist will look like this " + (num));
        
        Collections.reverse(num);
        System.out.println("After using reverse our arraylist will look like this " + (num));
        
        Collections.sort(num);
        System.out.println("After using sort our arraylist will look like this " + (num));
        
        num.clear();
        System.out.println("After using clear our arraylist will look like this " + (num));
        
        System.out.println("Is my arraylist empty " + num.isEmpty());
        
        System.out.println("");
        
        System.out.println("Using frequency method on object list " + Collections.frequency(listA, "Hello"));
        
    }
    
}
