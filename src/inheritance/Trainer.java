package inheritance;

public class Trainer extends  Person {

    private int rating;

    public int getRating() {
        return rating;
    }

    public Trainer(String name, int rating) {
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


}
