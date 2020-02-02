package inheritance.exercices;

public class Main {
    public static void main(String[] args) {

        String a = "a";
        String a2 = "a";
        String a3 = new String("a");
        String b = a;
        String c = a2 + a3;
        String d = a3 + b;

        System.out.println("a == a2 -> " + (a==a2));

        System.out.println("a == a3 -> " + (a==a3));

        System.out.println("a == b -> " + (a==b));

        System.out.println("a2 == a3 -> " + (a2==a3));

        System.out.println("c == d -> " + (c==d));

        System.out.println("a.equals(a2) -> " + a.equals(a2));

        System.out.println("a.equals(a3) -> " + a.equals(a3));

        System.out.println("c.equals(d) -> " + c.equals(d));

    }
}
