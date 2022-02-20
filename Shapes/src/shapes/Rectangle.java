package shapes;

public class Rectangle extends Shape {

private double length;
private double width;

public Rectangle(String colour, double length, double width) {
    super("Rectangle", colour);
    this.length= length;
    this.width=width;
}

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    @Override
     public double calcArea(){
        return length * width;
    
    }
    @Override
    public String format() {
        return super.format() + ", length=" + length + ", width=" + width + " , Area= " + calcArea();
    }


}
