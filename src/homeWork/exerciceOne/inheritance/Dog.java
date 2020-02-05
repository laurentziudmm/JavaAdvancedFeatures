package homeWork.exerciceOne.inheritance;

public class Dog extends Animal {

    private String color;
    public String bark;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int age, int numberOfLegs, boolean vegetarian, String color) {
        super(name, age, numberOfLegs, vegetarian);
        this.color = color;
    }

    @Override
    public String toString() {
        return " Age: " + getAge() + " NumberOfLegs: " + getNumberOfLegs() + " vegetarian " + isVegetarian() + " color " + color;
    }

}
