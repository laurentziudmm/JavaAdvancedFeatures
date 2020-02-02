package polymorphism;

public class Rectangle extends Shape{

    private  double length;
    private  double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public  String toString () {
        return "Length is:  " + length + " and width is: " + width;
        //super.toString();

    }


}
