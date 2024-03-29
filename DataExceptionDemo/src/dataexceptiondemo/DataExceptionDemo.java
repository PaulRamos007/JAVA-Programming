/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataexceptiondemo;

import cputils.FileUtilsExceptionsThrown;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

/**
 *
 * @author paula
 */
public class DataExceptionDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] lines = null;
        List<SimpleDate> dates = new ArrayList<>();

        //Read data from the file
        //Create date object for valid data
        //Display error message for invalid data
        try {
            lines = FileUtilsExceptionsThrown.readIntoArray("dates.csv");

            for (String s : lines) {
                String[] pieces = s.split(",");

                try {
                    SimpleDate sd = new SimpleDate(
                            Integer.parseInt(pieces[0]),
                            Integer.parseInt(pieces[1]),
                            Integer.parseInt(pieces[2]));
                    dates.add(sd);
                } catch (DateException dex) {
                    System.out.println("Error" + s);
                }
            }
            for (SimpleDate temp : dates) {
                System.out.println(temp.toString());
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Can't find the file. Please provide the corect path");
        }
    }

}
