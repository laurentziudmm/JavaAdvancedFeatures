package inheritance;

public class Trainer extends  Person {

    private float rating;

    public float getRating() {
        return rating;
    }

    public Trainer(String name, float rating) {
        super(name);
        this.rating = rating;
    }

    public void growRating() {
        rating++;
    }

    @Override
    public void walk(){
        System.out.println("Trainer " + getName() + " is walking!");
    }

    @Override
    public String toString () {
        return "Trainer -> " + super.toString() +  " Rating: " + rating;
    }

    @Override
    public void eat() {
        System.out.println("Trainer is eating fast..");
    }


}
