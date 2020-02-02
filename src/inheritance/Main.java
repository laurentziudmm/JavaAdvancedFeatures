package inheritance;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Andrei",9);
        Trainer trainer = new Trainer("Marius",8.5F);
        Person person = new Student("Alex",34);

        trainer.growRating();

        System.out.println(person.getName());
        System.out.println(trainer.getName()+ " " + trainer.getRating());
        System.out.println(student.getName() + " " + student.getGrade());

        person.walk();
        trainer.walk();
        student.walk();

        System.out.println(person.toString());
        System.out.println(trainer.toString());
        System.out.println(student.toString());

    }
}
