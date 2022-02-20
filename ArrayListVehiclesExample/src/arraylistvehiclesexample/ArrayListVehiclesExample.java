/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvehiclesexample;

/**
 *
 * @author paula
 */
public class ArrayListVehiclesExample {

    /**
     * @param args the command line arguments
     */
    //No-arg constructors
    //parametized constructors
    public static void main(String[] args) {
        // TODO code application logic here
        VehicleNaive v1 = new VehicleNaive(
                101, 
                2017, 
                "Dodge", 
                "Journey", 
                20000);
        
        VehicleNaive v2 = new VehicleNaive(
                102, 
                2014, 
                "Dodge", 
                "Caravan", 
                50000);
        
        System.out.println(v1);
        
        VehicleNaive v3 = v1;
        System.out.println(v3);
        
        System.out.println("is v1 and v2 equal " + v1.equals(v2));
        System.out.println("is v1 and v3 equal " + v1.equals(v3));
    }
    
}
