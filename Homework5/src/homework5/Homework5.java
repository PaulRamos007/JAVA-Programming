/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import cputils.FileUtils;

/**
 *
 * @author paula
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] data = FileUtils.readIntoArray("airports.csv");
        AirportDetails[] airports = new AirportDetails[data.length];

        for (int i = 0; i < data.length; i++) {
            String line = data[i];

            String[] details = line.split(":");
            AirportDetails output = new AirportDetails(details[0], details[1], details[2]);

            airports[i] = output;
        }
        System.out.println("***********************");
        System.out.println("Part 1");
        System.out.println("***********************");
        for (AirportDetails show : airports) {
            System.out.println(show); //SHOW ALL DATA FROM CSV FILE

        }

        System.out.println("***********************");
        System.out.println("Part 2");
        System.out.println("***********************");

        int counter = 0;
        for (AirportDetails usAirports : airports) {
            if (usAirports.getCountry().equals("United States of America")) {
                System.out.println(usAirports.code); //AIRPORT CODE OF ALL US AIRPORTS
                counter++;
            }
        }
        System.out.println("There are " + counter + " airports in United States of America");
    }
}
