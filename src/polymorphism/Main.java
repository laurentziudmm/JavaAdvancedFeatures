package polymorphism;

public class Main {
    public static void main(String[] args) {


        //nu se extinde usor

        Shape cerc = new Circle(10);
        System.out.println(cerc.toString());
        Shape rectangle = new Rectangle(10,20);
        System.out.println(rectangle.toString());

        Shape rectangle2 = new Rectangle(13,23);
        System.out.println(rectangle2.toString());
        Shape rectangle3 = new Rectangle(15,25);
        System.out.println(rectangle3.toString());


        //se extinde usor

        Shape [] shapes = new Shape[6];
        shapes[0]=new Circle(10);
        shapes[1]=new Rectangle(10,20);
        shapes[2]=new Rectangle(15,25);
        shapes[3]=new Rectangle(11,29);
        shapes[4]=new Circle(23);
        shapes[5]=new Triangle(23,7);

        for (int i = 0; i < shapes.length;  i++) {
            System.out.println(shapes[i].toString());
        }
    }
}
