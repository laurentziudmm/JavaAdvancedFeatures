package polymorphism.interfaceExample;

public class Main {
    public static void main(String[] args) {

        IShape s = new Rectangle(4.5,5.4);
        Rectangle r = new Rectangle(4.5,5.4);

        showShapeConfiguration(r);
        displayOnScreen(r);

        Square sq = new Square(34);
        showShapeConfiguration(sq);
        displayOnScreen(sq);


    }

    public static void displayOnScreen (Drawable d) {

        d.draw();

    }

    public static void showShapeConfiguration (IShape s) {

        System.out.println("Area : " + s.calculateArea());
    }
}
