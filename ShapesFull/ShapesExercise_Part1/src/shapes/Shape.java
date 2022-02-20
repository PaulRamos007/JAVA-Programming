package shapes;

public abstract class Shape implements Formattable{

    
    public abstract double calcArea();
    private String type;
    private String colour;

    public Shape(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String format() {
        return "Type = " + type + ", Colour = " + colour;
    }
    
} // end class Shape
