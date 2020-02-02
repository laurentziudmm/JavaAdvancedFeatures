package polymorphism;

public class Triangle extends Shape{
    private double heigth;
    private double base;

    public Triangle (double heigth , double base) {
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    public  String toString () {
        return "Height is: " + heigth + " and base is: " + base;
    }

}
