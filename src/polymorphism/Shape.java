package polymorphism;

public abstract class Shape {

    public abstract double calculateArea();
    public abstract double calculatePerimeter();


    public void concreateMethod () {

        System.out.println("Hello from shape");
    }

}
