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

}
