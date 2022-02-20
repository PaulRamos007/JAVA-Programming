/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.Objects;

/**
 *
 * @author paula
 */
public class ColourFilter implements ShapeFilter {

       private String colour;

    public ColourFilter(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
    
    @Override
    public boolean accept(Shape sh){
        return (sh.getColour().equals(colour));
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.colour);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ColourFilter other = (ColourFilter) obj;
        if (!Objects.equals(this.colour, other.colour)) {
            return false;
        }
        return true;
    }
       
       
    
}
