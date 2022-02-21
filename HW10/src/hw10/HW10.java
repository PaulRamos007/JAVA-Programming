/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class HW10 {

    enum Days{
        MONDAY("7-7"), TUESDAY("7-7"), WEDNESDAY("7-7"), THURSDAY("7-7"), FRIDAY("7-7"), SATURDAY("12-6"), SUNDAY("10-5");
        
        private String hours;

        private Days(String hours) {
            this.hours = hours;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Days selectedDay;
        String userInput = "";
        
        for (Days day : Days.values())
            System.out.println(day);
        
        System.out.println("\nPlease select a day: ");
        userInput = input.nextLine().toUpperCase();
        
        selectedDay = Days.valueOf(userInput);
        
        System.out.println("Business hours: " + selectedDay + ": " + selectedDay.hours);
    }
    
}
