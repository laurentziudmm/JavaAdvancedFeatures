package polymorphism.interfaceExample;

public class Square implements IShape,Drawable {

    private double l;

    public Square (double l) {
        this.l = l;
    }

    @Override
    public double calculateArea() {
        return l * l;
    }

    @Override
    public void draw() {

    }
}
