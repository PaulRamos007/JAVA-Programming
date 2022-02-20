/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacomposition;

import java.awt.Dimension;

/**
 *
 * @author paula
 */
public class JavaComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimensions dimensions = new Dimensions(20, 200, 7);
        Resolution basicResolution = new Resolution(1280, 1200);
        Case myCase = new Case("2270", "Asus", "240w", dimensions);
        Monitor monitor = new Monitor("2214", "HP", 25, basicResolution);
        Motherboard motherboard = new Motherboard("2222", "AMD", "16 gb", "PCIE");
        
        PC myPC = new PC(myCase, monitor, motherboard);
        
        myPC.getMonitor().createPixelAt(10, 10, "blue");
        myPC.getMotherboard().loadProgram("Microsoft Word");
        myPC.getMyCase().pressPowerButton();
    }
    
}
