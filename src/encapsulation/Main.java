package encapsulation;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Gina",3,"Female","Pitbull",3);
        Dog secondDog = new Dog("Male", "Labrador");
        Dog thirdDog = new Dog ("Female","Pitbull");
        Dog fourDog = new Dog ("Female","Pitbull");
        Dog fifthDog = secondDog;
        fifthDog.setName("Labus");

        dog.print();
        secondDog.print();
        thirdDog.print();
        fourDog.print();
        System.out.println("After Setter");
        secondDog.print();
        fifthDog.print();
    }
}
