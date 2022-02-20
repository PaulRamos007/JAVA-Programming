/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvehiclesexample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ella Moldez
 */
public class ArrayListVehiclesExample {

    /**
     * @param args the command line arguments
     */
    
    //no argument constructors
    //parameterized constructors
    public static void main(String[] args) {
        // TODO code application logic here
        VehicleNaive v1 = new VehicleNaive(101, 2017, "Dodge", "caravan", 3000);
        
        VehicleNaive v2 = new VehicleNaive(101, 2017, "Dodge", "caravan", 3000);
        
        System.out.println(v1);
        
        VehicleNaive v3 = v1;
        System.out.println(v3);
        
        System.out.println("Is v1 and v2 equal?: " + v1.equals(v2));
        System.out.println("\nIs v1 and v3 equal?: " + v1.equals(v3));
        
        VehicleProper v4 = new VehicleProper(101, 2017, "Dodge", "Caravan", 30000);
        VehicleProper v5 = new VehicleProper(102, 2018, "Dodge", "Random", 40000);
        
        System.out.println(v4);
        System.out.println(v5);
        
        System.out.println("\nAre these two vehicles equal?: " + v4.equals(v5));
        
        ArrayList<VehicleProper> vehicles = new ArrayList<>();
        vehicles.add(new VehicleProper(101, 2017, "Dodge", "Caravan", 8000));
        vehicles.add(new VehicleProper(102, 2018, "Dodge", "Caravan", 9000));
        vehicles.add(new VehicleProper(103, 2019, "Dodge", "Caravan", 11000));
        vehicles.add(new VehicleProper(101, 2020, "Dodge", "Caravan", 7700));
        vehicles.add(new VehicleProper(105, 2021, "Dodge", "Caravan", 5000));
        vehicles.add(new VehicleProper(106, 2022, "Dodge", "Caravan", 40000));  
        vehicles.add(new VehicleProper(101, 2016, "Dodge", "Caravan", 30000));
        
        System.out.println("****Vehicles");
        for (VehicleProper v: vehicles) {
            System.out.println(v);
        }
        
        VehicleProper tempA = new VehicleProper(103, 2017, "Dodge", "Caravan", 30000);
        System.out.println("\nDoes the list contains 'tempA':  " + vehicles.contains(tempA));
        
        System.out.println("\nFrequency of tempA: " + Collections.frequency(vehicles, tempA));
        
        VehicleProper tempB = new VehicleProper(111, 2017, "Dodge", "Ram", 300000);
        System.out.println("\nDoes the list contains tempB: " + vehicles.contains(tempB));
        
        System.out.println("Lets use collections.shuffle(): ");
        Collections.shuffle(vehicles);
        for (VehicleProper v: vehicles) {
            System.out.println(v);
        }
        
        System.out.println("Lets call collections.sort() ");
        Collections.sort(vehicles);
        
        for(VehicleProper v : vehicles){
            System.out.println(v);
        }
                
    }
    
}
