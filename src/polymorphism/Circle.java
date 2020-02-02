package polymorphism;

public class Circle extends Shape{

    private double diameter ;



    public  Circle (double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString () {
        return "Diameter is: " + diameter;
        //super.toString();
    }

    @Override
    public double calculateArea() {
        return Math.PI*(diameter/2)*(diameter/2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*(diameter/2);
    }
}
