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
public class Case {
    private String model;
    private String manufacturer;
    private String pSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String pSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.pSupply = pSupply;
        this.dimensions = dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getpSupply() {
        return pSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    
    public void pressPowerButton(){
        System.out.println("The power button is pressed");
    }
}
