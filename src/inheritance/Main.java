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

//        person.walk();
//        trainer.walk();
//        student.walk();

        System.out.println(person.toString());
        System.out.println(trainer.toString());
        System.out.println(student.toString());

        Person p = new Student("Alex " , 78);
        Person t = new Trainer("Marian",345.67F);
        Student s = new Student("Andrei",34);
        s.getGrade();
        p.walk();

        //Facem cast

//        Student s2 = (Student) t;
//        s2.getGrade();

    }
}
