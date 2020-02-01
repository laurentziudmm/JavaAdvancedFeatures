package encapsulation;

public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private int weight;

    public Dog (String name , int age, String gender , String race , int weight) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog (String gender , String race ){

        this("Azorel",0,gender,race,1);
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void print (){

        System.out.println( name + " Age: " +  age  +  " Gender: " + gender + " Race: " + race  + " Weight: " + weight);
    }

    public void setName (String newName) {

        this.name = newName;
    }
}
