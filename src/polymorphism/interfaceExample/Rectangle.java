package polymorphism.interfaceExample;

public class Rectangle implements IShape,Drawable {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle ..... ");
    }
}
