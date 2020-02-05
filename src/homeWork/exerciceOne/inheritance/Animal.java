package homeWork.exerciceOne.inheritance;

public abstract class Animal {
    private  String name;
    private int age ;
    private int numberOfLegs;
    private boolean vegetarian;

    public Animal(String name ,int age, int numberOfLegs, boolean vegetarian) {
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.vegetarian = vegetarian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }


    public void eat () {
        System.out.println("Animal is Eating");
    }

    @Override
    public String toString () {

        return "Name " + name + " Age: " + age + " NumberOfLegs: " + numberOfLegs + " Vegetarian " + vegetarian;
    }

    public abstract void dance();

}
