package encapsulation;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age must be greater then 0:");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            System.out.println("Weight has to be greater then 0!");
        } else {

            this.weight = weight;
        }
    }

    public Dog(String name, int age, String gender, String race, int weight) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {

        this("Azorel", 0, gender, race, 1);
    }


    public void print() {

        System.out.println(name + " Age: " + age + " Gender: " + gender + " Race: " + race + " Weight: " + weight);
    }

    public void setName(String newName) {

        this.name = newName;
    }
}
