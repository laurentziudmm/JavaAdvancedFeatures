package homeWork.exerciceOne.inheritance;

public class Dog extends Animal {

    private String color;
    public boolean bark;



    @Override
    public void dance() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
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
