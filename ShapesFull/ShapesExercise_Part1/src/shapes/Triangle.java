package shapes;

public class Triangle extends Shape {

private double base;
private double height;

public Triangle(String colour, double base, double height) {
    super("Rectangle", colour);
    this.base= base;
    this.height=height;
}

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public double calcArea(){
        return 0.5 * base * height;
    
    }
    @Override
    public String format() {
        return super.format() +  ", base=" + base + ", height=" + height + " , Area " + calcArea();
    }

    


}
