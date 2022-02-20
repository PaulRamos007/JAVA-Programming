package shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {

    private double radius;
    double pi = Math.PI;
    
   

    public Circle(String colour, double radius) {
        super("circle", colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double calcArea(){
        double area = pi * Math.pow(radius, 2);
        
       // return area;
       return BigDecimal.valueOf(area).setScale(3, RoundingMode.HALF_DOWN).doubleValue();
    
    }
     @Override
    public String format() {
        // Type=X, Colour=Y, Radius=Z
//        String res = "";
//        
//        res += "Type = Circle";
//        res += ", Colour = " + getColour();
//        res += ", Radius = " + radius;
//        return res;

        String res = super.format();
        res += ", Radius = " + radius + " , Area = " + calcArea();
        return res;

    }
}
