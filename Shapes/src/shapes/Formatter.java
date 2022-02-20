/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Himanshu.Devnani
 */

//use interface type as a refrence type
//use interface type as a return type
//use interface type as a method argument
public class Formatter {
    private Formattable[] items;

    public Formatter(Formattable[] items) {
        this.items = items;
    }
    
    public String[] formatAll(){
    
         String[] res = new String[items.length];
         Formattable temp;
         
         for(int i = 0; i<=items.length - 1; i++){
             temp = items[i];
             res[i] = temp.format();
    
    }     
              return res;
}
    public Formattable[] getItems(){
        return items;
        
    }

}

