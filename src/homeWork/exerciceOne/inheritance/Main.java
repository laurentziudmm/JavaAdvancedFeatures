package homeWork.exerciceOne.inheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Azorel",2,4,true,"rosu");

        dog1.getName();
        dog1.getAge();
        dog1.getColor();
        dog1.getNumberOfLegs();
        dog1.isVegetarian();
        dog1.setBark(true);

        Animal animal1 = new Dog("Balaur",3,8,false,"green");

        System.out.println(dog1.toString());
        System.out.println(animal1.toString());
        System.out.println(dog1.isBark());
        // Cast dog
        ((Dog) animal1).setBark(false);
        System.out.println(((Dog) animal1).isBark());


    }
}
