/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airportexample;
import cputils.FileUtils;

/**
 *
 * @author Himanshu.Devnani
 */
public class AirportExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AirpotBasic dummyAirport = new AirpotBasic();
        dummyAirport.code = "XYZ";
        dummyAirport.city = "Moncton";
        dummyAirport.country = "UnkownCountry";
        
        System.out.println(dummyAirport);
        // TODO code application logic here
        
        AirportAdvance sj = new AirportAdvance("YSJ", "Saint John", "Canada");
        
        System.out.println(sj.toString());
        
        String city = sj.getCity();
        System.out.println("The city is " + city);
               
     // Read in airport file
     String[] data = FileUtils.readIntoArray("airports.csv");
     AirportAdvance[] airports = new AirportAdvance[data.length];
     
     //create an airport object for each line and store in array
     
       for(int i =0; i<data.length; i++){
           String line = data[i];
           //ADD: Addis Ababa:Ethiopia
           
           String[] pieces = line.split(":");
           AirportAdvance temp = new AirportAdvance(pieces[0], pieces[1], pieces[2]);
           
           airports[i] = temp;
       
       }
       //looping through all airpots and printing them
       for(AirportAdvance a: airports){
           System.out.println(a); //same as a.toString()
       
       }
       //Count the number of airpots in china
        System.out.println("*********************************");
        
        int counter = 0;
        for(AirportAdvance a : airports){
            if(a.getCountry().equals("China")){
                System.out.println(a);
                counter++;
            }
        }
        System.out.println("There are "+ counter + " airpots in china");
    }
        
    }
    

